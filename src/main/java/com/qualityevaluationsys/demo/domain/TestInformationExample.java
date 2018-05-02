package com.qualityevaluationsys.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class TestInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TestInformationExample() {
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

        public Criteria andTtypeIsNull() {
            addCriterion("Ttype is null");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNotNull() {
            addCriterion("Ttype is not null");
            return (Criteria) this;
        }

        public Criteria andTtypeEqualTo(String value) {
            addCriterion("Ttype =", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotEqualTo(String value) {
            addCriterion("Ttype <>", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThan(String value) {
            addCriterion("Ttype >", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThanOrEqualTo(String value) {
            addCriterion("Ttype >=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThan(String value) {
            addCriterion("Ttype <", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThanOrEqualTo(String value) {
            addCriterion("Ttype <=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLike(String value) {
            addCriterion("Ttype like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotLike(String value) {
            addCriterion("Ttype not like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeIn(List<String> values) {
            addCriterion("Ttype in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotIn(List<String> values) {
            addCriterion("Ttype not in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeBetween(String value1, String value2) {
            addCriterion("Ttype between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotBetween(String value1, String value2) {
            addCriterion("Ttype not between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTcontentIsNull() {
            addCriterion("Tcontent is null");
            return (Criteria) this;
        }

        public Criteria andTcontentIsNotNull() {
            addCriterion("Tcontent is not null");
            return (Criteria) this;
        }

        public Criteria andTcontentEqualTo(String value) {
            addCriterion("Tcontent =", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotEqualTo(String value) {
            addCriterion("Tcontent <>", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentGreaterThan(String value) {
            addCriterion("Tcontent >", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentGreaterThanOrEqualTo(String value) {
            addCriterion("Tcontent >=", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentLessThan(String value) {
            addCriterion("Tcontent <", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentLessThanOrEqualTo(String value) {
            addCriterion("Tcontent <=", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentLike(String value) {
            addCriterion("Tcontent like", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotLike(String value) {
            addCriterion("Tcontent not like", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentIn(List<String> values) {
            addCriterion("Tcontent in", values, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotIn(List<String> values) {
            addCriterion("Tcontent not in", values, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentBetween(String value1, String value2) {
            addCriterion("Tcontent between", value1, value2, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotBetween(String value1, String value2) {
            addCriterion("Tcontent not between", value1, value2, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTanswerIsNull() {
            addCriterion("Tanswer is null");
            return (Criteria) this;
        }

        public Criteria andTanswerIsNotNull() {
            addCriterion("Tanswer is not null");
            return (Criteria) this;
        }

        public Criteria andTanswerEqualTo(String value) {
            addCriterion("Tanswer =", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerNotEqualTo(String value) {
            addCriterion("Tanswer <>", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerGreaterThan(String value) {
            addCriterion("Tanswer >", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerGreaterThanOrEqualTo(String value) {
            addCriterion("Tanswer >=", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerLessThan(String value) {
            addCriterion("Tanswer <", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerLessThanOrEqualTo(String value) {
            addCriterion("Tanswer <=", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerLike(String value) {
            addCriterion("Tanswer like", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerNotLike(String value) {
            addCriterion("Tanswer not like", value, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerIn(List<String> values) {
            addCriterion("Tanswer in", values, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerNotIn(List<String> values) {
            addCriterion("Tanswer not in", values, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerBetween(String value1, String value2) {
            addCriterion("Tanswer between", value1, value2, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTanswerNotBetween(String value1, String value2) {
            addCriterion("Tanswer not between", value1, value2, "tanswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerIsNull() {
            addCriterion("TuserAnswer is null");
            return (Criteria) this;
        }

        public Criteria andTuseranswerIsNotNull() {
            addCriterion("TuserAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andTuseranswerEqualTo(String value) {
            addCriterion("TuserAnswer =", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerNotEqualTo(String value) {
            addCriterion("TuserAnswer <>", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerGreaterThan(String value) {
            addCriterion("TuserAnswer >", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerGreaterThanOrEqualTo(String value) {
            addCriterion("TuserAnswer >=", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerLessThan(String value) {
            addCriterion("TuserAnswer <", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerLessThanOrEqualTo(String value) {
            addCriterion("TuserAnswer <=", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerLike(String value) {
            addCriterion("TuserAnswer like", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerNotLike(String value) {
            addCriterion("TuserAnswer not like", value, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerIn(List<String> values) {
            addCriterion("TuserAnswer in", values, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerNotIn(List<String> values) {
            addCriterion("TuserAnswer not in", values, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerBetween(String value1, String value2) {
            addCriterion("TuserAnswer between", value1, value2, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andTuseranswerNotBetween(String value1, String value2) {
            addCriterion("TuserAnswer not between", value1, value2, "tuseranswer");
            return (Criteria) this;
        }

        public Criteria andToptionIsNull() {
            addCriterion("Toption is null");
            return (Criteria) this;
        }

        public Criteria andToptionIsNotNull() {
            addCriterion("Toption is not null");
            return (Criteria) this;
        }

        public Criteria andToptionEqualTo(String value) {
            addCriterion("Toption =", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionNotEqualTo(String value) {
            addCriterion("Toption <>", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionGreaterThan(String value) {
            addCriterion("Toption >", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionGreaterThanOrEqualTo(String value) {
            addCriterion("Toption >=", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionLessThan(String value) {
            addCriterion("Toption <", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionLessThanOrEqualTo(String value) {
            addCriterion("Toption <=", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionLike(String value) {
            addCriterion("Toption like", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionNotLike(String value) {
            addCriterion("Toption not like", value, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionIn(List<String> values) {
            addCriterion("Toption in", values, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionNotIn(List<String> values) {
            addCriterion("Toption not in", values, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionBetween(String value1, String value2) {
            addCriterion("Toption between", value1, value2, "toption");
            return (Criteria) this;
        }

        public Criteria andToptionNotBetween(String value1, String value2) {
            addCriterion("Toption not between", value1, value2, "toption");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNull() {
            addCriterion("testType is null");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNotNull() {
            addCriterion("testType is not null");
            return (Criteria) this;
        }

        public Criteria andTesttypeEqualTo(String value) {
            addCriterion("testType =", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotEqualTo(String value) {
            addCriterion("testType <>", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThan(String value) {
            addCriterion("testType >", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThanOrEqualTo(String value) {
            addCriterion("testType >=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThan(String value) {
            addCriterion("testType <", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThanOrEqualTo(String value) {
            addCriterion("testType <=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLike(String value) {
            addCriterion("testType like", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotLike(String value) {
            addCriterion("testType not like", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeIn(List<String> values) {
            addCriterion("testType in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotIn(List<String> values) {
            addCriterion("testType not in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeBetween(String value1, String value2) {
            addCriterion("testType between", value1, value2, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotBetween(String value1, String value2) {
            addCriterion("testType not between", value1, value2, "testtype");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(String value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(String value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(String value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(String value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(String value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLike(String value) {
            addCriterion("display like", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotLike(String value) {
            addCriterion("display not like", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<String> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<String> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(String value1, String value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(String value1, String value2) {
            addCriterion("display not between", value1, value2, "display");
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