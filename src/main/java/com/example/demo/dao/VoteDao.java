package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;

public interface VoteDao {
   Integer verifyUserExist(String username);

   Integer giveACashByUsername(@Param("username") String username, @Param("totalCash") Integer totalCash);

   Integer levelLimitCheck(String username);
}
