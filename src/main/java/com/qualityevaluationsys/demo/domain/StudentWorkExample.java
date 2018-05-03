package com.qualityevaluationsys.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public StudentWorkExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("Wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("Wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("Wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("Wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("Wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("Wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("Wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("Wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("Wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("Wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("Wid not between", value1, value2, "wid");
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

        public Criteria andUptimeIsNull() {
            addCriterion("upTime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("upTime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("upTime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("upTime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("upTime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("upTime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("upTime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("upTime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("upTime like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("upTime not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("upTime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("upTime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("upTime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("upTime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusIsNull() {
            addCriterion("submitStatus is null");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusIsNotNull() {
            addCriterion("submitStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusEqualTo(String value) {
            addCriterion("submitStatus =", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusNotEqualTo(String value) {
            addCriterion("submitStatus <>", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusGreaterThan(String value) {
            addCriterion("submitStatus >", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusGreaterThanOrEqualTo(String value) {
            addCriterion("submitStatus >=", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusLessThan(String value) {
            addCriterion("submitStatus <", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusLessThanOrEqualTo(String value) {
            addCriterion("submitStatus <=", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusLike(String value) {
            addCriterion("submitStatus like", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusNotLike(String value) {
            addCriterion("submitStatus not like", value, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusIn(List<String> values) {
            addCriterion("submitStatus in", values, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusNotIn(List<String> values) {
            addCriterion("submitStatus not in", values, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusBetween(String value1, String value2) {
            addCriterion("submitStatus between", value1, value2, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andSubmitstatusNotBetween(String value1, String value2) {
            addCriterion("submitStatus not between", value1, value2, "submitstatus");
            return (Criteria) this;
        }

        public Criteria andFilelistIsNull() {
            addCriterion("fileList is null");
            return (Criteria) this;
        }

        public Criteria andFilelistIsNotNull() {
            addCriterion("fileList is not null");
            return (Criteria) this;
        }

        public Criteria andFilelistEqualTo(String value) {
            addCriterion("fileList =", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotEqualTo(String value) {
            addCriterion("fileList <>", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistGreaterThan(String value) {
            addCriterion("fileList >", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistGreaterThanOrEqualTo(String value) {
            addCriterion("fileList >=", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLessThan(String value) {
            addCriterion("fileList <", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLessThanOrEqualTo(String value) {
            addCriterion("fileList <=", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLike(String value) {
            addCriterion("fileList like", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotLike(String value) {
            addCriterion("fileList not like", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistIn(List<String> values) {
            addCriterion("fileList in", values, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotIn(List<String> values) {
            addCriterion("fileList not in", values, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistBetween(String value1, String value2) {
            addCriterion("fileList between", value1, value2, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotBetween(String value1, String value2) {
            addCriterion("fileList not between", value1, value2, "filelist");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
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