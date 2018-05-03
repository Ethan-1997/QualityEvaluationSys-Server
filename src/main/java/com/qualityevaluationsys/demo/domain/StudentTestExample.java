package com.qualityevaluationsys.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public StudentTestExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTidIsNull() {
            addCriterion("Tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("Tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("Tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("Tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("Tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("Tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("Tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("Tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("Tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("Tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("Tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("Tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("Tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("Tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("Sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("Sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("Sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("Sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("Sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("Sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("Sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("Sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("Sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("Sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("Sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("Sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("Tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("Tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("Tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("Tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("Tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("Tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("Tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("Tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("Tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("Tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("Tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("Tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("Tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("Tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTdateIsNull() {
            addCriterion("Tdate is null");
            return (Criteria) this;
        }

        public Criteria andTdateIsNotNull() {
            addCriterion("Tdate is not null");
            return (Criteria) this;
        }

        public Criteria andTdateEqualTo(String value) {
            addCriterion("Tdate =", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotEqualTo(String value) {
            addCriterion("Tdate <>", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThan(String value) {
            addCriterion("Tdate >", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThanOrEqualTo(String value) {
            addCriterion("Tdate >=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThan(String value) {
            addCriterion("Tdate <", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThanOrEqualTo(String value) {
            addCriterion("Tdate <=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLike(String value) {
            addCriterion("Tdate like", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotLike(String value) {
            addCriterion("Tdate not like", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateIn(List<String> values) {
            addCriterion("Tdate in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotIn(List<String> values) {
            addCriterion("Tdate not in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateBetween(String value1, String value2) {
            addCriterion("Tdate between", value1, value2, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotBetween(String value1, String value2) {
            addCriterion("Tdate not between", value1, value2, "tdate");
            return (Criteria) this;
        }

        public Criteria andSstateIsNull() {
            addCriterion("Sstate is null");
            return (Criteria) this;
        }

        public Criteria andSstateIsNotNull() {
            addCriterion("Sstate is not null");
            return (Criteria) this;
        }

        public Criteria andSstateEqualTo(String value) {
            addCriterion("Sstate =", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotEqualTo(String value) {
            addCriterion("Sstate <>", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThan(String value) {
            addCriterion("Sstate >", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThanOrEqualTo(String value) {
            addCriterion("Sstate >=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThan(String value) {
            addCriterion("Sstate <", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThanOrEqualTo(String value) {
            addCriterion("Sstate <=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLike(String value) {
            addCriterion("Sstate like", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotLike(String value) {
            addCriterion("Sstate not like", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateIn(List<String> values) {
            addCriterion("Sstate in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotIn(List<String> values) {
            addCriterion("Sstate not in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateBetween(String value1, String value2) {
            addCriterion("Sstate between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotBetween(String value1, String value2) {
            addCriterion("Sstate not between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNull() {
            addCriterion("Sgrade is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("Sgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(Integer value) {
            addCriterion("Sgrade =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(Integer value) {
            addCriterion("Sgrade <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(Integer value) {
            addCriterion("Sgrade >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sgrade >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(Integer value) {
            addCriterion("Sgrade <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(Integer value) {
            addCriterion("Sgrade <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<Integer> values) {
            addCriterion("Sgrade in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<Integer> values) {
            addCriterion("Sgrade not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(Integer value1, Integer value2) {
            addCriterion("Sgrade between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Sgrade not between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSradioIsNull() {
            addCriterion("Sradio is null");
            return (Criteria) this;
        }

        public Criteria andSradioIsNotNull() {
            addCriterion("Sradio is not null");
            return (Criteria) this;
        }

        public Criteria andSradioEqualTo(String value) {
            addCriterion("Sradio =", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioNotEqualTo(String value) {
            addCriterion("Sradio <>", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioGreaterThan(String value) {
            addCriterion("Sradio >", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioGreaterThanOrEqualTo(String value) {
            addCriterion("Sradio >=", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioLessThan(String value) {
            addCriterion("Sradio <", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioLessThanOrEqualTo(String value) {
            addCriterion("Sradio <=", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioLike(String value) {
            addCriterion("Sradio like", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioNotLike(String value) {
            addCriterion("Sradio not like", value, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioIn(List<String> values) {
            addCriterion("Sradio in", values, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioNotIn(List<String> values) {
            addCriterion("Sradio not in", values, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioBetween(String value1, String value2) {
            addCriterion("Sradio between", value1, value2, "sradio");
            return (Criteria) this;
        }

        public Criteria andSradioNotBetween(String value1, String value2) {
            addCriterion("Sradio not between", value1, value2, "sradio");
            return (Criteria) this;
        }
    }

    /**
     */
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