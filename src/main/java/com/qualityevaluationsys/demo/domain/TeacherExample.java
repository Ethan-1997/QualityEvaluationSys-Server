package com.qualityevaluationsys.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TeacherExample() {
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

        public Criteria andTnoIsNull() {
            addCriterion("Tno is null");
            return (Criteria) this;
        }

        public Criteria andTnoIsNotNull() {
            addCriterion("Tno is not null");
            return (Criteria) this;
        }

        public Criteria andTnoEqualTo(Integer value) {
            addCriterion("Tno =", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotEqualTo(Integer value) {
            addCriterion("Tno <>", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThan(Integer value) {
            addCriterion("Tno >", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Tno >=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThan(Integer value) {
            addCriterion("Tno <", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThanOrEqualTo(Integer value) {
            addCriterion("Tno <=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoIn(List<Integer> values) {
            addCriterion("Tno in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotIn(List<Integer> values) {
            addCriterion("Tno not in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoBetween(Integer value1, Integer value2) {
            addCriterion("Tno between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotBetween(Integer value1, Integer value2) {
            addCriterion("Tno not between", value1, value2, "tno");
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

        public Criteria andTtimeIsNull() {
            addCriterion("Ttime is null");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNotNull() {
            addCriterion("Ttime is not null");
            return (Criteria) this;
        }

        public Criteria andTtimeEqualTo(String value) {
            addCriterion("Ttime =", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotEqualTo(String value) {
            addCriterion("Ttime <>", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThan(String value) {
            addCriterion("Ttime >", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThanOrEqualTo(String value) {
            addCriterion("Ttime >=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThan(String value) {
            addCriterion("Ttime <", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThanOrEqualTo(String value) {
            addCriterion("Ttime <=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLike(String value) {
            addCriterion("Ttime like", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotLike(String value) {
            addCriterion("Ttime not like", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeIn(List<String> values) {
            addCriterion("Ttime in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotIn(List<String> values) {
            addCriterion("Ttime not in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeBetween(String value1, String value2) {
            addCriterion("Ttime between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotBetween(String value1, String value2) {
            addCriterion("Ttime not between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andTintroduceIsNull() {
            addCriterion("TIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andTintroduceIsNotNull() {
            addCriterion("TIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andTintroduceEqualTo(String value) {
            addCriterion("TIntroduce =", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceNotEqualTo(String value) {
            addCriterion("TIntroduce <>", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceGreaterThan(String value) {
            addCriterion("TIntroduce >", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("TIntroduce >=", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceLessThan(String value) {
            addCriterion("TIntroduce <", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceLessThanOrEqualTo(String value) {
            addCriterion("TIntroduce <=", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceLike(String value) {
            addCriterion("TIntroduce like", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceNotLike(String value) {
            addCriterion("TIntroduce not like", value, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceIn(List<String> values) {
            addCriterion("TIntroduce in", values, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceNotIn(List<String> values) {
            addCriterion("TIntroduce not in", values, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceBetween(String value1, String value2) {
            addCriterion("TIntroduce between", value1, value2, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTintroduceNotBetween(String value1, String value2) {
            addCriterion("TIntroduce not between", value1, value2, "tintroduce");
            return (Criteria) this;
        }

        public Criteria andTsexIsNull() {
            addCriterion("Tsex is null");
            return (Criteria) this;
        }

        public Criteria andTsexIsNotNull() {
            addCriterion("Tsex is not null");
            return (Criteria) this;
        }

        public Criteria andTsexEqualTo(String value) {
            addCriterion("Tsex =", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotEqualTo(String value) {
            addCriterion("Tsex <>", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThan(String value) {
            addCriterion("Tsex >", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThanOrEqualTo(String value) {
            addCriterion("Tsex >=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThan(String value) {
            addCriterion("Tsex <", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThanOrEqualTo(String value) {
            addCriterion("Tsex <=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLike(String value) {
            addCriterion("Tsex like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotLike(String value) {
            addCriterion("Tsex not like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexIn(List<String> values) {
            addCriterion("Tsex in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotIn(List<String> values) {
            addCriterion("Tsex not in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexBetween(String value1, String value2) {
            addCriterion("Tsex between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotBetween(String value1, String value2) {
            addCriterion("Tsex not between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTwageIsNull() {
            addCriterion("Twage is null");
            return (Criteria) this;
        }

        public Criteria andTwageIsNotNull() {
            addCriterion("Twage is not null");
            return (Criteria) this;
        }

        public Criteria andTwageEqualTo(Float value) {
            addCriterion("Twage =", value, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageNotEqualTo(Float value) {
            addCriterion("Twage <>", value, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageGreaterThan(Float value) {
            addCriterion("Twage >", value, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageGreaterThanOrEqualTo(Float value) {
            addCriterion("Twage >=", value, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageLessThan(Float value) {
            addCriterion("Twage <", value, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageLessThanOrEqualTo(Float value) {
            addCriterion("Twage <=", value, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageIn(List<Float> values) {
            addCriterion("Twage in", values, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageNotIn(List<Float> values) {
            addCriterion("Twage not in", values, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageBetween(Float value1, Float value2) {
            addCriterion("Twage between", value1, value2, "twage");
            return (Criteria) this;
        }

        public Criteria andTwageNotBetween(Float value1, Float value2) {
            addCriterion("Twage not between", value1, value2, "twage");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("Cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("Cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("Cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("Cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("Cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("Cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("Cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("Cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("Cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("Cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("Cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andUnoIsNull() {
            addCriterion("Uno is null");
            return (Criteria) this;
        }

        public Criteria andUnoIsNotNull() {
            addCriterion("Uno is not null");
            return (Criteria) this;
        }

        public Criteria andUnoEqualTo(Integer value) {
            addCriterion("Uno =", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotEqualTo(Integer value) {
            addCriterion("Uno <>", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThan(Integer value) {
            addCriterion("Uno >", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Uno >=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThan(Integer value) {
            addCriterion("Uno <", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThanOrEqualTo(Integer value) {
            addCriterion("Uno <=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoIn(List<Integer> values) {
            addCriterion("Uno in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotIn(List<Integer> values) {
            addCriterion("Uno not in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoBetween(Integer value1, Integer value2) {
            addCriterion("Uno between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotBetween(Integer value1, Integer value2) {
            addCriterion("Uno not between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andTtelIsNull() {
            addCriterion("Ttel is null");
            return (Criteria) this;
        }

        public Criteria andTtelIsNotNull() {
            addCriterion("Ttel is not null");
            return (Criteria) this;
        }

        public Criteria andTtelEqualTo(String value) {
            addCriterion("Ttel =", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelNotEqualTo(String value) {
            addCriterion("Ttel <>", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelGreaterThan(String value) {
            addCriterion("Ttel >", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelGreaterThanOrEqualTo(String value) {
            addCriterion("Ttel >=", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelLessThan(String value) {
            addCriterion("Ttel <", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelLessThanOrEqualTo(String value) {
            addCriterion("Ttel <=", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelLike(String value) {
            addCriterion("Ttel like", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelNotLike(String value) {
            addCriterion("Ttel not like", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelIn(List<String> values) {
            addCriterion("Ttel in", values, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelNotIn(List<String> values) {
            addCriterion("Ttel not in", values, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelBetween(String value1, String value2) {
            addCriterion("Ttel between", value1, value2, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelNotBetween(String value1, String value2) {
            addCriterion("Ttel not between", value1, value2, "ttel");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("Cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("Cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("Cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("Cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("Cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("Cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("Cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("Cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("Cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("Cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("Cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("Cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("Cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("Cname not between", value1, value2, "cname");
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