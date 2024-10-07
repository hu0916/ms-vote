package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccountsExample {
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

      protected void addCriterionForJDBCDate(String condition, Date value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.addCriterion(condition, new java.sql.Date(value.getTime()), property);
         }
      }

      protected void addCriterionForJDBCDate(String condition, List values, String property) {
         if (values != null && values.size() != 0) {
            List dateList = new ArrayList();
            Iterator iter = values.iterator();

            while(iter.hasNext()) {
               dateList.add(new java.sql.Date(((Date)iter.next()).getTime()));
            }

            this.addCriterion(condition, dateList, property);
         } else {
            throw new RuntimeException("Value list for " + property + " cannot be null or empty");
         }
      }

      protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
         if (value1 != null && value2 != null) {
            this.addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

      public Criteria andPasswordIsNull() {
         this.addCriterion("password is null");
         return (Criteria)this;
      }

      public Criteria andPasswordIsNotNull() {
         this.addCriterion("password is not null");
         return (Criteria)this;
      }

      public Criteria andPasswordEqualTo(String value) {
         this.addCriterion("password =", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordNotEqualTo(String value) {
         this.addCriterion("password <>", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordGreaterThan(String value) {
         this.addCriterion("password >", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordGreaterThanOrEqualTo(String value) {
         this.addCriterion("password >=", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordLessThan(String value) {
         this.addCriterion("password <", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordLessThanOrEqualTo(String value) {
         this.addCriterion("password <=", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordLike(String value) {
         this.addCriterion("password like", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordNotLike(String value) {
         this.addCriterion("password not like", value, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordIn(List values) {
         this.addCriterion("password in", values, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordNotIn(List values) {
         this.addCriterion("password not in", values, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordBetween(String value1, String value2) {
         this.addCriterion("password between", value1, value2, "password");
         return (Criteria)this;
      }

      public Criteria andPasswordNotBetween(String value1, String value2) {
         this.addCriterion("password not between", value1, value2, "password");
         return (Criteria)this;
      }

      public Criteria andPinIsNull() {
         this.addCriterion("pin is null");
         return (Criteria)this;
      }

      public Criteria andPinIsNotNull() {
         this.addCriterion("pin is not null");
         return (Criteria)this;
      }

      public Criteria andPinEqualTo(String value) {
         this.addCriterion("pin =", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinNotEqualTo(String value) {
         this.addCriterion("pin <>", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinGreaterThan(String value) {
         this.addCriterion("pin >", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinGreaterThanOrEqualTo(String value) {
         this.addCriterion("pin >=", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinLessThan(String value) {
         this.addCriterion("pin <", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinLessThanOrEqualTo(String value) {
         this.addCriterion("pin <=", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinLike(String value) {
         this.addCriterion("pin like", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinNotLike(String value) {
         this.addCriterion("pin not like", value, "pin");
         return (Criteria)this;
      }

      public Criteria andPinIn(List values) {
         this.addCriterion("pin in", values, "pin");
         return (Criteria)this;
      }

      public Criteria andPinNotIn(List values) {
         this.addCriterion("pin not in", values, "pin");
         return (Criteria)this;
      }

      public Criteria andPinBetween(String value1, String value2) {
         this.addCriterion("pin between", value1, value2, "pin");
         return (Criteria)this;
      }

      public Criteria andPinNotBetween(String value1, String value2) {
         this.addCriterion("pin not between", value1, value2, "pin");
         return (Criteria)this;
      }

      public Criteria andPicIsNull() {
         this.addCriterion("pic is null");
         return (Criteria)this;
      }

      public Criteria andPicIsNotNull() {
         this.addCriterion("pic is not null");
         return (Criteria)this;
      }

      public Criteria andPicEqualTo(String value) {
         this.addCriterion("pic =", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicNotEqualTo(String value) {
         this.addCriterion("pic <>", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicGreaterThan(String value) {
         this.addCriterion("pic >", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicGreaterThanOrEqualTo(String value) {
         this.addCriterion("pic >=", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicLessThan(String value) {
         this.addCriterion("pic <", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicLessThanOrEqualTo(String value) {
         this.addCriterion("pic <=", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicLike(String value) {
         this.addCriterion("pic like", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicNotLike(String value) {
         this.addCriterion("pic not like", value, "pic");
         return (Criteria)this;
      }

      public Criteria andPicIn(List values) {
         this.addCriterion("pic in", values, "pic");
         return (Criteria)this;
      }

      public Criteria andPicNotIn(List values) {
         this.addCriterion("pic not in", values, "pic");
         return (Criteria)this;
      }

      public Criteria andPicBetween(String value1, String value2) {
         this.addCriterion("pic between", value1, value2, "pic");
         return (Criteria)this;
      }

      public Criteria andPicNotBetween(String value1, String value2) {
         this.addCriterion("pic not between", value1, value2, "pic");
         return (Criteria)this;
      }

      public Criteria andLoggedinIsNull() {
         this.addCriterion("loggedin is null");
         return (Criteria)this;
      }

      public Criteria andLoggedinIsNotNull() {
         this.addCriterion("loggedin is not null");
         return (Criteria)this;
      }

      public Criteria andLoggedinEqualTo(Byte value) {
         this.addCriterion("loggedin =", value, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinNotEqualTo(Byte value) {
         this.addCriterion("loggedin <>", value, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinGreaterThan(Byte value) {
         this.addCriterion("loggedin >", value, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinGreaterThanOrEqualTo(Byte value) {
         this.addCriterion("loggedin >=", value, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinLessThan(Byte value) {
         this.addCriterion("loggedin <", value, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinLessThanOrEqualTo(Byte value) {
         this.addCriterion("loggedin <=", value, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinIn(List values) {
         this.addCriterion("loggedin in", values, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinNotIn(List values) {
         this.addCriterion("loggedin not in", values, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinBetween(Byte value1, Byte value2) {
         this.addCriterion("loggedin between", value1, value2, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLoggedinNotBetween(Byte value1, Byte value2) {
         this.addCriterion("loggedin not between", value1, value2, "loggedin");
         return (Criteria)this;
      }

      public Criteria andLastloginIsNull() {
         this.addCriterion("lastlogin is null");
         return (Criteria)this;
      }

      public Criteria andLastloginIsNotNull() {
         this.addCriterion("lastlogin is not null");
         return (Criteria)this;
      }

      public Criteria andLastloginEqualTo(Date value) {
         this.addCriterion("lastlogin =", value, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginNotEqualTo(Date value) {
         this.addCriterion("lastlogin <>", value, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginGreaterThan(Date value) {
         this.addCriterion("lastlogin >", value, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
         this.addCriterion("lastlogin >=", value, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginLessThan(Date value) {
         this.addCriterion("lastlogin <", value, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginLessThanOrEqualTo(Date value) {
         this.addCriterion("lastlogin <=", value, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginIn(List values) {
         this.addCriterion("lastlogin in", values, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginNotIn(List values) {
         this.addCriterion("lastlogin not in", values, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginBetween(Date value1, Date value2) {
         this.addCriterion("lastlogin between", value1, value2, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andLastloginNotBetween(Date value1, Date value2) {
         this.addCriterion("lastlogin not between", value1, value2, "lastlogin");
         return (Criteria)this;
      }

      public Criteria andCreatedatIsNull() {
         this.addCriterion("createdat is null");
         return (Criteria)this;
      }

      public Criteria andCreatedatIsNotNull() {
         this.addCriterion("createdat is not null");
         return (Criteria)this;
      }

      public Criteria andCreatedatEqualTo(Date value) {
         this.addCriterion("createdat =", value, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatNotEqualTo(Date value) {
         this.addCriterion("createdat <>", value, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatGreaterThan(Date value) {
         this.addCriterion("createdat >", value, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatGreaterThanOrEqualTo(Date value) {
         this.addCriterion("createdat >=", value, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatLessThan(Date value) {
         this.addCriterion("createdat <", value, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatLessThanOrEqualTo(Date value) {
         this.addCriterion("createdat <=", value, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatIn(List values) {
         this.addCriterion("createdat in", values, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatNotIn(List values) {
         this.addCriterion("createdat not in", values, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatBetween(Date value1, Date value2) {
         this.addCriterion("createdat between", value1, value2, "createdat");
         return (Criteria)this;
      }

      public Criteria andCreatedatNotBetween(Date value1, Date value2) {
         this.addCriterion("createdat not between", value1, value2, "createdat");
         return (Criteria)this;
      }

      public Criteria andBirthdayIsNull() {
         this.addCriterion("birthday is null");
         return (Criteria)this;
      }

      public Criteria andBirthdayIsNotNull() {
         this.addCriterion("birthday is not null");
         return (Criteria)this;
      }

      public Criteria andBirthdayEqualTo(Date value) {
         this.addCriterionForJDBCDate("birthday =", value, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayNotEqualTo(Date value) {
         this.addCriterionForJDBCDate("birthday <>", value, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayGreaterThan(Date value) {
         this.addCriterionForJDBCDate("birthday >", value, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
         this.addCriterionForJDBCDate("birthday >=", value, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayLessThan(Date value) {
         this.addCriterionForJDBCDate("birthday <", value, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayLessThanOrEqualTo(Date value) {
         this.addCriterionForJDBCDate("birthday <=", value, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayIn(List values) {
         this.addCriterionForJDBCDate("birthday in", values, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayNotIn(List values) {
         this.addCriterionForJDBCDate("birthday not in", values, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayBetween(Date value1, Date value2) {
         this.addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
         return (Criteria)this;
      }

      public Criteria andBirthdayNotBetween(Date value1, Date value2) {
         this.addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
         return (Criteria)this;
      }

      public Criteria andBannedIsNull() {
         this.addCriterion("banned is null");
         return (Criteria)this;
      }

      public Criteria andBannedIsNotNull() {
         this.addCriterion("banned is not null");
         return (Criteria)this;
      }

      public Criteria andBannedEqualTo(Boolean value) {
         this.addCriterion("banned =", value, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedNotEqualTo(Boolean value) {
         this.addCriterion("banned <>", value, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedGreaterThan(Boolean value) {
         this.addCriterion("banned >", value, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedGreaterThanOrEqualTo(Boolean value) {
         this.addCriterion("banned >=", value, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedLessThan(Boolean value) {
         this.addCriterion("banned <", value, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedLessThanOrEqualTo(Boolean value) {
         this.addCriterion("banned <=", value, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedIn(List values) {
         this.addCriterion("banned in", values, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedNotIn(List values) {
         this.addCriterion("banned not in", values, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedBetween(Boolean value1, Boolean value2) {
         this.addCriterion("banned between", value1, value2, "banned");
         return (Criteria)this;
      }

      public Criteria andBannedNotBetween(Boolean value1, Boolean value2) {
         this.addCriterion("banned not between", value1, value2, "banned");
         return (Criteria)this;
      }

      public Criteria andMacsIsNull() {
         this.addCriterion("macs is null");
         return (Criteria)this;
      }

      public Criteria andMacsIsNotNull() {
         this.addCriterion("macs is not null");
         return (Criteria)this;
      }

      public Criteria andMacsEqualTo(String value) {
         this.addCriterion("macs =", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsNotEqualTo(String value) {
         this.addCriterion("macs <>", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsGreaterThan(String value) {
         this.addCriterion("macs >", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsGreaterThanOrEqualTo(String value) {
         this.addCriterion("macs >=", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsLessThan(String value) {
         this.addCriterion("macs <", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsLessThanOrEqualTo(String value) {
         this.addCriterion("macs <=", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsLike(String value) {
         this.addCriterion("macs like", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsNotLike(String value) {
         this.addCriterion("macs not like", value, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsIn(List values) {
         this.addCriterion("macs in", values, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsNotIn(List values) {
         this.addCriterion("macs not in", values, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsBetween(String value1, String value2) {
         this.addCriterion("macs between", value1, value2, "macs");
         return (Criteria)this;
      }

      public Criteria andMacsNotBetween(String value1, String value2) {
         this.addCriterion("macs not between", value1, value2, "macs");
         return (Criteria)this;
      }

      public Criteria andNxcreditIsNull() {
         this.addCriterion("nxCredit is null");
         return (Criteria)this;
      }

      public Criteria andNxcreditIsNotNull() {
         this.addCriterion("nxCredit is not null");
         return (Criteria)this;
      }

      public Criteria andNxcreditEqualTo(Integer value) {
         this.addCriterion("nxCredit =", value, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditNotEqualTo(Integer value) {
         this.addCriterion("nxCredit <>", value, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditGreaterThan(Integer value) {
         this.addCriterion("nxCredit >", value, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("nxCredit >=", value, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditLessThan(Integer value) {
         this.addCriterion("nxCredit <", value, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditLessThanOrEqualTo(Integer value) {
         this.addCriterion("nxCredit <=", value, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditIn(List values) {
         this.addCriterion("nxCredit in", values, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditNotIn(List values) {
         this.addCriterion("nxCredit not in", values, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditBetween(Integer value1, Integer value2) {
         this.addCriterion("nxCredit between", value1, value2, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andNxcreditNotBetween(Integer value1, Integer value2) {
         this.addCriterion("nxCredit not between", value1, value2, "nxcredit");
         return (Criteria)this;
      }

      public Criteria andMaplepointIsNull() {
         this.addCriterion("maplePoint is null");
         return (Criteria)this;
      }

      public Criteria andMaplepointIsNotNull() {
         this.addCriterion("maplePoint is not null");
         return (Criteria)this;
      }

      public Criteria andMaplepointEqualTo(Integer value) {
         this.addCriterion("maplePoint =", value, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointNotEqualTo(Integer value) {
         this.addCriterion("maplePoint <>", value, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointGreaterThan(Integer value) {
         this.addCriterion("maplePoint >", value, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("maplePoint >=", value, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointLessThan(Integer value) {
         this.addCriterion("maplePoint <", value, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointLessThanOrEqualTo(Integer value) {
         this.addCriterion("maplePoint <=", value, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointIn(List values) {
         this.addCriterion("maplePoint in", values, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointNotIn(List values) {
         this.addCriterion("maplePoint not in", values, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointBetween(Integer value1, Integer value2) {
         this.addCriterion("maplePoint between", value1, value2, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andMaplepointNotBetween(Integer value1, Integer value2) {
         this.addCriterion("maplePoint not between", value1, value2, "maplepoint");
         return (Criteria)this;
      }

      public Criteria andNxprepaidIsNull() {
         this.addCriterion("nxPrepaid is null");
         return (Criteria)this;
      }

      public Criteria andNxprepaidIsNotNull() {
         this.addCriterion("nxPrepaid is not null");
         return (Criteria)this;
      }

      public Criteria andNxprepaidEqualTo(Integer value) {
         this.addCriterion("nxPrepaid =", value, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidNotEqualTo(Integer value) {
         this.addCriterion("nxPrepaid <>", value, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidGreaterThan(Integer value) {
         this.addCriterion("nxPrepaid >", value, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("nxPrepaid >=", value, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidLessThan(Integer value) {
         this.addCriterion("nxPrepaid <", value, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidLessThanOrEqualTo(Integer value) {
         this.addCriterion("nxPrepaid <=", value, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidIn(List values) {
         this.addCriterion("nxPrepaid in", values, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidNotIn(List values) {
         this.addCriterion("nxPrepaid not in", values, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidBetween(Integer value1, Integer value2) {
         this.addCriterion("nxPrepaid between", value1, value2, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andNxprepaidNotBetween(Integer value1, Integer value2) {
         this.addCriterion("nxPrepaid not between", value1, value2, "nxprepaid");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsIsNull() {
         this.addCriterion("characterslots is null");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsIsNotNull() {
         this.addCriterion("characterslots is not null");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsEqualTo(Byte value) {
         this.addCriterion("characterslots =", value, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsNotEqualTo(Byte value) {
         this.addCriterion("characterslots <>", value, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsGreaterThan(Byte value) {
         this.addCriterion("characterslots >", value, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsGreaterThanOrEqualTo(Byte value) {
         this.addCriterion("characterslots >=", value, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsLessThan(Byte value) {
         this.addCriterion("characterslots <", value, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsLessThanOrEqualTo(Byte value) {
         this.addCriterion("characterslots <=", value, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsIn(List values) {
         this.addCriterion("characterslots in", values, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsNotIn(List values) {
         this.addCriterion("characterslots not in", values, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsBetween(Byte value1, Byte value2) {
         this.addCriterion("characterslots between", value1, value2, "characterslots");
         return (Criteria)this;
      }

      public Criteria andCharacterslotsNotBetween(Byte value1, Byte value2) {
         this.addCriterion("characterslots not between", value1, value2, "characterslots");
         return (Criteria)this;
      }

      public Criteria andGenderIsNull() {
         this.addCriterion("gender is null");
         return (Criteria)this;
      }

      public Criteria andGenderIsNotNull() {
         this.addCriterion("gender is not null");
         return (Criteria)this;
      }

      public Criteria andGenderEqualTo(Byte value) {
         this.addCriterion("gender =", value, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderNotEqualTo(Byte value) {
         this.addCriterion("gender <>", value, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderGreaterThan(Byte value) {
         this.addCriterion("gender >", value, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
         this.addCriterion("gender >=", value, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderLessThan(Byte value) {
         this.addCriterion("gender <", value, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderLessThanOrEqualTo(Byte value) {
         this.addCriterion("gender <=", value, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderIn(List values) {
         this.addCriterion("gender in", values, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderNotIn(List values) {
         this.addCriterion("gender not in", values, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderBetween(Byte value1, Byte value2) {
         this.addCriterion("gender between", value1, value2, "gender");
         return (Criteria)this;
      }

      public Criteria andGenderNotBetween(Byte value1, Byte value2) {
         this.addCriterion("gender not between", value1, value2, "gender");
         return (Criteria)this;
      }

      public Criteria andTempbanIsNull() {
         this.addCriterion("tempban is null");
         return (Criteria)this;
      }

      public Criteria andTempbanIsNotNull() {
         this.addCriterion("tempban is not null");
         return (Criteria)this;
      }

      public Criteria andTempbanEqualTo(Date value) {
         this.addCriterion("tempban =", value, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanNotEqualTo(Date value) {
         this.addCriterion("tempban <>", value, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanGreaterThan(Date value) {
         this.addCriterion("tempban >", value, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanGreaterThanOrEqualTo(Date value) {
         this.addCriterion("tempban >=", value, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanLessThan(Date value) {
         this.addCriterion("tempban <", value, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanLessThanOrEqualTo(Date value) {
         this.addCriterion("tempban <=", value, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanIn(List values) {
         this.addCriterion("tempban in", values, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanNotIn(List values) {
         this.addCriterion("tempban not in", values, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanBetween(Date value1, Date value2) {
         this.addCriterion("tempban between", value1, value2, "tempban");
         return (Criteria)this;
      }

      public Criteria andTempbanNotBetween(Date value1, Date value2) {
         this.addCriterion("tempban not between", value1, value2, "tempban");
         return (Criteria)this;
      }

      public Criteria andGreasonIsNull() {
         this.addCriterion("greason is null");
         return (Criteria)this;
      }

      public Criteria andGreasonIsNotNull() {
         this.addCriterion("greason is not null");
         return (Criteria)this;
      }

      public Criteria andGreasonEqualTo(Byte value) {
         this.addCriterion("greason =", value, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonNotEqualTo(Byte value) {
         this.addCriterion("greason <>", value, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonGreaterThan(Byte value) {
         this.addCriterion("greason >", value, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonGreaterThanOrEqualTo(Byte value) {
         this.addCriterion("greason >=", value, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonLessThan(Byte value) {
         this.addCriterion("greason <", value, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonLessThanOrEqualTo(Byte value) {
         this.addCriterion("greason <=", value, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonIn(List values) {
         this.addCriterion("greason in", values, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonNotIn(List values) {
         this.addCriterion("greason not in", values, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonBetween(Byte value1, Byte value2) {
         this.addCriterion("greason between", value1, value2, "greason");
         return (Criteria)this;
      }

      public Criteria andGreasonNotBetween(Byte value1, Byte value2) {
         this.addCriterion("greason not between", value1, value2, "greason");
         return (Criteria)this;
      }

      public Criteria andTosIsNull() {
         this.addCriterion("tos is null");
         return (Criteria)this;
      }

      public Criteria andTosIsNotNull() {
         this.addCriterion("tos is not null");
         return (Criteria)this;
      }

      public Criteria andTosEqualTo(Boolean value) {
         this.addCriterion("tos =", value, "tos");
         return (Criteria)this;
      }

      public Criteria andTosNotEqualTo(Boolean value) {
         this.addCriterion("tos <>", value, "tos");
         return (Criteria)this;
      }

      public Criteria andTosGreaterThan(Boolean value) {
         this.addCriterion("tos >", value, "tos");
         return (Criteria)this;
      }

      public Criteria andTosGreaterThanOrEqualTo(Boolean value) {
         this.addCriterion("tos >=", value, "tos");
         return (Criteria)this;
      }

      public Criteria andTosLessThan(Boolean value) {
         this.addCriterion("tos <", value, "tos");
         return (Criteria)this;
      }

      public Criteria andTosLessThanOrEqualTo(Boolean value) {
         this.addCriterion("tos <=", value, "tos");
         return (Criteria)this;
      }

      public Criteria andTosIn(List values) {
         this.addCriterion("tos in", values, "tos");
         return (Criteria)this;
      }

      public Criteria andTosNotIn(List values) {
         this.addCriterion("tos not in", values, "tos");
         return (Criteria)this;
      }

      public Criteria andTosBetween(Boolean value1, Boolean value2) {
         this.addCriterion("tos between", value1, value2, "tos");
         return (Criteria)this;
      }

      public Criteria andTosNotBetween(Boolean value1, Boolean value2) {
         this.addCriterion("tos not between", value1, value2, "tos");
         return (Criteria)this;
      }

      public Criteria andWebadminIsNull() {
         this.addCriterion("webadmin is null");
         return (Criteria)this;
      }

      public Criteria andWebadminIsNotNull() {
         this.addCriterion("webadmin is not null");
         return (Criteria)this;
      }

      public Criteria andWebadminEqualTo(Integer value) {
         this.addCriterion("webadmin =", value, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminNotEqualTo(Integer value) {
         this.addCriterion("webadmin <>", value, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminGreaterThan(Integer value) {
         this.addCriterion("webadmin >", value, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("webadmin >=", value, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminLessThan(Integer value) {
         this.addCriterion("webadmin <", value, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminLessThanOrEqualTo(Integer value) {
         this.addCriterion("webadmin <=", value, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminIn(List values) {
         this.addCriterion("webadmin in", values, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminNotIn(List values) {
         this.addCriterion("webadmin not in", values, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminBetween(Integer value1, Integer value2) {
         this.addCriterion("webadmin between", value1, value2, "webadmin");
         return (Criteria)this;
      }

      public Criteria andWebadminNotBetween(Integer value1, Integer value2) {
         this.addCriterion("webadmin not between", value1, value2, "webadmin");
         return (Criteria)this;
      }

      public Criteria andNickIsNull() {
         this.addCriterion("nick is null");
         return (Criteria)this;
      }

      public Criteria andNickIsNotNull() {
         this.addCriterion("nick is not null");
         return (Criteria)this;
      }

      public Criteria andNickEqualTo(String value) {
         this.addCriterion("nick =", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickNotEqualTo(String value) {
         this.addCriterion("nick <>", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickGreaterThan(String value) {
         this.addCriterion("nick >", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickGreaterThanOrEqualTo(String value) {
         this.addCriterion("nick >=", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickLessThan(String value) {
         this.addCriterion("nick <", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickLessThanOrEqualTo(String value) {
         this.addCriterion("nick <=", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickLike(String value) {
         this.addCriterion("nick like", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickNotLike(String value) {
         this.addCriterion("nick not like", value, "nick");
         return (Criteria)this;
      }

      public Criteria andNickIn(List values) {
         this.addCriterion("nick in", values, "nick");
         return (Criteria)this;
      }

      public Criteria andNickNotIn(List values) {
         this.addCriterion("nick not in", values, "nick");
         return (Criteria)this;
      }

      public Criteria andNickBetween(String value1, String value2) {
         this.addCriterion("nick between", value1, value2, "nick");
         return (Criteria)this;
      }

      public Criteria andNickNotBetween(String value1, String value2) {
         this.addCriterion("nick not between", value1, value2, "nick");
         return (Criteria)this;
      }

      public Criteria andMuteIsNull() {
         this.addCriterion("mute is null");
         return (Criteria)this;
      }

      public Criteria andMuteIsNotNull() {
         this.addCriterion("mute is not null");
         return (Criteria)this;
      }

      public Criteria andMuteEqualTo(Integer value) {
         this.addCriterion("mute =", value, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteNotEqualTo(Integer value) {
         this.addCriterion("mute <>", value, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteGreaterThan(Integer value) {
         this.addCriterion("mute >", value, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("mute >=", value, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteLessThan(Integer value) {
         this.addCriterion("mute <", value, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteLessThanOrEqualTo(Integer value) {
         this.addCriterion("mute <=", value, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteIn(List values) {
         this.addCriterion("mute in", values, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteNotIn(List values) {
         this.addCriterion("mute not in", values, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteBetween(Integer value1, Integer value2) {
         this.addCriterion("mute between", value1, value2, "mute");
         return (Criteria)this;
      }

      public Criteria andMuteNotBetween(Integer value1, Integer value2) {
         this.addCriterion("mute not between", value1, value2, "mute");
         return (Criteria)this;
      }

      public Criteria andEmailIsNull() {
         this.addCriterion("email is null");
         return (Criteria)this;
      }

      public Criteria andEmailIsNotNull() {
         this.addCriterion("email is not null");
         return (Criteria)this;
      }

      public Criteria andEmailEqualTo(String value) {
         this.addCriterion("email =", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailNotEqualTo(String value) {
         this.addCriterion("email <>", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailGreaterThan(String value) {
         this.addCriterion("email >", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailGreaterThanOrEqualTo(String value) {
         this.addCriterion("email >=", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailLessThan(String value) {
         this.addCriterion("email <", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailLessThanOrEqualTo(String value) {
         this.addCriterion("email <=", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailLike(String value) {
         this.addCriterion("email like", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailNotLike(String value) {
         this.addCriterion("email not like", value, "email");
         return (Criteria)this;
      }

      public Criteria andEmailIn(List values) {
         this.addCriterion("email in", values, "email");
         return (Criteria)this;
      }

      public Criteria andEmailNotIn(List values) {
         this.addCriterion("email not in", values, "email");
         return (Criteria)this;
      }

      public Criteria andEmailBetween(String value1, String value2) {
         this.addCriterion("email between", value1, value2, "email");
         return (Criteria)this;
      }

      public Criteria andEmailNotBetween(String value1, String value2) {
         this.addCriterion("email not between", value1, value2, "email");
         return (Criteria)this;
      }

      public Criteria andRewardpointsIsNull() {
         this.addCriterion("rewardpoints is null");
         return (Criteria)this;
      }

      public Criteria andRewardpointsIsNotNull() {
         this.addCriterion("rewardpoints is not null");
         return (Criteria)this;
      }

      public Criteria andRewardpointsEqualTo(Integer value) {
         this.addCriterion("rewardpoints =", value, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsNotEqualTo(Integer value) {
         this.addCriterion("rewardpoints <>", value, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsGreaterThan(Integer value) {
         this.addCriterion("rewardpoints >", value, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("rewardpoints >=", value, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsLessThan(Integer value) {
         this.addCriterion("rewardpoints <", value, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsLessThanOrEqualTo(Integer value) {
         this.addCriterion("rewardpoints <=", value, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsIn(List values) {
         this.addCriterion("rewardpoints in", values, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsNotIn(List values) {
         this.addCriterion("rewardpoints not in", values, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsBetween(Integer value1, Integer value2) {
         this.addCriterion("rewardpoints between", value1, value2, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andRewardpointsNotBetween(Integer value1, Integer value2) {
         this.addCriterion("rewardpoints not between", value1, value2, "rewardpoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsIsNull() {
         this.addCriterion("votepoints is null");
         return (Criteria)this;
      }

      public Criteria andVotepointsIsNotNull() {
         this.addCriterion("votepoints is not null");
         return (Criteria)this;
      }

      public Criteria andVotepointsEqualTo(Integer value) {
         this.addCriterion("votepoints =", value, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsNotEqualTo(Integer value) {
         this.addCriterion("votepoints <>", value, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsGreaterThan(Integer value) {
         this.addCriterion("votepoints >", value, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("votepoints >=", value, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsLessThan(Integer value) {
         this.addCriterion("votepoints <", value, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsLessThanOrEqualTo(Integer value) {
         this.addCriterion("votepoints <=", value, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsIn(List values) {
         this.addCriterion("votepoints in", values, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsNotIn(List values) {
         this.addCriterion("votepoints not in", values, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsBetween(Integer value1, Integer value2) {
         this.addCriterion("votepoints between", value1, value2, "votepoints");
         return (Criteria)this;
      }

      public Criteria andVotepointsNotBetween(Integer value1, Integer value2) {
         this.addCriterion("votepoints not between", value1, value2, "votepoints");
         return (Criteria)this;
      }

      public Criteria andHwidIsNull() {
         this.addCriterion("hwid is null");
         return (Criteria)this;
      }

      public Criteria andHwidIsNotNull() {
         this.addCriterion("hwid is not null");
         return (Criteria)this;
      }

      public Criteria andHwidEqualTo(String value) {
         this.addCriterion("hwid =", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidNotEqualTo(String value) {
         this.addCriterion("hwid <>", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidGreaterThan(String value) {
         this.addCriterion("hwid >", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidGreaterThanOrEqualTo(String value) {
         this.addCriterion("hwid >=", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidLessThan(String value) {
         this.addCriterion("hwid <", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidLessThanOrEqualTo(String value) {
         this.addCriterion("hwid <=", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidLike(String value) {
         this.addCriterion("hwid like", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidNotLike(String value) {
         this.addCriterion("hwid not like", value, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidIn(List values) {
         this.addCriterion("hwid in", values, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidNotIn(List values) {
         this.addCriterion("hwid not in", values, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidBetween(String value1, String value2) {
         this.addCriterion("hwid between", value1, value2, "hwid");
         return (Criteria)this;
      }

      public Criteria andHwidNotBetween(String value1, String value2) {
         this.addCriterion("hwid not between", value1, value2, "hwid");
         return (Criteria)this;
      }

      public Criteria andLanguageIsNull() {
         this.addCriterion("language is null");
         return (Criteria)this;
      }

      public Criteria andLanguageIsNotNull() {
         this.addCriterion("language is not null");
         return (Criteria)this;
      }

      public Criteria andLanguageEqualTo(Integer value) {
         this.addCriterion("language =", value, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageNotEqualTo(Integer value) {
         this.addCriterion("language <>", value, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageGreaterThan(Integer value) {
         this.addCriterion("language >", value, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("language >=", value, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageLessThan(Integer value) {
         this.addCriterion("language <", value, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageLessThanOrEqualTo(Integer value) {
         this.addCriterion("language <=", value, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageIn(List values) {
         this.addCriterion("language in", values, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageNotIn(List values) {
         this.addCriterion("language not in", values, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageBetween(Integer value1, Integer value2) {
         this.addCriterion("language between", value1, value2, "language");
         return (Criteria)this;
      }

      public Criteria andLanguageNotBetween(Integer value1, Integer value2) {
         this.addCriterion("language not between", value1, value2, "language");
         return (Criteria)this;
      }
   }
}
