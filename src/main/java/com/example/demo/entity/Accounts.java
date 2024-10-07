package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Accounts implements Serializable {
   private Integer id;
   private String name;
   private String password;
   private String pin;
   private String pic;
   private Byte loggedin;
   private Date lastlogin;
   private Date createdat;
   private Date birthday;
   private Boolean banned;
   private String macs;
   private Integer nxcredit;
   private Integer maplepoint;
   private Integer nxprepaid;
   private Byte characterslots;
   private Byte gender;
   private Date tempban;
   private Byte greason;
   private Boolean tos;
   private Integer webadmin;
   private String nick;
   private Integer mute;
   private String email;
   private Integer rewardpoints;
   private Integer votepoints;
   private String hwid;
   private Integer language;
   private String banreason;
   private String sitelogged;
   private String ip;
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

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPin() {
      return this.pin;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPic() {
      return this.pic;
   }

   public void setPic(String pic) {
      this.pic = pic;
   }

   public Byte getLoggedin() {
      return this.loggedin;
   }

   public void setLoggedin(Byte loggedin) {
      this.loggedin = loggedin;
   }

   public Date getLastlogin() {
      return this.lastlogin;
   }

   public void setLastlogin(Date lastlogin) {
      this.lastlogin = lastlogin;
   }

   public Date getCreatedat() {
      return this.createdat;
   }

   public void setCreatedat(Date createdat) {
      this.createdat = createdat;
   }

   public Date getBirthday() {
      return this.birthday;
   }

   public void setBirthday(Date birthday) {
      this.birthday = birthday;
   }

   public Boolean getBanned() {
      return this.banned;
   }

   public void setBanned(Boolean banned) {
      this.banned = banned;
   }

   public String getMacs() {
      return this.macs;
   }

   public void setMacs(String macs) {
      this.macs = macs;
   }

   public Integer getNxcredit() {
      return this.nxcredit;
   }

   public void setNxcredit(Integer nxcredit) {
      this.nxcredit = nxcredit;
   }

   public Integer getMaplepoint() {
      return this.maplepoint;
   }

   public void setMaplepoint(Integer maplepoint) {
      this.maplepoint = maplepoint;
   }

   public Integer getNxprepaid() {
      return this.nxprepaid;
   }

   public void setNxprepaid(Integer nxprepaid) {
      this.nxprepaid = nxprepaid;
   }

   public Byte getCharacterslots() {
      return this.characterslots;
   }

   public void setCharacterslots(Byte characterslots) {
      this.characterslots = characterslots;
   }

   public Byte getGender() {
      return this.gender;
   }

   public void setGender(Byte gender) {
      this.gender = gender;
   }

   public Date getTempban() {
      return this.tempban;
   }

   public void setTempban(Date tempban) {
      this.tempban = tempban;
   }

   public Byte getGreason() {
      return this.greason;
   }

   public void setGreason(Byte greason) {
      this.greason = greason;
   }

   public Boolean getTos() {
      return this.tos;
   }

   public void setTos(Boolean tos) {
      this.tos = tos;
   }

   public Integer getWebadmin() {
      return this.webadmin;
   }

   public void setWebadmin(Integer webadmin) {
      this.webadmin = webadmin;
   }

   public String getNick() {
      return this.nick;
   }

   public void setNick(String nick) {
      this.nick = nick;
   }

   public Integer getMute() {
      return this.mute;
   }

   public void setMute(Integer mute) {
      this.mute = mute;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Integer getRewardpoints() {
      return this.rewardpoints;
   }

   public void setRewardpoints(Integer rewardpoints) {
      this.rewardpoints = rewardpoints;
   }

   public Integer getVotepoints() {
      return this.votepoints;
   }

   public void setVotepoints(Integer votepoints) {
      this.votepoints = votepoints;
   }

   public String getHwid() {
      return this.hwid;
   }

   public void setHwid(String hwid) {
      this.hwid = hwid;
   }

   public Integer getLanguage() {
      return this.language;
   }

   public void setLanguage(Integer language) {
      this.language = language;
   }

   public String getBanreason() {
      return this.banreason;
   }

   public void setBanreason(String banreason) {
      this.banreason = banreason;
   }

   public String getSitelogged() {
      return this.sitelogged;
   }

   public void setSitelogged(String sitelogged) {
      this.sitelogged = sitelogged;
   }

   public String getIp() {
      return this.ip;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getSimpleName());
      sb.append(" [");
      sb.append("Hash = ").append(this.hashCode());
      sb.append(", id=").append(this.id);
      sb.append(", name=").append(this.name);
      sb.append(", password=").append(this.password);
      sb.append(", pin=").append(this.pin);
      sb.append(", pic=").append(this.pic);
      sb.append(", loggedin=").append(this.loggedin);
      sb.append(", lastlogin=").append(this.lastlogin);
      sb.append(", createdat=").append(this.createdat);
      sb.append(", birthday=").append(this.birthday);
      sb.append(", banned=").append(this.banned);
      sb.append(", macs=").append(this.macs);
      sb.append(", nxcredit=").append(this.nxcredit);
      sb.append(", maplepoint=").append(this.maplepoint);
      sb.append(", nxprepaid=").append(this.nxprepaid);
      sb.append(", characterslots=").append(this.characterslots);
      sb.append(", gender=").append(this.gender);
      sb.append(", tempban=").append(this.tempban);
      sb.append(", greason=").append(this.greason);
      sb.append(", tos=").append(this.tos);
      sb.append(", webadmin=").append(this.webadmin);
      sb.append(", nick=").append(this.nick);
      sb.append(", mute=").append(this.mute);
      sb.append(", email=").append(this.email);
      sb.append(", rewardpoints=").append(this.rewardpoints);
      sb.append(", votepoints=").append(this.votepoints);
      sb.append(", hwid=").append(this.hwid);
      sb.append(", language=").append(this.language);
      sb.append(", banreason=").append(this.banreason);
      sb.append(", sitelogged=").append(this.sitelogged);
      sb.append(", ip=").append(this.ip);
      sb.append(", serialVersionUID=").append(1L);
      sb.append("]");
      return sb.toString();
   }
}
