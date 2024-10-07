package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class VoteAwaitData implements Serializable {
   private Integer id;
   private String ip;
   private Date time;
   private String uniqueid;
   private String pingusername;
   private Integer givereward;
   private static final long serialVersionUID = 1L;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getIp() {
      return this.ip;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public Date getTime() {
      return this.time;
   }

   public void setTime(Date time) {
      this.time = time;
   }

   public String getUniqueid() {
      return this.uniqueid;
   }

   public void setUniqueid(String uniqueid) {
      this.uniqueid = uniqueid;
   }

   public String getPingusername() {
      return this.pingusername;
   }

   public void setPingusername(String pingusername) {
      this.pingusername = pingusername;
   }

   public Integer getGivereward() {
      return this.givereward;
   }

   public void setGivereward(Integer givereward) {
      this.givereward = givereward;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getSimpleName());
      sb.append(" [");
      sb.append("Hash = ").append(this.hashCode());
      sb.append(", id=").append(this.id);
      sb.append(", ip=").append(this.ip);
      sb.append(", time=").append(this.time);
      sb.append(", uniqueid=").append(this.uniqueid);
      sb.append(", pingusername=").append(this.pingusername);
      sb.append(", givereward=").append(this.givereward);
      sb.append(", serialVersionUID=").append(1L);
      sb.append("]");
      return sb.toString();
   }
}
