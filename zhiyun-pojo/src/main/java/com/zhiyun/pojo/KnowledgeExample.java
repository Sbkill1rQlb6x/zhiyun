package com.zhiyun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KnowledgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KnowledgeExample() {
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

        public Criteria andKlIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andKlIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andKlIdEqualTo(Integer value) {
            addCriterion("id =", value, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdGreaterThan(Integer value) {
            addCriterion("id >", value, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdLessThan(Integer value) {
            addCriterion("id <", value, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdIn(List<Integer> values) {
            addCriterion("id in", values, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "klId");
            return (Criteria) this;
        }

        public Criteria andKlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "klId");
            return (Criteria) this;
        }

        public Criteria andKlTitleIsNull() {
            addCriterion("kl_title is null");
            return (Criteria) this;
        }

        public Criteria andKlTitleIsNotNull() {
            addCriterion("kl_title is not null");
            return (Criteria) this;
        }

        public Criteria andKlTitleEqualTo(String value) {
            addCriterion("kl_title =", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleNotEqualTo(String value) {
            addCriterion("kl_title <>", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleGreaterThan(String value) {
            addCriterion("kl_title >", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleGreaterThanOrEqualTo(String value) {
            addCriterion("kl_title >=", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleLessThan(String value) {
            addCriterion("kl_title <", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleLessThanOrEqualTo(String value) {
            addCriterion("kl_title <=", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleLike(String value) {
            addCriterion("kl_title like", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleNotLike(String value) {
            addCriterion("kl_title not like", value, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleIn(List<String> values) {
            addCriterion("kl_title in", values, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleNotIn(List<String> values) {
            addCriterion("kl_title not in", values, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleBetween(String value1, String value2) {
            addCriterion("kl_title between", value1, value2, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTitleNotBetween(String value1, String value2) {
            addCriterion("kl_title not between", value1, value2, "klTitle");
            return (Criteria) this;
        }

        public Criteria andKlTypeIsNull() {
            addCriterion("kl_type is null");
            return (Criteria) this;
        }

        public Criteria andKlTypeIsNotNull() {
            addCriterion("kl_type is not null");
            return (Criteria) this;
        }

        public Criteria andKlTypeEqualTo(Integer value) {
            addCriterion("kl_type =", value, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeNotEqualTo(Integer value) {
            addCriterion("kl_type <>", value, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeGreaterThan(Integer value) {
            addCriterion("kl_type >", value, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("kl_type >=", value, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeLessThan(Integer value) {
            addCriterion("kl_type <", value, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeLessThanOrEqualTo(Integer value) {
            addCriterion("kl_type <=", value, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeIn(List<Integer> values) {
            addCriterion("kl_type in", values, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeNotIn(List<Integer> values) {
            addCriterion("kl_type not in", values, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeBetween(Integer value1, Integer value2) {
            addCriterion("kl_type between", value1, value2, "klType");
            return (Criteria) this;
        }

        public Criteria andKlTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("kl_type not between", value1, value2, "klType");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountIsNull() {
            addCriterion("kl_collect_count is null");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountIsNotNull() {
            addCriterion("kl_collect_count is not null");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountEqualTo(Integer value) {
            addCriterion("kl_collect_count =", value, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountNotEqualTo(Integer value) {
            addCriterion("kl_collect_count <>", value, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountGreaterThan(Integer value) {
            addCriterion("kl_collect_count >", value, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("kl_collect_count >=", value, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountLessThan(Integer value) {
            addCriterion("kl_collect_count <", value, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountLessThanOrEqualTo(Integer value) {
            addCriterion("kl_collect_count <=", value, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountIn(List<Integer> values) {
            addCriterion("kl_collect_count in", values, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountNotIn(List<Integer> values) {
            addCriterion("kl_collect_count not in", values, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountBetween(Integer value1, Integer value2) {
            addCriterion("kl_collect_count between", value1, value2, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlCollectCountNotBetween(Integer value1, Integer value2) {
            addCriterion("kl_collect_count not between", value1, value2, "klCollectCount");
            return (Criteria) this;
        }

        public Criteria andKlRemarkIsNull() {
            addCriterion("kl_remark is null");
            return (Criteria) this;
        }

        public Criteria andKlRemarkIsNotNull() {
            addCriterion("kl_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKlRemarkEqualTo(Integer value) {
            addCriterion("kl_remark =", value, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkNotEqualTo(Integer value) {
            addCriterion("kl_remark <>", value, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkGreaterThan(Integer value) {
            addCriterion("kl_remark >", value, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("kl_remark >=", value, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkLessThan(Integer value) {
            addCriterion("kl_remark <", value, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("kl_remark <=", value, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkIn(List<Integer> values) {
            addCriterion("kl_remark in", values, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkNotIn(List<Integer> values) {
            addCriterion("kl_remark not in", values, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkBetween(Integer value1, Integer value2) {
            addCriterion("kl_remark between", value1, value2, "klRemark");
            return (Criteria) this;
        }

        public Criteria andKlRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("kl_remark not between", value1, value2, "klRemark");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdIsNull() {
            addCriterion("user_only_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdIsNotNull() {
            addCriterion("user_only_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdEqualTo(String value) {
            addCriterion("user_only_id =", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdNotEqualTo(String value) {
            addCriterion("user_only_id <>", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdGreaterThan(String value) {
            addCriterion("user_only_id >", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_only_id >=", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdLessThan(String value) {
            addCriterion("user_only_id <", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdLessThanOrEqualTo(String value) {
            addCriterion("user_only_id <=", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdLike(String value) {
            addCriterion("user_only_id like", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdNotLike(String value) {
            addCriterion("user_only_id not like", value, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdIn(List<String> values) {
            addCriterion("user_only_id in", values, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdNotIn(List<String> values) {
            addCriterion("user_only_id not in", values, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdBetween(String value1, String value2) {
            addCriterion("user_only_id between", value1, value2, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andUserOnlyIdNotBetween(String value1, String value2) {
            addCriterion("user_only_id not between", value1, value2, "userOnlyId");
            return (Criteria) this;
        }

        public Criteria andKlDateIsNull() {
            addCriterion("kl_date is null");
            return (Criteria) this;
        }

        public Criteria andKlDateIsNotNull() {
            addCriterion("kl_date is not null");
            return (Criteria) this;
        }

        public Criteria andKlDateEqualTo(Date value) {
            addCriterion("kl_date =", value, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateNotEqualTo(Date value) {
            addCriterion("kl_date <>", value, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateGreaterThan(Date value) {
            addCriterion("kl_date >", value, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("kl_date >=", value, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateLessThan(Date value) {
            addCriterion("kl_date <", value, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateLessThanOrEqualTo(Date value) {
            addCriterion("kl_date <=", value, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateIn(List<Date> values) {
            addCriterion("kl_date in", values, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateNotIn(List<Date> values) {
            addCriterion("kl_date not in", values, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateBetween(Date value1, Date value2) {
            addCriterion("kl_date between", value1, value2, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlDateNotBetween(Date value1, Date value2) {
            addCriterion("kl_date not between", value1, value2, "klDate");
            return (Criteria) this;
        }

        public Criteria andKlAuthorIsNull() {
            addCriterion("kl_author is null");
            return (Criteria) this;
        }

        public Criteria andKlAuthorIsNotNull() {
            addCriterion("kl_author is not null");
            return (Criteria) this;
        }

        public Criteria andKlAuthorEqualTo(String value) {
            addCriterion("kl_author =", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorNotEqualTo(String value) {
            addCriterion("kl_author <>", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorGreaterThan(String value) {
            addCriterion("kl_author >", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("kl_author >=", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorLessThan(String value) {
            addCriterion("kl_author <", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorLessThanOrEqualTo(String value) {
            addCriterion("kl_author <=", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorLike(String value) {
            addCriterion("kl_author like", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorNotLike(String value) {
            addCriterion("kl_author not like", value, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorIn(List<String> values) {
            addCriterion("kl_author in", values, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorNotIn(List<String> values) {
            addCriterion("kl_author not in", values, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorBetween(String value1, String value2) {
            addCriterion("kl_author between", value1, value2, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andKlAuthorNotBetween(String value1, String value2) {
            addCriterion("kl_author not between", value1, value2, "klAuthor");
            return (Criteria) this;
        }

        public Criteria andUserFaceIsNull() {
            addCriterion("user_face is null");
            return (Criteria) this;
        }

        public Criteria andUserFaceIsNotNull() {
            addCriterion("user_face is not null");
            return (Criteria) this;
        }

        public Criteria andUserFaceEqualTo(String value) {
            addCriterion("user_face =", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceNotEqualTo(String value) {
            addCriterion("user_face <>", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceGreaterThan(String value) {
            addCriterion("user_face >", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceGreaterThanOrEqualTo(String value) {
            addCriterion("user_face >=", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceLessThan(String value) {
            addCriterion("user_face <", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceLessThanOrEqualTo(String value) {
            addCriterion("user_face <=", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceLike(String value) {
            addCriterion("user_face like", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceNotLike(String value) {
            addCriterion("user_face not like", value, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceIn(List<String> values) {
            addCriterion("user_face in", values, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceNotIn(List<String> values) {
            addCriterion("user_face not in", values, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceBetween(String value1, String value2) {
            addCriterion("user_face between", value1, value2, "userFace");
            return (Criteria) this;
        }

        public Criteria andUserFaceNotBetween(String value1, String value2) {
            addCriterion("user_face not between", value1, value2, "userFace");
            return (Criteria) this;
        }

        public Criteria andIssharedIsNull() {
            addCriterion("isShared is null");
            return (Criteria) this;
        }

        public Criteria andIssharedIsNotNull() {
            addCriterion("isShared is not null");
            return (Criteria) this;
        }

        public Criteria andIssharedEqualTo(Integer value) {
            addCriterion("isShared =", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedNotEqualTo(Integer value) {
            addCriterion("isShared <>", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedGreaterThan(Integer value) {
            addCriterion("isShared >", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShared >=", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedLessThan(Integer value) {
            addCriterion("isShared <", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedLessThanOrEqualTo(Integer value) {
            addCriterion("isShared <=", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedIn(List<Integer> values) {
            addCriterion("isShared in", values, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedNotIn(List<Integer> values) {
            addCriterion("isShared not in", values, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedBetween(Integer value1, Integer value2) {
            addCriterion("isShared between", value1, value2, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedNotBetween(Integer value1, Integer value2) {
            addCriterion("isShared not between", value1, value2, "isshared");
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