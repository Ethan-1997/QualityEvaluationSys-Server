package com.qualityevaluationsys.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class LaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LaterExample() {
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

        public Criteria andLidIsNull() {
            addCriterion("Lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("Lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("Lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("Lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("Lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("Lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("Lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("Lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("Lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("Lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("Lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("Ltime is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("Ltime is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(String value) {
            addCriterion("Ltime =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(String value) {
            addCriterion("Ltime <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(String value) {
            addCriterion("Ltime >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(String value) {
            addCriterion("Ltime >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(String value) {
            addCriterion("Ltime <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(String value) {
            addCriterion("Ltime <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLike(String value) {
            addCriterion("Ltime like", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotLike(String value) {
            addCriterion("Ltime not like", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<String> values) {
            addCriterion("Ltime in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<String> values) {
            addCriterion("Ltime not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(String value1, String value2) {
            addCriterion("Ltime between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(String value1, String value2) {
            addCriterion("Ltime not between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLdayIsNull() {
            addCriterion("Lday is null");
            return (Criteria) this;
        }

        public Criteria andLdayIsNotNull() {
            addCriterion("Lday is not null");
            return (Criteria) this;
        }

        public Criteria andLdayEqualTo(Integer value) {
            addCriterion("Lday =", value, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayNotEqualTo(Integer value) {
            addCriterion("Lday <>", value, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayGreaterThan(Integer value) {
            addCriterion("Lday >", value, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("Lday >=", value, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayLessThan(Integer value) {
            addCriterion("Lday <", value, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayLessThanOrEqualTo(Integer value) {
            addCriterion("Lday <=", value, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayIn(List<Integer> values) {
            addCriterion("Lday in", values, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayNotIn(List<Integer> values) {
            addCriterion("Lday not in", values, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayBetween(Integer value1, Integer value2) {
            addCriterion("Lday between", value1, value2, "lday");
            return (Criteria) this;
        }

        public Criteria andLdayNotBetween(Integer value1, Integer value2) {
            addCriterion("Lday not between", value1, value2, "lday");
            return (Criteria) this;
        }

        public Criteria andLreasionIsNull() {
            addCriterion("Lreasion is null");
            return (Criteria) this;
        }

        public Criteria andLreasionIsNotNull() {
            addCriterion("Lreasion is not null");
            return (Criteria) this;
        }

        public Criteria andLreasionEqualTo(String value) {
            addCriterion("Lreasion =", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionNotEqualTo(String value) {
            addCriterion("Lreasion <>", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionGreaterThan(String value) {
            addCriterion("Lreasion >", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionGreaterThanOrEqualTo(String value) {
            addCriterion("Lreasion >=", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionLessThan(String value) {
            addCriterion("Lreasion <", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionLessThanOrEqualTo(String value) {
            addCriterion("Lreasion <=", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionLike(String value) {
            addCriterion("Lreasion like", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionNotLike(String value) {
            addCriterion("Lreasion not like", value, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionIn(List<String> values) {
            addCriterion("Lreasion in", values, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionNotIn(List<String> values) {
            addCriterion("Lreasion not in", values, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionBetween(String value1, String value2) {
            addCriterion("Lreasion between", value1, value2, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLreasionNotBetween(String value1, String value2) {
            addCriterion("Lreasion not between", value1, value2, "lreasion");
            return (Criteria) this;
        }

        public Criteria andLapproverIsNull() {
            addCriterion("Lapprover is null");
            return (Criteria) this;
        }

        public Criteria andLapproverIsNotNull() {
            addCriterion("Lapprover is not null");
            return (Criteria) this;
        }

        public Criteria andLapproverEqualTo(String value) {
            addCriterion("Lapprover =", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverNotEqualTo(String value) {
            addCriterion("Lapprover <>", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverGreaterThan(String value) {
            addCriterion("Lapprover >", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverGreaterThanOrEqualTo(String value) {
            addCriterion("Lapprover >=", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverLessThan(String value) {
            addCriterion("Lapprover <", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverLessThanOrEqualTo(String value) {
            addCriterion("Lapprover <=", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverLike(String value) {
            addCriterion("Lapprover like", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverNotLike(String value) {
            addCriterion("Lapprover not like", value, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverIn(List<String> values) {
            addCriterion("Lapprover in", values, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverNotIn(List<String> values) {
            addCriterion("Lapprover not in", values, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverBetween(String value1, String value2) {
            addCriterion("Lapprover between", value1, value2, "lapprover");
            return (Criteria) this;
        }

        public Criteria andLapproverNotBetween(String value1, String value2) {
            addCriterion("Lapprover not between", value1, value2, "lapprover");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSclassIsNull() {
            addCriterion("sclass is null");
            return (Criteria) this;
        }

        public Criteria andSclassIsNotNull() {
            addCriterion("sclass is not null");
            return (Criteria) this;
        }

        public Criteria andSclassEqualTo(String value) {
            addCriterion("sclass =", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotEqualTo(String value) {
            addCriterion("sclass <>", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThan(String value) {
            addCriterion("sclass >", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThanOrEqualTo(String value) {
            addCriterion("sclass >=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThan(String value) {
            addCriterion("sclass <", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThanOrEqualTo(String value) {
            addCriterion("sclass <=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLike(String value) {
            addCriterion("sclass like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotLike(String value) {
            addCriterion("sclass not like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassIn(List<String> values) {
            addCriterion("sclass in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotIn(List<String> values) {
            addCriterion("sclass not in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassBetween(String value1, String value2) {
            addCriterion("sclass between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotBetween(String value1, String value2) {
            addCriterion("sclass not between", value1, value2, "sclass");
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