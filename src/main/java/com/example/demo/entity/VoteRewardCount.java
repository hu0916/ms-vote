package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class VoteRewardCount implements Serializable {
   private Integer id;
   private String name;
   private Integer basereward;
   private Integer plusreward;
   private Integer totalreward;
   private Integer votenum;
   private Date nexttime;
   private Date votetime;
   private Integer successful;
   private String reason;
   private String voterip;
   private String uniqueid;
   private Integer status;
   private static final long serialVersionUID = 1L;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getBasereward() {
      return this.basereward;
   }

   public void setBasereward(Integer basereward) {
      this.basereward = basereward;
   }

   public Integer getPlusreward() {
      return this.plusreward;
   }

   public void setPlusreward(Integer plusreward) {
      this.plusreward = plusreward;
   }

   public Integer getTotalreward() {
      return this.totalreward;
   }

   public void setTotalreward(Integer totalreward) {
      this.totalreward = totalreward;
   }

   public Integer getVotenum() {
      return this.votenum;
   }

   public void setVotenum(Integer votenum) {
      this.votenum = votenum;
   }

   public Date getNexttime() {
      return this.nexttime;
   }

   public void setNexttime(Date nexttime) {
      this.nexttime = nexttime;
   }

   public Date getVotetime() {
      return this.votetime;
   }

   public void setVotetime(Date votetime) {
      this.votetime = votetime;
   }

   public Integer getSuccessful() {
      return this.successful;
   }

   public void setSuccessful(Integer successful) {
      this.successful = successful;
   }

   public String getReason() {
      return this.reason;
   }

   public void setReason(String reason) {
      this.reason = reason;
   }

   public String getVoterip() {
      return this.voterip;
   }

   public void setVoterip(String voterip) {
      this.voterip = voterip;
   }

   public String getUniqueid() {
      return this.uniqueid;
   }

   public void setUniqueid(String uniqueid) {
      this.uniqueid = uniqueid;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getSimpleName());
      sb.append(" [");
      sb.append("Hash = ").append(this.hashCode());
      sb.append(", id=").append(this.id);
      sb.append(", name=").append(this.name);
      sb.append(", basereward=").append(this.basereward);
      sb.append(", plusreward=").append(this.plusreward);
      sb.append(", totalreward=").append(this.totalreward);
      sb.append(", votenum=").append(this.votenum);
      sb.append(", nexttime=").append(this.nexttime);
      sb.append(", votetime=").append(this.votetime);
      sb.append(", successful=").append(this.successful);
      sb.append(", reason=").append(this.reason);
      sb.append(", voterip=").append(this.voterip);
      sb.append(", uniqueid=").append(this.uniqueid);
      sb.append(", status=").append(this.status);
      sb.append(", serialVersionUID=").append(1L);
      sb.append("]");
      return sb.toString();
   }
}
