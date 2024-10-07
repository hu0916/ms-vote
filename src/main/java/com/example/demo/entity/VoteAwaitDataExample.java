package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoteAwaitDataExample {
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

      public Criteria andIpIsNull() {
         this.addCriterion("ip is null");
         return (Criteria)this;
      }

      public Criteria andIpIsNotNull() {
         this.addCriterion("ip is not null");
         return (Criteria)this;
      }

      public Criteria andIpEqualTo(String value) {
         this.addCriterion("ip =", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpNotEqualTo(String value) {
         this.addCriterion("ip <>", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpGreaterThan(String value) {
         this.addCriterion("ip >", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpGreaterThanOrEqualTo(String value) {
         this.addCriterion("ip >=", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpLessThan(String value) {
         this.addCriterion("ip <", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpLessThanOrEqualTo(String value) {
         this.addCriterion("ip <=", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpLike(String value) {
         this.addCriterion("ip like", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpNotLike(String value) {
         this.addCriterion("ip not like", value, "ip");
         return (Criteria)this;
      }

      public Criteria andIpIn(List values) {
         this.addCriterion("ip in", values, "ip");
         return (Criteria)this;
      }

      public Criteria andIpNotIn(List values) {
         this.addCriterion("ip not in", values, "ip");
         return (Criteria)this;
      }

      public Criteria andIpBetween(String value1, String value2) {
         this.addCriterion("ip between", value1, value2, "ip");
         return (Criteria)this;
      }

      public Criteria andIpNotBetween(String value1, String value2) {
         this.addCriterion("ip not between", value1, value2, "ip");
         return (Criteria)this;
      }

      public Criteria andTimeIsNull() {
         this.addCriterion("time is null");
         return (Criteria)this;
      }

      public Criteria andTimeIsNotNull() {
         this.addCriterion("time is not null");
         return (Criteria)this;
      }

      public Criteria andTimeEqualTo(Date value) {
         this.addCriterion("time =", value, "time");
         return (Criteria)this;
      }

      public Criteria andTimeNotEqualTo(Date value) {
         this.addCriterion("time <>", value, "time");
         return (Criteria)this;
      }

      public Criteria andTimeGreaterThan(Date value) {
         this.addCriterion("time >", value, "time");
         return (Criteria)this;
      }

      public Criteria andTimeGreaterThanOrEqualTo(Date value) {
         this.addCriterion("time >=", value, "time");
         return (Criteria)this;
      }

      public Criteria andTimeLessThan(Date value) {
         this.addCriterion("time <", value, "time");
         return (Criteria)this;
      }

      public Criteria andTimeLessThanOrEqualTo(Date value) {
         this.addCriterion("time <=", value, "time");
         return (Criteria)this;
      }

      public Criteria andTimeIn(List values) {
         this.addCriterion("time in", values, "time");
         return (Criteria)this;
      }

      public Criteria andTimeNotIn(List values) {
         this.addCriterion("time not in", values, "time");
         return (Criteria)this;
      }

      public Criteria andTimeBetween(Date value1, Date value2) {
         this.addCriterion("time between", value1, value2, "time");
         return (Criteria)this;
      }

      public Criteria andTimeNotBetween(Date value1, Date value2) {
         this.addCriterion("time not between", value1, value2, "time");
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

      public Criteria andPingusernameIsNull() {
         this.addCriterion("pingusername is null");
         return (Criteria)this;
      }

      public Criteria andPingusernameIsNotNull() {
         this.addCriterion("pingusername is not null");
         return (Criteria)this;
      }

      public Criteria andPingusernameEqualTo(String value) {
         this.addCriterion("pingusername =", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameNotEqualTo(String value) {
         this.addCriterion("pingusername <>", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameGreaterThan(String value) {
         this.addCriterion("pingusername >", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameGreaterThanOrEqualTo(String value) {
         this.addCriterion("pingusername >=", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameLessThan(String value) {
         this.addCriterion("pingusername <", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameLessThanOrEqualTo(String value) {
         this.addCriterion("pingusername <=", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameLike(String value) {
         this.addCriterion("pingusername like", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameNotLike(String value) {
         this.addCriterion("pingusername not like", value, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameIn(List values) {
         this.addCriterion("pingusername in", values, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameNotIn(List values) {
         this.addCriterion("pingusername not in", values, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameBetween(String value1, String value2) {
         this.addCriterion("pingusername between", value1, value2, "pingusername");
         return (Criteria)this;
      }

      public Criteria andPingusernameNotBetween(String value1, String value2) {
         this.addCriterion("pingusername not between", value1, value2, "pingusername");
         return (Criteria)this;
      }

      public Criteria andGiverewardIsNull() {
         this.addCriterion("giveReward is null");
         return (Criteria)this;
      }

      public Criteria andGiverewardIsNotNull() {
         this.addCriterion("giveReward is not null");
         return (Criteria)this;
      }

      public Criteria andGiverewardEqualTo(Integer value) {
         this.addCriterion("giveReward =", value, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardNotEqualTo(Integer value) {
         this.addCriterion("giveReward <>", value, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardGreaterThan(Integer value) {
         this.addCriterion("giveReward >", value, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("giveReward >=", value, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardLessThan(Integer value) {
         this.addCriterion("giveReward <", value, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardLessThanOrEqualTo(Integer value) {
         this.addCriterion("giveReward <=", value, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardIn(List values) {
         this.addCriterion("giveReward in", values, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardNotIn(List values) {
         this.addCriterion("giveReward not in", values, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardBetween(Integer value1, Integer value2) {
         this.addCriterion("giveReward between", value1, value2, "givereward");
         return (Criteria)this;
      }

      public Criteria andGiverewardNotBetween(Integer value1, Integer value2) {
         this.addCriterion("giveReward not between", value1, value2, "givereward");
         return (Criteria)this;
      }
   }
}
