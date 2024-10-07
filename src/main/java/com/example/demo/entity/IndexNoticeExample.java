package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexNoticeExample {
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

      public Criteria andTitleIsNull() {
         this.addCriterion("title is null");
         return (Criteria)this;
      }

      public Criteria andTitleIsNotNull() {
         this.addCriterion("title is not null");
         return (Criteria)this;
      }

      public Criteria andTitleEqualTo(String value) {
         this.addCriterion("title =", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleNotEqualTo(String value) {
         this.addCriterion("title <>", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleGreaterThan(String value) {
         this.addCriterion("title >", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleGreaterThanOrEqualTo(String value) {
         this.addCriterion("title >=", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleLessThan(String value) {
         this.addCriterion("title <", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleLessThanOrEqualTo(String value) {
         this.addCriterion("title <=", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleLike(String value) {
         this.addCriterion("title like", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleNotLike(String value) {
         this.addCriterion("title not like", value, "title");
         return (Criteria)this;
      }

      public Criteria andTitleIn(List values) {
         this.addCriterion("title in", values, "title");
         return (Criteria)this;
      }

      public Criteria andTitleNotIn(List values) {
         this.addCriterion("title not in", values, "title");
         return (Criteria)this;
      }

      public Criteria andTitleBetween(String value1, String value2) {
         this.addCriterion("title between", value1, value2, "title");
         return (Criteria)this;
      }

      public Criteria andTitleNotBetween(String value1, String value2) {
         this.addCriterion("title not between", value1, value2, "title");
         return (Criteria)this;
      }

      public Criteria andContentIsNull() {
         this.addCriterion("content is null");
         return (Criteria)this;
      }

      public Criteria andContentIsNotNull() {
         this.addCriterion("content is not null");
         return (Criteria)this;
      }

      public Criteria andContentEqualTo(String value) {
         this.addCriterion("content =", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentNotEqualTo(String value) {
         this.addCriterion("content <>", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentGreaterThan(String value) {
         this.addCriterion("content >", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentGreaterThanOrEqualTo(String value) {
         this.addCriterion("content >=", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentLessThan(String value) {
         this.addCriterion("content <", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentLessThanOrEqualTo(String value) {
         this.addCriterion("content <=", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentLike(String value) {
         this.addCriterion("content like", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentNotLike(String value) {
         this.addCriterion("content not like", value, "content");
         return (Criteria)this;
      }

      public Criteria andContentIn(List values) {
         this.addCriterion("content in", values, "content");
         return (Criteria)this;
      }

      public Criteria andContentNotIn(List values) {
         this.addCriterion("content not in", values, "content");
         return (Criteria)this;
      }

      public Criteria andContentBetween(String value1, String value2) {
         this.addCriterion("content between", value1, value2, "content");
         return (Criteria)this;
      }

      public Criteria andContentNotBetween(String value1, String value2) {
         this.addCriterion("content not between", value1, value2, "content");
         return (Criteria)this;
      }

      public Criteria andPublishTimeIsNull() {
         this.addCriterion("publish_time is null");
         return (Criteria)this;
      }

      public Criteria andPublishTimeIsNotNull() {
         this.addCriterion("publish_time is not null");
         return (Criteria)this;
      }

      public Criteria andPublishTimeEqualTo(Date value) {
         this.addCriterion("publish_time =", value, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeNotEqualTo(Date value) {
         this.addCriterion("publish_time <>", value, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeGreaterThan(Date value) {
         this.addCriterion("publish_time >", value, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
         this.addCriterion("publish_time >=", value, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeLessThan(Date value) {
         this.addCriterion("publish_time <", value, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
         this.addCriterion("publish_time <=", value, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeIn(List values) {
         this.addCriterion("publish_time in", values, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeNotIn(List values) {
         this.addCriterion("publish_time not in", values, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeBetween(Date value1, Date value2) {
         this.addCriterion("publish_time between", value1, value2, "publishTime");
         return (Criteria)this;
      }

      public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
         this.addCriterion("publish_time not between", value1, value2, "publishTime");
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

      public Criteria andIstopIsNull() {
         this.addCriterion("isTop is null");
         return (Criteria)this;
      }

      public Criteria andIstopIsNotNull() {
         this.addCriterion("isTop is not null");
         return (Criteria)this;
      }

      public Criteria andIstopEqualTo(Integer value) {
         this.addCriterion("isTop =", value, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopNotEqualTo(Integer value) {
         this.addCriterion("isTop <>", value, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopGreaterThan(Integer value) {
         this.addCriterion("isTop >", value, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("isTop >=", value, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopLessThan(Integer value) {
         this.addCriterion("isTop <", value, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopLessThanOrEqualTo(Integer value) {
         this.addCriterion("isTop <=", value, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopIn(List values) {
         this.addCriterion("isTop in", values, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopNotIn(List values) {
         this.addCriterion("isTop not in", values, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopBetween(Integer value1, Integer value2) {
         this.addCriterion("isTop between", value1, value2, "istop");
         return (Criteria)this;
      }

      public Criteria andIstopNotBetween(Integer value1, Integer value2) {
         this.addCriterion("isTop not between", value1, value2, "istop");
         return (Criteria)this;
      }
   }
}
