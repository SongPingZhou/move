package com.itheima.entity;

import java.util.ArrayList;
import java.util.List;

public class ImagecommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImagecommentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImageidIsNull() {
            addCriterion("imageId is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageId is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(Integer value) {
            addCriterion("imageId =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(Integer value) {
            addCriterion("imageId <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(Integer value) {
            addCriterion("imageId >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageId >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(Integer value) {
            addCriterion("imageId <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(Integer value) {
            addCriterion("imageId <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<Integer> values) {
            addCriterion("imageId in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<Integer> values) {
            addCriterion("imageId not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(Integer value1, Integer value2) {
            addCriterion("imageId between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(Integer value1, Integer value2) {
            addCriterion("imageId not between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIsNull() {
            addCriterion("commentBody is null");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIsNotNull() {
            addCriterion("commentBody is not null");
            return (Criteria) this;
        }

        public Criteria andCommentbodyEqualTo(String value) {
            addCriterion("commentBody =", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotEqualTo(String value) {
            addCriterion("commentBody <>", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyGreaterThan(String value) {
            addCriterion("commentBody >", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyGreaterThanOrEqualTo(String value) {
            addCriterion("commentBody >=", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLessThan(String value) {
            addCriterion("commentBody <", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLessThanOrEqualTo(String value) {
            addCriterion("commentBody <=", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLike(String value) {
            addCriterion("commentBody like", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotLike(String value) {
            addCriterion("commentBody not like", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIn(List<String> values) {
            addCriterion("commentBody in", values, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotIn(List<String> values) {
            addCriterion("commentBody not in", values, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyBetween(String value1, String value2) {
            addCriterion("commentBody between", value1, value2, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotBetween(String value1, String value2) {
            addCriterion("commentBody not between", value1, value2, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(String value) {
            addCriterion("commentTime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(String value) {
            addCriterion("commentTime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(String value) {
            addCriterion("commentTime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("commentTime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(String value) {
            addCriterion("commentTime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(String value) {
            addCriterion("commentTime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLike(String value) {
            addCriterion("commentTime like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotLike(String value) {
            addCriterion("commentTime not like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<String> values) {
            addCriterion("commentTime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<String> values) {
            addCriterion("commentTime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(String value1, String value2) {
            addCriterion("commentTime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(String value1, String value2) {
            addCriterion("commentTime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommentuserIsNull() {
            addCriterion("commentUser is null");
            return (Criteria) this;
        }

        public Criteria andCommentuserIsNotNull() {
            addCriterion("commentUser is not null");
            return (Criteria) this;
        }

        public Criteria andCommentuserEqualTo(Integer value) {
            addCriterion("commentUser =", value, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserNotEqualTo(Integer value) {
            addCriterion("commentUser <>", value, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserGreaterThan(Integer value) {
            addCriterion("commentUser >", value, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentUser >=", value, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserLessThan(Integer value) {
            addCriterion("commentUser <", value, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserLessThanOrEqualTo(Integer value) {
            addCriterion("commentUser <=", value, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserIn(List<Integer> values) {
            addCriterion("commentUser in", values, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserNotIn(List<Integer> values) {
            addCriterion("commentUser not in", values, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserBetween(Integer value1, Integer value2) {
            addCriterion("commentUser between", value1, value2, "commentuser");
            return (Criteria) this;
        }

        public Criteria andCommentuserNotBetween(Integer value1, Integer value2) {
            addCriterion("commentUser not between", value1, value2, "commentuser");
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