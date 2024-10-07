package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class IndexNotice implements Serializable {
   private Integer id;
   private String title;
   private String content;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date publishTime;
   private Integer status;
   private Integer istop;
   private static final long serialVersionUID = 1L;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public Date getPublishTime() {
      return this.publishTime;
   }

   public void setPublishTime(Date publishTime) {
      this.publishTime = publishTime;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getIstop() {
      return this.istop;
   }

   public void setIstop(Integer istop) {
      this.istop = istop;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getSimpleName());
      sb.append(" [");
      sb.append("Hash = ").append(this.hashCode());
      sb.append(", id=").append(this.id);
      sb.append(", title=").append(this.title);
      sb.append(", content=").append(this.content);
      sb.append(", publishTime=").append(this.publishTime);
      sb.append(", status=").append(this.status);
      sb.append(", istop=").append(this.istop);
      sb.append(", serialVersionUID=").append(1L);
      sb.append("]");
      return sb.toString();
   }
}
