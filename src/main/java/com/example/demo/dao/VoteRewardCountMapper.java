package com.example.demo.dao;

import com.example.demo.entity.VoteRewardCount;
import com.example.demo.entity.VoteRewardCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteRewardCountMapper {
   long countByExample(VoteRewardCountExample example);

   int deleteByExample(VoteRewardCountExample example);

   int deleteByPrimaryKey(Integer id);

   int insert(VoteRewardCount record);

   int insertSelective(VoteRewardCount record);

   List selectByExample(VoteRewardCountExample example);

   VoteRewardCount selectByPrimaryKey(Integer id);

   int updateByExampleSelective(@Param("record") VoteRewardCount record, @Param("example") VoteRewardCountExample example);

   int updateByExample(@Param("record") VoteRewardCount record, @Param("example") VoteRewardCountExample example);

   int updateByPrimaryKeySelective(VoteRewardCount record);

   int updateByPrimaryKey(VoteRewardCount record);
}
