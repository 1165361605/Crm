package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNull() {
            addCriterion("UserGender is null");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNotNull() {
            addCriterion("UserGender is not null");
            return (Criteria) this;
        }

        public Criteria andUsergenderEqualTo(String value) {
            addCriterion("UserGender =", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotEqualTo(String value) {
            addCriterion("UserGender <>", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThan(String value) {
            addCriterion("UserGender >", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThanOrEqualTo(String value) {
            addCriterion("UserGender >=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThan(String value) {
            addCriterion("UserGender <", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThanOrEqualTo(String value) {
            addCriterion("UserGender <=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLike(String value) {
            addCriterion("UserGender like", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotLike(String value) {
            addCriterion("UserGender not like", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderIn(List<String> values) {
            addCriterion("UserGender in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotIn(List<String> values) {
            addCriterion("UserGender not in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderBetween(String value1, String value2) {
            addCriterion("UserGender between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotBetween(String value1, String value2) {
            addCriterion("UserGender not between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNull() {
            addCriterion("UserAddress is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("UserAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("UserAddress =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("UserAddress <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("UserAddress >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("UserAddress >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("UserAddress <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("UserAddress <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("UserAddress like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("UserAddress not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("UserAddress in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("UserAddress not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("UserAddress between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("UserAddress not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("UserTel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("UserTel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("UserTel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("UserTel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("UserTel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("UserTel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("UserTel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("UserTel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("UserTel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("UserTel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("UserTel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("UserTel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("UserTel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("UserTel not between", value1, value2, "usertel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
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
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}