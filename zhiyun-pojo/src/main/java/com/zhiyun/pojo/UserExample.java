package com.zhiyun.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNull() {
            addCriterion("user_pass is null");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNotNull() {
            addCriterion("user_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUserPassEqualTo(String value) {
            addCriterion("user_pass =", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotEqualTo(String value) {
            addCriterion("user_pass <>", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThan(String value) {
            addCriterion("user_pass >", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThanOrEqualTo(String value) {
            addCriterion("user_pass >=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThan(String value) {
            addCriterion("user_pass <", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThanOrEqualTo(String value) {
            addCriterion("user_pass <=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLike(String value) {
            addCriterion("user_pass like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotLike(String value) {
            addCriterion("user_pass not like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassIn(List<String> values) {
            addCriterion("user_pass in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotIn(List<String> values) {
            addCriterion("user_pass not in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassBetween(String value1, String value2) {
            addCriterion("user_pass between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotBetween(String value1, String value2) {
            addCriterion("user_pass not between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNull() {
            addCriterion("user_remark is null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNotNull() {
            addCriterion("user_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkEqualTo(Integer value) {
            addCriterion("user_remark =", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotEqualTo(Integer value) {
            addCriterion("user_remark <>", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThan(Integer value) {
            addCriterion("user_remark >", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_remark >=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThan(Integer value) {
            addCriterion("user_remark <", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("user_remark <=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIn(List<Integer> values) {
            addCriterion("user_remark in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotIn(List<Integer> values) {
            addCriterion("user_remark not in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkBetween(Integer value1, Integer value2) {
            addCriterion("user_remark between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("user_remark not between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserFlagIsNull() {
            addCriterion("user_flag is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagIsNotNull() {
            addCriterion("user_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagEqualTo(Integer value) {
            addCriterion("user_flag =", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagNotEqualTo(Integer value) {
            addCriterion("user_flag <>", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagGreaterThan(Integer value) {
            addCriterion("user_flag >", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_flag >=", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagLessThan(Integer value) {
            addCriterion("user_flag <", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagLessThanOrEqualTo(Integer value) {
            addCriterion("user_flag <=", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagIn(List<Integer> values) {
            addCriterion("user_flag in", values, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagNotIn(List<Integer> values) {
            addCriterion("user_flag not in", values, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagBetween(Integer value1, Integer value2) {
            addCriterion("user_flag between", value1, value2, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("user_flag not between", value1, value2, "userFlag");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
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

        public Criteria andUserOnlyidIsNull() {
            addCriterion("user_onlyId is null");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidIsNotNull() {
            addCriterion("user_onlyId is not null");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidEqualTo(String value) {
            addCriterion("user_onlyId =", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidNotEqualTo(String value) {
            addCriterion("user_onlyId <>", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidGreaterThan(String value) {
            addCriterion("user_onlyId >", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidGreaterThanOrEqualTo(String value) {
            addCriterion("user_onlyId >=", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidLessThan(String value) {
            addCriterion("user_onlyId <", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidLessThanOrEqualTo(String value) {
            addCriterion("user_onlyId <=", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidLike(String value) {
            addCriterion("user_onlyId like", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidNotLike(String value) {
            addCriterion("user_onlyId not like", value, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidIn(List<String> values) {
            addCriterion("user_onlyId in", values, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidNotIn(List<String> values) {
            addCriterion("user_onlyId not in", values, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidBetween(String value1, String value2) {
            addCriterion("user_onlyId between", value1, value2, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserOnlyidNotBetween(String value1, String value2) {
            addCriterion("user_onlyId not between", value1, value2, "userOnlyid");
            return (Criteria) this;
        }

        public Criteria andUserShareCountIsNull() {
            addCriterion("user_share_count is null");
            return (Criteria) this;
        }

        public Criteria andUserShareCountIsNotNull() {
            addCriterion("user_share_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserShareCountEqualTo(Integer value) {
            addCriterion("user_share_count =", value, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountNotEqualTo(Integer value) {
            addCriterion("user_share_count <>", value, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountGreaterThan(Integer value) {
            addCriterion("user_share_count >", value, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_share_count >=", value, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountLessThan(Integer value) {
            addCriterion("user_share_count <", value, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_share_count <=", value, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountIn(List<Integer> values) {
            addCriterion("user_share_count in", values, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountNotIn(List<Integer> values) {
            addCriterion("user_share_count not in", values, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountBetween(Integer value1, Integer value2) {
            addCriterion("user_share_count between", value1, value2, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserShareCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_share_count not between", value1, value2, "userShareCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountIsNull() {
            addCriterion("user_collect_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountIsNotNull() {
            addCriterion("user_collect_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountEqualTo(Integer value) {
            addCriterion("user_collect_count =", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountNotEqualTo(Integer value) {
            addCriterion("user_collect_count <>", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountGreaterThan(Integer value) {
            addCriterion("user_collect_count >", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_collect_count >=", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountLessThan(Integer value) {
            addCriterion("user_collect_count <", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_collect_count <=", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountIn(List<Integer> values) {
            addCriterion("user_collect_count in", values, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountNotIn(List<Integer> values) {
            addCriterion("user_collect_count not in", values, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountBetween(Integer value1, Integer value2) {
            addCriterion("user_collect_count between", value1, value2, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_collect_count not between", value1, value2, "userCollectCount");
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