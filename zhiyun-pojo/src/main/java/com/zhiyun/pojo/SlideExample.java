package com.zhiyun.pojo;

import java.util.ArrayList;
import java.util.List;

public class SlideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlideExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSPathIsNull() {
            addCriterion("s_path is null");
            return (Criteria) this;
        }

        public Criteria andSPathIsNotNull() {
            addCriterion("s_path is not null");
            return (Criteria) this;
        }

        public Criteria andSPathEqualTo(String value) {
            addCriterion("s_path =", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathNotEqualTo(String value) {
            addCriterion("s_path <>", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathGreaterThan(String value) {
            addCriterion("s_path >", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathGreaterThanOrEqualTo(String value) {
            addCriterion("s_path >=", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathLessThan(String value) {
            addCriterion("s_path <", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathLessThanOrEqualTo(String value) {
            addCriterion("s_path <=", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathLike(String value) {
            addCriterion("s_path like", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathNotLike(String value) {
            addCriterion("s_path not like", value, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathIn(List<String> values) {
            addCriterion("s_path in", values, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathNotIn(List<String> values) {
            addCriterion("s_path not in", values, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathBetween(String value1, String value2) {
            addCriterion("s_path between", value1, value2, "sPath");
            return (Criteria) this;
        }

        public Criteria andSPathNotBetween(String value1, String value2) {
            addCriterion("s_path not between", value1, value2, "sPath");
            return (Criteria) this;
        }

        public Criteria andSOrderIsNull() {
            addCriterion("s_order is null");
            return (Criteria) this;
        }

        public Criteria andSOrderIsNotNull() {
            addCriterion("s_order is not null");
            return (Criteria) this;
        }

        public Criteria andSOrderEqualTo(Integer value) {
            addCriterion("s_order =", value, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderNotEqualTo(Integer value) {
            addCriterion("s_order <>", value, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderGreaterThan(Integer value) {
            addCriterion("s_order >", value, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_order >=", value, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderLessThan(Integer value) {
            addCriterion("s_order <", value, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderLessThanOrEqualTo(Integer value) {
            addCriterion("s_order <=", value, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderIn(List<Integer> values) {
            addCriterion("s_order in", values, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderNotIn(List<Integer> values) {
            addCriterion("s_order not in", values, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderBetween(Integer value1, Integer value2) {
            addCriterion("s_order between", value1, value2, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("s_order not between", value1, value2, "sOrder");
            return (Criteria) this;
        }

        public Criteria andSImgIdIsNull() {
            addCriterion("s_img_id is null");
            return (Criteria) this;
        }

        public Criteria andSImgIdIsNotNull() {
            addCriterion("s_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andSImgIdEqualTo(String value) {
            addCriterion("s_img_id =", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdNotEqualTo(String value) {
            addCriterion("s_img_id <>", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdGreaterThan(String value) {
            addCriterion("s_img_id >", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_img_id >=", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdLessThan(String value) {
            addCriterion("s_img_id <", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdLessThanOrEqualTo(String value) {
            addCriterion("s_img_id <=", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdLike(String value) {
            addCriterion("s_img_id like", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdNotLike(String value) {
            addCriterion("s_img_id not like", value, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdIn(List<String> values) {
            addCriterion("s_img_id in", values, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdNotIn(List<String> values) {
            addCriterion("s_img_id not in", values, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdBetween(String value1, String value2) {
            addCriterion("s_img_id between", value1, value2, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSImgIdNotBetween(String value1, String value2) {
            addCriterion("s_img_id not between", value1, value2, "sImgId");
            return (Criteria) this;
        }

        public Criteria andSInputIdIsNull() {
            addCriterion("s_input_id is null");
            return (Criteria) this;
        }

        public Criteria andSInputIdIsNotNull() {
            addCriterion("s_input_id is not null");
            return (Criteria) this;
        }

        public Criteria andSInputIdEqualTo(String value) {
            addCriterion("s_input_id =", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdNotEqualTo(String value) {
            addCriterion("s_input_id <>", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdGreaterThan(String value) {
            addCriterion("s_input_id >", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_input_id >=", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdLessThan(String value) {
            addCriterion("s_input_id <", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdLessThanOrEqualTo(String value) {
            addCriterion("s_input_id <=", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdLike(String value) {
            addCriterion("s_input_id like", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdNotLike(String value) {
            addCriterion("s_input_id not like", value, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdIn(List<String> values) {
            addCriterion("s_input_id in", values, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdNotIn(List<String> values) {
            addCriterion("s_input_id not in", values, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdBetween(String value1, String value2) {
            addCriterion("s_input_id between", value1, value2, "sInputId");
            return (Criteria) this;
        }

        public Criteria andSInputIdNotBetween(String value1, String value2) {
            addCriterion("s_input_id not between", value1, value2, "sInputId");
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