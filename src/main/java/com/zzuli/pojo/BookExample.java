package com.zzuli.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBNameIsNull() {
            addCriterion("b_name is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("b_name =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("b_name <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("b_name >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_name >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("b_name <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("b_name <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("b_name like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("b_name not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("b_name in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("b_name not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("b_name between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("b_name not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBCountsIsNull() {
            addCriterion("b_counts is null");
            return (Criteria) this;
        }

        public Criteria andBCountsIsNotNull() {
            addCriterion("b_counts is not null");
            return (Criteria) this;
        }

        public Criteria andBCountsEqualTo(Integer value) {
            addCriterion("b_counts =", value, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsNotEqualTo(Integer value) {
            addCriterion("b_counts <>", value, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsGreaterThan(Integer value) {
            addCriterion("b_counts >", value, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_counts >=", value, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsLessThan(Integer value) {
            addCriterion("b_counts <", value, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsLessThanOrEqualTo(Integer value) {
            addCriterion("b_counts <=", value, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsIn(List<Integer> values) {
            addCriterion("b_counts in", values, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsNotIn(List<Integer> values) {
            addCriterion("b_counts not in", values, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsBetween(Integer value1, Integer value2) {
            addCriterion("b_counts between", value1, value2, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("b_counts not between", value1, value2, "bCounts");
            return (Criteria) this;
        }

        public Criteria andBDetailIsNull() {
            addCriterion("b_detail is null");
            return (Criteria) this;
        }

        public Criteria andBDetailIsNotNull() {
            addCriterion("b_detail is not null");
            return (Criteria) this;
        }

        public Criteria andBDetailEqualTo(String value) {
            addCriterion("b_detail =", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailNotEqualTo(String value) {
            addCriterion("b_detail <>", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailGreaterThan(String value) {
            addCriterion("b_detail >", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailGreaterThanOrEqualTo(String value) {
            addCriterion("b_detail >=", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailLessThan(String value) {
            addCriterion("b_detail <", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailLessThanOrEqualTo(String value) {
            addCriterion("b_detail <=", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailLike(String value) {
            addCriterion("b_detail like", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailNotLike(String value) {
            addCriterion("b_detail not like", value, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailIn(List<String> values) {
            addCriterion("b_detail in", values, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailNotIn(List<String> values) {
            addCriterion("b_detail not in", values, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailBetween(String value1, String value2) {
            addCriterion("b_detail between", value1, value2, "bDetail");
            return (Criteria) this;
        }

        public Criteria andBDetailNotBetween(String value1, String value2) {
            addCriterion("b_detail not between", value1, value2, "bDetail");
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