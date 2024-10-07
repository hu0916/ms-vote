package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoteRewardCountExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List oredCriteria = new ArrayList();

   public void setOrderByClause(String orderByClause) {
      this.orderByClause = orderByClause;
   }

   public String getOrderByClause() {
      return this.orderByClause;
   }

   public void setDistinct(boolean distinct) {
      this.distinct = distinct;
   }

   public boolean isDistinct() {
      return this.distinct;
   }

   public List getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public Criteria or() {
      Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public Criteria createCriteria() {
      Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected Criteria createCriteriaInternal() {
      Criteria criteria = new Criteria();
      return criteria;
   }

   public void clear() {
      this.oredCriteria.clear();
      this.orderByClause = null;
      this.distinct = false;
   }

   public static class Criterion {
      private String condition;
      private Object value;
      private Object secondValue;
      private boolean noValue;
      private boolean singleValue;
      private boolean betweenValue;
      private boolean listValue;
      private String typeHandler;

      public String getCondition() {
         return this.condition;
      }

      public Object getValue() {
         return this.value;
      }

      public Object getSecondValue() {
         return this.secondValue;
      }

      public boolean isNoValue() {
         return this.noValue;
      }

      public boolean isSingleValue() {
         return this.singleValue;
      }

      public boolean isBetweenValue() {
         return this.betweenValue;
      }

      public boolean isListValue() {
         return this.listValue;
      }

      public String getTypeHandler() {
         return this.typeHandler;
      }

      protected Criterion(String condition) {
         this.condition = condition;
         this.typeHandler = null;
         this.noValue = true;
      }

      protected Criterion(String condition, Object value, String typeHandler) {
         this.condition = condition;
         this.value = value;
         this.typeHandler = typeHandler;
         if (value instanceof List) {
            this.listValue = true;
         } else {
            this.singleValue = true;
         }

      }

      protected Criterion(String condition, Object value) {
         this(condition, value, (String)null);
      }

      protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
         this.condition = condition;
         this.value = value;
         this.secondValue = secondValue;
         this.typeHandler = typeHandler;
         this.betweenValue = true;
      }

      protected Criterion(String condition, Object value, Object secondValue) {
         this(condition, value, secondValue, (String)null);
      }
   }

   public static class Criteria extends GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List getAllCriteria() {
         return this.criteria;
      }

      public List getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (Criteria)this;
      }

      public Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (Criteria)this;
      }

      public Criteria andIdEqualTo(Integer value) {
         this.addCriterion("id =", value, "id");
         return (Criteria)this;
      }

      public Criteria andIdNotEqualTo(Integer value) {
         this.addCriterion("id <>", value, "id");
         return (Criteria)this;
      }

      public Criteria andIdGreaterThan(Integer value) {
         this.addCriterion("id >", value, "id");
         return (Criteria)this;
      }

      public Criteria andIdGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("id >=", value, "id");
         return (Criteria)this;
      }

      public Criteria andIdLessThan(Integer value) {
         this.addCriterion("id <", value, "id");
         return (Criteria)this;
      }

      public Criteria andIdLessThanOrEqualTo(Integer value) {
         this.addCriterion("id <=", value, "id");
         return (Criteria)this;
      }

      public Criteria andIdIn(List values) {
         this.addCriterion("id in", values, "id");
         return (Criteria)this;
      }

      public Criteria andIdNotIn(List values) {
         this.addCriterion("id not in", values, "id");
         return (Criteria)this;
      }

      public Criteria andIdBetween(Integer value1, Integer value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (Criteria)this;
      }

      public Criteria andIdNotBetween(Integer value1, Integer value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (Criteria)this;
      }

      public Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (Criteria)this;
      }

      public Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (Criteria)this;
      }

      public Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (Criteria)this;
      }

      public Criteria andNameIn(List values) {
         this.addCriterion("name in", values, "name");
         return (Criteria)this;
      }

      public Criteria andNameNotIn(List values) {
         this.addCriterion("name not in", values, "name");
         return (Criteria)this;
      }

      public Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (Criteria)this;
      }

      public Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (Criteria)this;
      }

      public Criteria andBaserewardIsNull() {
         this.addCriterion("baseReward is null");
         return (Criteria)this;
      }

      public Criteria andBaserewardIsNotNull() {
         this.addCriterion("baseReward is not null");
         return (Criteria)this;
      }

      public Criteria andBaserewardEqualTo(Integer value) {
         this.addCriterion("baseReward =", value, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardNotEqualTo(Integer value) {
         this.addCriterion("baseReward <>", value, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardGreaterThan(Integer value) {
         this.addCriterion("baseReward >", value, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("baseReward >=", value, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardLessThan(Integer value) {
         this.addCriterion("baseReward <", value, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardLessThanOrEqualTo(Integer value) {
         this.addCriterion("baseReward <=", value, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardIn(List values) {
         this.addCriterion("baseReward in", values, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardNotIn(List values) {
         this.addCriterion("baseReward not in", values, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardBetween(Integer value1, Integer value2) {
         this.addCriterion("baseReward between", value1, value2, "basereward");
         return (Criteria)this;
      }

      public Criteria andBaserewardNotBetween(Integer value1, Integer value2) {
         this.addCriterion("baseReward not between", value1, value2, "basereward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardIsNull() {
         this.addCriterion("plusReward is null");
         return (Criteria)this;
      }

      public Criteria andPlusrewardIsNotNull() {
         this.addCriterion("plusReward is not null");
         return (Criteria)this;
      }

      public Criteria andPlusrewardEqualTo(Integer value) {
         this.addCriterion("plusReward =", value, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardNotEqualTo(Integer value) {
         this.addCriterion("plusReward <>", value, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardGreaterThan(Integer value) {
         this.addCriterion("plusReward >", value, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("plusReward >=", value, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardLessThan(Integer value) {
         this.addCriterion("plusReward <", value, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardLessThanOrEqualTo(Integer value) {
         this.addCriterion("plusReward <=", value, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardIn(List values) {
         this.addCriterion("plusReward in", values, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardNotIn(List values) {
         this.addCriterion("plusReward not in", values, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardBetween(Integer value1, Integer value2) {
         this.addCriterion("plusReward between", value1, value2, "plusreward");
         return (Criteria)this;
      }

      public Criteria andPlusrewardNotBetween(Integer value1, Integer value2) {
         this.addCriterion("plusReward not between", value1, value2, "plusreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardIsNull() {
         this.addCriterion("totalReward is null");
         return (Criteria)this;
      }

      public Criteria andTotalrewardIsNotNull() {
         this.addCriterion("totalReward is not null");
         return (Criteria)this;
      }

      public Criteria andTotalrewardEqualTo(Integer value) {
         this.addCriterion("totalReward =", value, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardNotEqualTo(Integer value) {
         this.addCriterion("totalReward <>", value, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardGreaterThan(Integer value) {
         this.addCriterion("totalReward >", value, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("totalReward >=", value, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardLessThan(Integer value) {
         this.addCriterion("totalReward <", value, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardLessThanOrEqualTo(Integer value) {
         this.addCriterion("totalReward <=", value, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardIn(List values) {
         this.addCriterion("totalReward in", values, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardNotIn(List values) {
         this.addCriterion("totalReward not in", values, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardBetween(Integer value1, Integer value2) {
         this.addCriterion("totalReward between", value1, value2, "totalreward");
         return (Criteria)this;
      }

      public Criteria andTotalrewardNotBetween(Integer value1, Integer value2) {
         this.addCriterion("totalReward not between", value1, value2, "totalreward");
         return (Criteria)this;
      }

      public Criteria andVotenumIsNull() {
         this.addCriterion("voteNum is null");
         return (Criteria)this;
      }

      public Criteria andVotenumIsNotNull() {
         this.addCriterion("voteNum is not null");
         return (Criteria)this;
      }

      public Criteria andVotenumEqualTo(Integer value) {
         this.addCriterion("voteNum =", value, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumNotEqualTo(Integer value) {
         this.addCriterion("voteNum <>", value, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumGreaterThan(Integer value) {
         this.addCriterion("voteNum >", value, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("voteNum >=", value, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumLessThan(Integer value) {
         this.addCriterion("voteNum <", value, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumLessThanOrEqualTo(Integer value) {
         this.addCriterion("voteNum <=", value, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumIn(List values) {
         this.addCriterion("voteNum in", values, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumNotIn(List values) {
         this.addCriterion("voteNum not in", values, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumBetween(Integer value1, Integer value2) {
         this.addCriterion("voteNum between", value1, value2, "votenum");
         return (Criteria)this;
      }

      public Criteria andVotenumNotBetween(Integer value1, Integer value2) {
         this.addCriterion("voteNum not between", value1, value2, "votenum");
         return (Criteria)this;
      }

      public Criteria andNexttimeIsNull() {
         this.addCriterion("nextTime is null");
         return (Criteria)this;
      }

      public Criteria andNexttimeIsNotNull() {
         this.addCriterion("nextTime is not null");
         return (Criteria)this;
      }

      public Criteria andNexttimeEqualTo(Date value) {
         this.addCriterion("nextTime =", value, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeNotEqualTo(Date value) {
         this.addCriterion("nextTime <>", value, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeGreaterThan(Date value) {
         this.addCriterion("nextTime >", value, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeGreaterThanOrEqualTo(Date value) {
         this.addCriterion("nextTime >=", value, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeLessThan(Date value) {
         this.addCriterion("nextTime <", value, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeLessThanOrEqualTo(Date value) {
         this.addCriterion("nextTime <=", value, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeIn(List values) {
         this.addCriterion("nextTime in", values, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeNotIn(List values) {
         this.addCriterion("nextTime not in", values, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeBetween(Date value1, Date value2) {
         this.addCriterion("nextTime between", value1, value2, "nexttime");
         return (Criteria)this;
      }

      public Criteria andNexttimeNotBetween(Date value1, Date value2) {
         this.addCriterion("nextTime not between", value1, value2, "nexttime");
         return (Criteria)this;
      }

      public Criteria andVotetimeIsNull() {
         this.addCriterion("voteTime is null");
         return (Criteria)this;
      }

      public Criteria andVotetimeIsNotNull() {
         this.addCriterion("voteTime is not null");
         return (Criteria)this;
      }

      public Criteria andVotetimeEqualTo(Date value) {
         this.addCriterion("voteTime =", value, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeNotEqualTo(Date value) {
         this.addCriterion("voteTime <>", value, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeGreaterThan(Date value) {
         this.addCriterion("voteTime >", value, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeGreaterThanOrEqualTo(Date value) {
         this.addCriterion("voteTime >=", value, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeLessThan(Date value) {
         this.addCriterion("voteTime <", value, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeLessThanOrEqualTo(Date value) {
         this.addCriterion("voteTime <=", value, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeIn(List values) {
         this.addCriterion("voteTime in", values, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeNotIn(List values) {
         this.addCriterion("voteTime not in", values, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeBetween(Date value1, Date value2) {
         this.addCriterion("voteTime between", value1, value2, "votetime");
         return (Criteria)this;
      }

      public Criteria andVotetimeNotBetween(Date value1, Date value2) {
         this.addCriterion("voteTime not between", value1, value2, "votetime");
         return (Criteria)this;
      }

      public Criteria andSuccessfulIsNull() {
         this.addCriterion("Successful is null");
         return (Criteria)this;
      }

      public Criteria andSuccessfulIsNotNull() {
         this.addCriterion("Successful is not null");
         return (Criteria)this;
      }

      public Criteria andSuccessfulEqualTo(Integer value) {
         this.addCriterion("Successful =", value, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulNotEqualTo(Integer value) {
         this.addCriterion("Successful <>", value, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulGreaterThan(Integer value) {
         this.addCriterion("Successful >", value, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("Successful >=", value, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulLessThan(Integer value) {
         this.addCriterion("Successful <", value, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulLessThanOrEqualTo(Integer value) {
         this.addCriterion("Successful <=", value, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulIn(List values) {
         this.addCriterion("Successful in", values, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulNotIn(List values) {
         this.addCriterion("Successful not in", values, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulBetween(Integer value1, Integer value2) {
         this.addCriterion("Successful between", value1, value2, "successful");
         return (Criteria)this;
      }

      public Criteria andSuccessfulNotBetween(Integer value1, Integer value2) {
         this.addCriterion("Successful not between", value1, value2, "successful");
         return (Criteria)this;
      }

      public Criteria andReasonIsNull() {
         this.addCriterion("Reason is null");
         return (Criteria)this;
      }

      public Criteria andReasonIsNotNull() {
         this.addCriterion("Reason is not null");
         return (Criteria)this;
      }

      public Criteria andReasonEqualTo(String value) {
         this.addCriterion("Reason =", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonNotEqualTo(String value) {
         this.addCriterion("Reason <>", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonGreaterThan(String value) {
         this.addCriterion("Reason >", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonGreaterThanOrEqualTo(String value) {
         this.addCriterion("Reason >=", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonLessThan(String value) {
         this.addCriterion("Reason <", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonLessThanOrEqualTo(String value) {
         this.addCriterion("Reason <=", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonLike(String value) {
         this.addCriterion("Reason like", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonNotLike(String value) {
         this.addCriterion("Reason not like", value, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonIn(List values) {
         this.addCriterion("Reason in", values, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonNotIn(List values) {
         this.addCriterion("Reason not in", values, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonBetween(String value1, String value2) {
         this.addCriterion("Reason between", value1, value2, "reason");
         return (Criteria)this;
      }

      public Criteria andReasonNotBetween(String value1, String value2) {
         this.addCriterion("Reason not between", value1, value2, "reason");
         return (Criteria)this;
      }

      public Criteria andVoteripIsNull() {
         this.addCriterion("VoterIP is null");
         return (Criteria)this;
      }

      public Criteria andVoteripIsNotNull() {
         this.addCriterion("VoterIP is not null");
         return (Criteria)this;
      }

      public Criteria andVoteripEqualTo(String value) {
         this.addCriterion("VoterIP =", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripNotEqualTo(String value) {
         this.addCriterion("VoterIP <>", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripGreaterThan(String value) {
         this.addCriterion("VoterIP >", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripGreaterThanOrEqualTo(String value) {
         this.addCriterion("VoterIP >=", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripLessThan(String value) {
         this.addCriterion("VoterIP <", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripLessThanOrEqualTo(String value) {
         this.addCriterion("VoterIP <=", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripLike(String value) {
         this.addCriterion("VoterIP like", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripNotLike(String value) {
         this.addCriterion("VoterIP not like", value, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripIn(List values) {
         this.addCriterion("VoterIP in", values, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripNotIn(List values) {
         this.addCriterion("VoterIP not in", values, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripBetween(String value1, String value2) {
         this.addCriterion("VoterIP between", value1, value2, "voterip");
         return (Criteria)this;
      }

      public Criteria andVoteripNotBetween(String value1, String value2) {
         this.addCriterion("VoterIP not between", value1, value2, "voterip");
         return (Criteria)this;
      }

      public Criteria andUniqueidIsNull() {
         this.addCriterion("uniqueid is null");
         return (Criteria)this;
      }

      public Criteria andUniqueidIsNotNull() {
         this.addCriterion("uniqueid is not null");
         return (Criteria)this;
      }

      public Criteria andUniqueidEqualTo(String value) {
         this.addCriterion("uniqueid =", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidNotEqualTo(String value) {
         this.addCriterion("uniqueid <>", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidGreaterThan(String value) {
         this.addCriterion("uniqueid >", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidGreaterThanOrEqualTo(String value) {
         this.addCriterion("uniqueid >=", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidLessThan(String value) {
         this.addCriterion("uniqueid <", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidLessThanOrEqualTo(String value) {
         this.addCriterion("uniqueid <=", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidLike(String value) {
         this.addCriterion("uniqueid like", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidNotLike(String value) {
         this.addCriterion("uniqueid not like", value, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidIn(List values) {
         this.addCriterion("uniqueid in", values, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidNotIn(List values) {
         this.addCriterion("uniqueid not in", values, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidBetween(String value1, String value2) {
         this.addCriterion("uniqueid between", value1, value2, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andUniqueidNotBetween(String value1, String value2) {
         this.addCriterion("uniqueid not between", value1, value2, "uniqueid");
         return (Criteria)this;
      }

      public Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (Criteria)this;
      }

      public Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (Criteria)this;
      }

      public Criteria andStatusEqualTo(Integer value) {
         this.addCriterion("status =", value, "status");
         return (Criteria)this;
      }

      public Criteria andStatusNotEqualTo(Integer value) {
         this.addCriterion("status <>", value, "status");
         return (Criteria)this;
      }

      public Criteria andStatusGreaterThan(Integer value) {
         this.addCriterion("status >", value, "status");
         return (Criteria)this;
      }

      public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("status >=", value, "status");
         return (Criteria)this;
      }

      public Criteria andStatusLessThan(Integer value) {
         this.addCriterion("status <", value, "status");
         return (Criteria)this;
      }

      public Criteria andStatusLessThanOrEqualTo(Integer value) {
         this.addCriterion("status <=", value, "status");
         return (Criteria)this;
      }

      public Criteria andStatusIn(List values) {
         this.addCriterion("status in", values, "status");
         return (Criteria)this;
      }

      public Criteria andStatusNotIn(List values) {
         this.addCriterion("status not in", values, "status");
         return (Criteria)this;
      }

      public Criteria andStatusBetween(Integer value1, Integer value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (Criteria)this;
      }

      public Criteria andStatusNotBetween(Integer value1, Integer value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (Criteria)this;
      }
   }
}
