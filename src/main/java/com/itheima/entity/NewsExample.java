package com.itheima.entity;

import java.util.ArrayList;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewtitleIsNull() {
            addCriterion("newTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewtitleIsNotNull() {
            addCriterion("newTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewtitleEqualTo(String value) {
            addCriterion("newTitle =", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotEqualTo(String value) {
            addCriterion("newTitle <>", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleGreaterThan(String value) {
            addCriterion("newTitle >", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleGreaterThanOrEqualTo(String value) {
            addCriterion("newTitle >=", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleLessThan(String value) {
            addCriterion("newTitle <", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleLessThanOrEqualTo(String value) {
            addCriterion("newTitle <=", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleLike(String value) {
            addCriterion("newTitle like", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotLike(String value) {
            addCriterion("newTitle not like", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleIn(List<String> values) {
            addCriterion("newTitle in", values, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotIn(List<String> values) {
            addCriterion("newTitle not in", values, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleBetween(String value1, String value2) {
            addCriterion("newTitle between", value1, value2, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotBetween(String value1, String value2) {
            addCriterion("newTitle not between", value1, value2, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewbodyIsNull() {
            addCriterion("newBody is null");
            return (Criteria) this;
        }

        public Criteria andNewbodyIsNotNull() {
            addCriterion("newBody is not null");
            return (Criteria) this;
        }

        public Criteria andNewbodyEqualTo(String value) {
            addCriterion("newBody =", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyNotEqualTo(String value) {
            addCriterion("newBody <>", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyGreaterThan(String value) {
            addCriterion("newBody >", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyGreaterThanOrEqualTo(String value) {
            addCriterion("newBody >=", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyLessThan(String value) {
            addCriterion("newBody <", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyLessThanOrEqualTo(String value) {
            addCriterion("newBody <=", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyLike(String value) {
            addCriterion("newBody like", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyNotLike(String value) {
            addCriterion("newBody not like", value, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyIn(List<String> values) {
            addCriterion("newBody in", values, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyNotIn(List<String> values) {
            addCriterion("newBody not in", values, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyBetween(String value1, String value2) {
            addCriterion("newBody between", value1, value2, "newbody");
            return (Criteria) this;
        }

        public Criteria andNewbodyNotBetween(String value1, String value2) {
            addCriterion("newBody not between", value1, value2, "newbody");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNull() {
            addCriterion("releaseTime is null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNotNull() {
            addCriterion("releaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeEqualTo(String value) {
            addCriterion("releaseTime =", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotEqualTo(String value) {
            addCriterion("releaseTime <>", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThan(String value) {
            addCriterion("releaseTime >", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThanOrEqualTo(String value) {
            addCriterion("releaseTime >=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThan(String value) {
            addCriterion("releaseTime <", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThanOrEqualTo(String value) {
            addCriterion("releaseTime <=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLike(String value) {
            addCriterion("releaseTime like", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotLike(String value) {
            addCriterion("releaseTime not like", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIn(List<String> values) {
            addCriterion("releaseTime in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotIn(List<String> values) {
            addCriterion("releaseTime not in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeBetween(String value1, String value2) {
            addCriterion("releaseTime between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotBetween(String value1, String value2) {
            addCriterion("releaseTime not between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andNewimgIsNull() {
            addCriterion("newImg is null");
            return (Criteria) this;
        }

        public Criteria andNewimgIsNotNull() {
            addCriterion("newImg is not null");
            return (Criteria) this;
        }

        public Criteria andNewimgEqualTo(String value) {
            addCriterion("newImg =", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgNotEqualTo(String value) {
            addCriterion("newImg <>", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgGreaterThan(String value) {
            addCriterion("newImg >", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgGreaterThanOrEqualTo(String value) {
            addCriterion("newImg >=", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgLessThan(String value) {
            addCriterion("newImg <", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgLessThanOrEqualTo(String value) {
            addCriterion("newImg <=", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgLike(String value) {
            addCriterion("newImg like", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgNotLike(String value) {
            addCriterion("newImg not like", value, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgIn(List<String> values) {
            addCriterion("newImg in", values, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgNotIn(List<String> values) {
            addCriterion("newImg not in", values, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgBetween(String value1, String value2) {
            addCriterion("newImg between", value1, value2, "newimg");
            return (Criteria) this;
        }

        public Criteria andNewimgNotBetween(String value1, String value2) {
            addCriterion("newImg not between", value1, value2, "newimg");
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