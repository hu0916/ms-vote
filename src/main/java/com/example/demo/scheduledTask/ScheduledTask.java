package com.example.demo.scheduledTask;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.XML;
import com.ejlchina.okhttps.HTTP;
import com.example.demo.service.VoteService;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TimeZone;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
   @Resource
   private VoteService voteService;
   final Logger logger = LoggerFactory.getLogger(this.getClass());
   final HTTP http = HTTP.builder().build();

   @Scheduled(
      cron = "0 0/5 * * * ? "
   )
   public void rewardVoter() {
      String response = this.http.sync("https://gtop100.com/home/report1?siteid=104028&pass=a2551530").get().getBody().toString();
      String response1 = response.replaceFirst("<entries>", "<entries><entry><pingusername></pingusername><time></time><ip></ip><uniqueid></uniqueid></entry>");
      JSONObject jsonObject = XML.toJSONObject(response1);
      System.out.println(jsonObject.toString());
      JSONObject data = jsonObject.getJSONObject("data");
      if (data.getInt("errorcode") == 8) {
         this.logger.info(new Timestamp(System.currentTimeMillis()) + "----投票奖励发放系统记录---：没有获取到新投票用户数据");
      } else if (data.getInt("errorcode") == 0) {
         try {
            JSONArray entries = data.getJSONObject("entries").getJSONArray("entry");
            if (entries.size() > 0) {
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
               sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

               for(int i = 0; i < entries.size(); ++i) {
                  String pingusername = entries.getJSONObject(i).getStr("pingusername");
                  if (!StrUtil.isBlank(pingusername)) {
                     String ip = entries.getJSONObject(i).getStr("ip");
                     String UTCtime = entries.getJSONObject(i).getStr("time");
                     Timestamp time = new Timestamp(sdf.parse(UTCtime).getTime());
                     String uniqueid = entries.getJSONObject(i).getStr("uniqueid");
                     boolean flag = this.voteService.queryUserExist(pingusername);
                     if (!flag) {
                        this.logger.error("给不存在的账号投票，用户名是：" + pingusername);
                     } else {
                        String b = this.voteService.verifyVote(pingusername, time);
                        if (b != null) {
                           this.logger.error("接口被异常调用(无法投票状态通过url投票)----信息 用户名：" + pingusername + "---voterIp:" + ip + "--------时间：" + new Timestamp(System.currentTimeMillis()));
                        } else {
                           this.voteService.callbackVote(pingusername, 0, (String)null, ip, uniqueid, time);
                        }
                     }
                  }
               }
            }
         } catch (Exception var15) {
            Exception e = var15;
            this.logger.warn(e.toString());
            this.logger.warn("------一次投票点券发放出错，用户的数据是：" + data.toString());
            logger.error("一次投票点券发放错误，用户的数据是：" + data.toString() + "_-----reason:" + e.getMessage());
         }
      } else {
         this.logger.error("定时发放接口请求后返回异常状态码，errorcode:" + data.getInt("errorcode") + ",异常信息errormessage：" + data.getStr("errormessage") + ",数据entries：" + data.getStr("entries"));
      }

   }

   @Scheduled(
      cron = "0 57 0/1 * * ? "
   )
   public void rewardVoterFix() {
      String response = this.http.sync("https://gtop100.com/home/report2?siteid=104028&pass=a2551530&date=" + (LocalTime.now().getHour() == 0 ? LocalDate.now().minusDays(1L).toString() : LocalDate.now().toString())).get().getBody().toString();
      String response1 = response.replaceFirst("<entries>", "<entries><entry><pingusername></pingusername><time></time><ip></ip><uniqueid></uniqueid></entry>");
      JSONObject jsonObject = XML.toJSONObject(response1);
      System.out.println(jsonObject.toString());
      JSONObject data = jsonObject.getJSONObject("data");
      if (data.getInt("errorcode") == 8) {
         this.logger.info(new Timestamp(System.currentTimeMillis()) + "----投票奖励修正系统记录---：没有获取到新投票用户数据");
      } else if (data.getInt("errorcode") == 0) {
         try {
            JSONArray entries = data.getJSONObject("entries").getJSONArray("entry");
            if (entries.size() > 0) {
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
               sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

               for(int i = 0; i < entries.size(); ++i) {
                  String pingusername = entries.getJSONObject(i).getStr("pingusername");
                  if (!StrUtil.isBlank(pingusername)) {
                     String ip = entries.getJSONObject(i).getStr("ip");
                     String UTCtime = entries.getJSONObject(i).getStr("time");
                     Timestamp time = new Timestamp(sdf.parse(UTCtime).getTime());
                     String uniqueid = entries.getJSONObject(i).getStr("uniqueid");
                     String b = this.voteService.verifyVote(pingusername, time);
                     if (b != null) {
                        this.logger.error("修正系统记录：接口被异常调用(无法投票状态通过url投票)----信息 用户名：" + pingusername + "---voterIp:" + ip + "--------时间：" + new Timestamp(System.currentTimeMillis()));
                     } else {
                        this.voteService.callbackVote(pingusername, 0, (String)null, ip, uniqueid, time);
                     }
                  }
               }
            }
         } catch (Exception var14) {
            Exception e = var14;
            this.logger.warn(e.toString());
            this.logger.warn("修正系统奖励发放错误：------一次投票点券发放出错，用户的数据是：" + data.toString());
            logger.error("自动修正系统：一次投票点券发放错误，将在下一小时重新尝试。如果当前时间超过0点，则为最后一次尝试，请手动重试。用户的数据是：" + data.toString() + "_-----reason:" + e.getMessage());
         }
      } else {
         this.logger.error("定时发放接口请求后返回异常状态码，errorcode:" + data.getInt("errorcode") + ",异常信息errormessage：" + data.getStr("errormessage") + ",数据entries：" + data.getStr("entries"));
      }

   }
}
