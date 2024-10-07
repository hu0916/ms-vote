package com.example.demo.service;

import java.sql.Timestamp;

public interface VoteService {
   boolean queryUserExist(String username);

   String verifyVote(String username);

   String verifyVote(String username, Timestamp voteTime);

   void callbackVote(String username, Integer Successful, String Reason, String VoterIP, String uniqueid, Timestamp time);
}
