package com.example.demo.service.impl;

import com.example.demo.dao.VoteDao;
import com.example.demo.dao.VoteRewardCountMapper;
import com.example.demo.entity.VoteRewardCount;
import com.example.demo.entity.VoteRewardCountExample;
import com.example.demo.service.VoteService;
import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VoteServiceImpl implements VoteService {
   final Logger logger = LoggerFactory.getLogger(this.getClass());
   @Resource
   private VoteDao voteDao;
   @Resource
   private VoteRewardCountMapper voteRewardCountMapper;
   @Value("${reward.plusReward}")
   private Integer plusReward;
   @Value("${reward.baseReward}")
   private Integer baseReward;
   @Value("${reward.maxReward}")
   private Integer maxReward;
   @Value("${reward.levelLimit}")
   private Integer levelLimit;
   @Value("${reward.gapTime}")
   private Integer gapTime;

   public boolean queryUserExist(String username) {
      return this.voteDao.verifyUserExist(username) > 0;
   }

   public String verifyVote(String username) {
      Integer maxLevel = this.voteDao.levelLimitCheck(username);
      if (maxLevel < this.levelLimit) {
         return "等级未到达" + this.levelLimit + ",无法从投票获得点券";
      } else {
         VoteRewardCountExample example = new VoteRewardCountExample();
         example.createCriteria().andNameEqualTo(username);
         example.setOrderByClause("voteTime desc");
         List counts = this.voteRewardCountMapper.selectByExample(example);
         if (counts.size() == 0) {
            return null;
         } else {
            VoteRewardCount vote = (VoteRewardCount)counts.get(0);
            long l = System.currentTimeMillis();
            long time = vote.getNexttime().getTime();
            return l > time ? null : "下次vote时间为" + new Timestamp(time) + "以后";
         }
      }
   }

   public String verifyVote(String username, Timestamp voteTime) {
      Integer maxLevel = this.voteDao.levelLimitCheck(username);
      if (maxLevel <= this.levelLimit) {
         this.logger.warn("等级未达到" + this.levelLimit + "，无法从投票获得点券。用户名：" + username);
         return "等级未到达" + this.levelLimit + ",无法从投票获得点券";
      } else {
         VoteRewardCountExample example = new VoteRewardCountExample();
         example.createCriteria().andNameEqualTo(username);
         example.setOrderByClause("voteTime desc");
         List counts = this.voteRewardCountMapper.selectByExample(example);
         if (counts.size() == 0) {
            return null;
         } else {
            VoteRewardCount vote = (VoteRewardCount)counts.get(0);
            long l = System.currentTimeMillis();
            long time = vote.getNexttime().getTime();
            long latestVoteTime = vote.getVotetime().getTime();
            if (voteTime.getTime() - latestVoteTime < (long)(this.gapTime * 60 * 60 * 1000)) {
               this.logger.warn("疑似有多IP给同一用户投票，用户名：" + username);
               return "疑似多用户投票！";
            } else {
               return l > time ? null : "下次vote时间为" + new Timestamp(time) + "以后";
            }
         }
      }
   }

   @Transactional
   public void callbackVote(String username, Integer Successful, String Reason, String VoterIP, String uniqueid, Timestamp time) {
      this.logger.info("---------用户名：" + username + "进入回调函数----------");
      VoteRewardCount vote = new VoteRewardCount();
      vote.setBasereward(this.baseReward);
      vote.setPlusreward(this.plusReward);
      vote.setSuccessful(Successful);
      vote.setReason(Reason);
      vote.setVoterip(VoterIP);
      vote.setUniqueid(uniqueid);
      vote.setVotetime(time);
      vote.setStatus(0);
      long now = System.currentTimeMillis();
      vote.setNexttime(new Timestamp(time.getTime() + (long)(this.gapTime * 60 * 60 * 1000)));
      vote.setName(username);
      VoteRewardCountExample example = new VoteRewardCountExample();
      example.createCriteria().andNameEqualTo(username);
      example.setOrderByClause("voteTime desc");
      List counts = this.voteRewardCountMapper.selectByExample(example);
      if (counts.size() == 0) {
         vote.setVotenum(0);
         vote.setTotalreward(this.baseReward);
         this.voteRewardCountMapper.insert(vote);
         this.logger.info("点券获取修正系统---------用户名：" + username + "---vote获取" + this.baseReward + "点券-----时间：" + new Timestamp(now));
      } else {
         VoteRewardCount count = (VoteRewardCount)counts.get(0);
         long lastVoteTime = count.getVotetime().getTime();
         //46小时 即 22 +24
         if (time.getTime() - lastVoteTime > 165600000L) {
            vote.setVotenum(0);
            vote.setTotalreward(this.baseReward);
            this.voteRewardCountMapper.insert(vote);
            this.logger.info("点券获取修正系统---------用户名：" + username + "---vote获取" + this.baseReward + "点券-----时间：" + new Timestamp(now));
         } else {
            vote.setVotenum(count.getVotenum() + 1);
            Integer sum = this.baseReward + this.plusReward * (count.getVotenum() + 1) > this.maxReward ? this.maxReward : this.baseReward + this.plusReward * (count.getVotenum() + 1);
            vote.setTotalreward(sum);
            this.voteRewardCountMapper.insert(vote);
            this.logger.info("点券获取修正系统---------用户名：" + username + "---vote获取" + vote.getTotalreward() + "点券-----时间：" + new Timestamp(now));
         }
      }

   }
}
