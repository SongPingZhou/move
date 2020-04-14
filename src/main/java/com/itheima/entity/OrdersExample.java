package com.itheima.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderdateIsNull() {
            addCriterion("orderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("orderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("orderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("orderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("orderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("orderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("orderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("orderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("orderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("orderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Float value) {
            addCriterion("totalMoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Float value) {
            addCriterion("totalMoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Float value) {
            addCriterion("totalMoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("totalMoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Float value) {
            addCriterion("totalMoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("totalMoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Float> values) {
            addCriterion("totalMoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Float> values) {
            addCriterion("totalMoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Float value1, Float value2) {
            addCriterion("totalMoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("totalMoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("shipName is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("shipName is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("shipName =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("shipName <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("shipName >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("shipName >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("shipName <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("shipName <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("shipName like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("shipName not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("shipName in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("shipName not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("shipName between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("shipName not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnumIsNull() {
            addCriterion("shipNum is null");
            return (Criteria) this;
        }

        public Criteria andShipnumIsNotNull() {
            addCriterion("shipNum is not null");
            return (Criteria) this;
        }

        public Criteria andShipnumEqualTo(String value) {
            addCriterion("shipNum =", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumNotEqualTo(String value) {
            addCriterion("shipNum <>", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumGreaterThan(String value) {
            addCriterion("shipNum >", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumGreaterThanOrEqualTo(String value) {
            addCriterion("shipNum >=", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumLessThan(String value) {
            addCriterion("shipNum <", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumLessThanOrEqualTo(String value) {
            addCriterion("shipNum <=", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumLike(String value) {
            addCriterion("shipNum like", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumNotLike(String value) {
            addCriterion("shipNum not like", value, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumIn(List<String> values) {
            addCriterion("shipNum in", values, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumNotIn(List<String> values) {
            addCriterion("shipNum not in", values, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumBetween(String value1, String value2) {
            addCriterion("shipNum between", value1, value2, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipnumNotBetween(String value1, String value2) {
            addCriterion("shipNum not between", value1, value2, "shipnum");
            return (Criteria) this;
        }

        public Criteria andShipdateIsNull() {
            addCriterion("shipDate is null");
            return (Criteria) this;
        }

        public Criteria andShipdateIsNotNull() {
            addCriterion("shipDate is not null");
            return (Criteria) this;
        }

        public Criteria andShipdateEqualTo(Date value) {
            addCriterion("shipDate =", value, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateNotEqualTo(Date value) {
            addCriterion("shipDate <>", value, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateGreaterThan(Date value) {
            addCriterion("shipDate >", value, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateGreaterThanOrEqualTo(Date value) {
            addCriterion("shipDate >=", value, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateLessThan(Date value) {
            addCriterion("shipDate <", value, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateLessThanOrEqualTo(Date value) {
            addCriterion("shipDate <=", value, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateIn(List<Date> values) {
            addCriterion("shipDate in", values, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateNotIn(List<Date> values) {
            addCriterion("shipDate not in", values, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateBetween(Date value1, Date value2) {
            addCriterion("shipDate between", value1, value2, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipdateNotBetween(Date value1, Date value2) {
            addCriterion("shipDate not between", value1, value2, "shipdate");
            return (Criteria) this;
        }

        public Criteria andShipcountryIsNull() {
            addCriterion("shipCountry is null");
            return (Criteria) this;
        }

        public Criteria andShipcountryIsNotNull() {
            addCriterion("shipCountry is not null");
            return (Criteria) this;
        }

        public Criteria andShipcountryEqualTo(String value) {
            addCriterion("shipCountry =", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotEqualTo(String value) {
            addCriterion("shipCountry <>", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryGreaterThan(String value) {
            addCriterion("shipCountry >", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryGreaterThanOrEqualTo(String value) {
            addCriterion("shipCountry >=", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLessThan(String value) {
            addCriterion("shipCountry <", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLessThanOrEqualTo(String value) {
            addCriterion("shipCountry <=", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLike(String value) {
            addCriterion("shipCountry like", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotLike(String value) {
            addCriterion("shipCountry not like", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryIn(List<String> values) {
            addCriterion("shipCountry in", values, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotIn(List<String> values) {
            addCriterion("shipCountry not in", values, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryBetween(String value1, String value2) {
            addCriterion("shipCountry between", value1, value2, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotBetween(String value1, String value2) {
            addCriterion("shipCountry not between", value1, value2, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipprovinceIsNull() {
            addCriterion("shipProvince is null");
            return (Criteria) this;
        }

        public Criteria andShipprovinceIsNotNull() {
            addCriterion("shipProvince is not null");
            return (Criteria) this;
        }

        public Criteria andShipprovinceEqualTo(String value) {
            addCriterion("shipProvince =", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceNotEqualTo(String value) {
            addCriterion("shipProvince <>", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceGreaterThan(String value) {
            addCriterion("shipProvince >", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("shipProvince >=", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceLessThan(String value) {
            addCriterion("shipProvince <", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceLessThanOrEqualTo(String value) {
            addCriterion("shipProvince <=", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceLike(String value) {
            addCriterion("shipProvince like", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceNotLike(String value) {
            addCriterion("shipProvince not like", value, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceIn(List<String> values) {
            addCriterion("shipProvince in", values, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceNotIn(List<String> values) {
            addCriterion("shipProvince not in", values, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceBetween(String value1, String value2) {
            addCriterion("shipProvince between", value1, value2, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipprovinceNotBetween(String value1, String value2) {
            addCriterion("shipProvince not between", value1, value2, "shipprovince");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNull() {
            addCriterion("shipCity is null");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNotNull() {
            addCriterion("shipCity is not null");
            return (Criteria) this;
        }

        public Criteria andShipcityEqualTo(String value) {
            addCriterion("shipCity =", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotEqualTo(String value) {
            addCriterion("shipCity <>", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThan(String value) {
            addCriterion("shipCity >", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThanOrEqualTo(String value) {
            addCriterion("shipCity >=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThan(String value) {
            addCriterion("shipCity <", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThanOrEqualTo(String value) {
            addCriterion("shipCity <=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLike(String value) {
            addCriterion("shipCity like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotLike(String value) {
            addCriterion("shipCity not like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityIn(List<String> values) {
            addCriterion("shipCity in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotIn(List<String> values) {
            addCriterion("shipCity not in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityBetween(String value1, String value2) {
            addCriterion("shipCity between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotBetween(String value1, String value2) {
            addCriterion("shipCity not between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShiptownIsNull() {
            addCriterion("shipTown is null");
            return (Criteria) this;
        }

        public Criteria andShiptownIsNotNull() {
            addCriterion("shipTown is not null");
            return (Criteria) this;
        }

        public Criteria andShiptownEqualTo(String value) {
            addCriterion("shipTown =", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownNotEqualTo(String value) {
            addCriterion("shipTown <>", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownGreaterThan(String value) {
            addCriterion("shipTown >", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownGreaterThanOrEqualTo(String value) {
            addCriterion("shipTown >=", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownLessThan(String value) {
            addCriterion("shipTown <", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownLessThanOrEqualTo(String value) {
            addCriterion("shipTown <=", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownLike(String value) {
            addCriterion("shipTown like", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownNotLike(String value) {
            addCriterion("shipTown not like", value, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownIn(List<String> values) {
            addCriterion("shipTown in", values, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownNotIn(List<String> values) {
            addCriterion("shipTown not in", values, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownBetween(String value1, String value2) {
            addCriterion("shipTown between", value1, value2, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShiptownNotBetween(String value1, String value2) {
            addCriterion("shipTown not between", value1, value2, "shiptown");
            return (Criteria) this;
        }

        public Criteria andShipaddressIsNull() {
            addCriterion("shipAddress is null");
            return (Criteria) this;
        }

        public Criteria andShipaddressIsNotNull() {
            addCriterion("shipAddress is not null");
            return (Criteria) this;
        }

        public Criteria andShipaddressEqualTo(String value) {
            addCriterion("shipAddress =", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotEqualTo(String value) {
            addCriterion("shipAddress <>", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressGreaterThan(String value) {
            addCriterion("shipAddress >", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipAddress >=", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLessThan(String value) {
            addCriterion("shipAddress <", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLessThanOrEqualTo(String value) {
            addCriterion("shipAddress <=", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLike(String value) {
            addCriterion("shipAddress like", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotLike(String value) {
            addCriterion("shipAddress not like", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressIn(List<String> values) {
            addCriterion("shipAddress in", values, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotIn(List<String> values) {
            addCriterion("shipAddress not in", values, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressBetween(String value1, String value2) {
            addCriterion("shipAddress between", value1, value2, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotBetween(String value1, String value2) {
            addCriterion("shipAddress not between", value1, value2, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShippostcodeIsNull() {
            addCriterion("shipPostCode is null");
            return (Criteria) this;
        }

        public Criteria andShippostcodeIsNotNull() {
            addCriterion("shipPostCode is not null");
            return (Criteria) this;
        }

        public Criteria andShippostcodeEqualTo(String value) {
            addCriterion("shipPostCode =", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeNotEqualTo(String value) {
            addCriterion("shipPostCode <>", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeGreaterThan(String value) {
            addCriterion("shipPostCode >", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipPostCode >=", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeLessThan(String value) {
            addCriterion("shipPostCode <", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeLessThanOrEqualTo(String value) {
            addCriterion("shipPostCode <=", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeLike(String value) {
            addCriterion("shipPostCode like", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeNotLike(String value) {
            addCriterion("shipPostCode not like", value, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeIn(List<String> values) {
            addCriterion("shipPostCode in", values, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeNotIn(List<String> values) {
            addCriterion("shipPostCode not in", values, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeBetween(String value1, String value2) {
            addCriterion("shipPostCode between", value1, value2, "shippostcode");
            return (Criteria) this;
        }

        public Criteria andShippostcodeNotBetween(String value1, String value2) {
            addCriterion("shipPostCode not between", value1, value2, "shippostcode");
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