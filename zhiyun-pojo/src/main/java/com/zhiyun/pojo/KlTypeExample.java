package com.zhiyun.pojo;

import java.util.ArrayList;
import java.util.List;

public class KlTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KlTypeExample() {
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

        public Criteria andKlCodeIsNull() {
            addCriterion("kl_code is null");
            return (Criteria) this;
        }

        public Criteria andKlCodeIsNotNull() {
            addCriterion("kl_code is not null");
            return (Criteria) this;
        }

        public Criteria andKlCodeEqualTo(Integer value) {
            addCriterion("kl_code =", value, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeNotEqualTo(Integer value) {
            addCriterion("kl_code <>", value, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeGreaterThan(Integer value) {
            addCriterion("kl_code >", value, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("kl_code >=", value, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeLessThan(Integer value) {
            addCriterion("kl_code <", value, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeLessThanOrEqualTo(Integer value) {
            addCriterion("kl_code <=", value, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeIn(List<Integer> values) {
            addCriterion("kl_code in", values, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeNotIn(List<Integer> values) {
            addCriterion("kl_code not in", values, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeBetween(Integer value1, Integer value2) {
            addCriterion("kl_code between", value1, value2, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("kl_code not between", value1, value2, "klCode");
            return (Criteria) this;
        }

        public Criteria andKlNameIsNull() {
            addCriterion("kl_name is null");
            return (Criteria) this;
        }

        public Criteria andKlNameIsNotNull() {
            addCriterion("kl_name is not null");
            return (Criteria) this;
        }

        public Criteria andKlNameEqualTo(String value) {
            addCriterion("kl_name =", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameNotEqualTo(String value) {
            addCriterion("kl_name <>", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameGreaterThan(String value) {
            addCriterion("kl_name >", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameGreaterThanOrEqualTo(String value) {
            addCriterion("kl_name >=", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameLessThan(String value) {
            addCriterion("kl_name <", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameLessThanOrEqualTo(String value) {
            addCriterion("kl_name <=", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameLike(String value) {
            addCriterion("kl_name like", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameNotLike(String value) {
            addCriterion("kl_name not like", value, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameIn(List<String> values) {
            addCriterion("kl_name in", values, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameNotIn(List<String> values) {
            addCriterion("kl_name not in", values, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameBetween(String value1, String value2) {
            addCriterion("kl_name between", value1, value2, "klName");
            return (Criteria) this;
        }

        public Criteria andKlNameNotBetween(String value1, String value2) {
            addCriterion("kl_name not between", value1, value2, "klName");
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