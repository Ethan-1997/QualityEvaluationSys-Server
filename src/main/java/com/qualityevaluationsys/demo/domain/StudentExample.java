package com.qualityevaluationsys.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public StudentExample() {
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

    private List	list;

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

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
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

        public Criteria andSnameIsNull() {
            addCriterion("Sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("Sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("Sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("Sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("Sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("Sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("Sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("Sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("Sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("Sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("Sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("Sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("Sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("Sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("Ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("Ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("Ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("Ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("Ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("Ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("Ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("Ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("Ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("Ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("Ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("Ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("Ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("Ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSclassIsNull() {
            addCriterion("Sclass is null");
            return (Criteria) this;
        }

        public Criteria andSclassIsNotNull() {
            addCriterion("Sclass is not null");
            return (Criteria) this;
        }

        public Criteria andSclassEqualTo(String value) {
            addCriterion("Sclass =", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotEqualTo(String value) {
            addCriterion("Sclass <>", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThan(String value) {
            addCriterion("Sclass >", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThanOrEqualTo(String value) {
            addCriterion("Sclass >=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThan(String value) {
            addCriterion("Sclass <", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThanOrEqualTo(String value) {
            addCriterion("Sclass <=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLike(String value) {
            addCriterion("Sclass like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotLike(String value) {
            addCriterion("Sclass not like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassIn(List<String> values) {
            addCriterion("Sclass in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotIn(List<String> values) {
            addCriterion("Sclass not in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassBetween(String value1, String value2) {
            addCriterion("Sclass between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotBetween(String value1, String value2) {
            addCriterion("Sclass not between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("Birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("Birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(String value) {
            addCriterion("Birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(String value) {
            addCriterion("Birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(String value) {
            addCriterion("Birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(String value) {
            addCriterion("Birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(String value) {
            addCriterion("Birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(String value) {
            addCriterion("Birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLike(String value) {
            addCriterion("Birth like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotLike(String value) {
            addCriterion("Birth not like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<String> values) {
            addCriterion("Birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<String> values) {
            addCriterion("Birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(String value1, String value2) {
            addCriterion("Birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(String value1, String value2) {
            addCriterion("Birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("Saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("Saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("Saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("Saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("Saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("Saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("Saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("Saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("Saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("Saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("Saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("Saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("Saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("Saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSdeptIsNull() {
            addCriterion("Sdept is null");
            return (Criteria) this;
        }

        public Criteria andSdeptIsNotNull() {
            addCriterion("Sdept is not null");
            return (Criteria) this;
        }

        public Criteria andSdeptEqualTo(String value) {
            addCriterion("Sdept =", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotEqualTo(String value) {
            addCriterion("Sdept <>", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptGreaterThan(String value) {
            addCriterion("Sdept >", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptGreaterThanOrEqualTo(String value) {
            addCriterion("Sdept >=", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptLessThan(String value) {
            addCriterion("Sdept <", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptLessThanOrEqualTo(String value) {
            addCriterion("Sdept <=", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptLike(String value) {
            addCriterion("Sdept like", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotLike(String value) {
            addCriterion("Sdept not like", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptIn(List<String> values) {
            addCriterion("Sdept in", values, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotIn(List<String> values) {
            addCriterion("Sdept not in", values, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptBetween(String value1, String value2) {
            addCriterion("Sdept between", value1, value2, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotBetween(String value1, String value2) {
            addCriterion("Sdept not between", value1, value2, "sdept");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("Stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("Stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(String value) {
            addCriterion("Stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(String value) {
            addCriterion("Stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(String value) {
            addCriterion("Stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(String value) {
            addCriterion("Stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(String value) {
            addCriterion("Stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(String value) {
            addCriterion("Stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLike(String value) {
            addCriterion("Stime like", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotLike(String value) {
            addCriterion("Stime not like", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<String> values) {
            addCriterion("Stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<String> values) {
            addCriterion("Stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(String value1, String value2) {
            addCriterion("Stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(String value1, String value2) {
            addCriterion("Stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andSsignatureIsNull() {
            addCriterion("Ssignature is null");
            return (Criteria) this;
        }

        public Criteria andSsignatureIsNotNull() {
            addCriterion("Ssignature is not null");
            return (Criteria) this;
        }

        public Criteria andSsignatureEqualTo(String value) {
            addCriterion("Ssignature =", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureNotEqualTo(String value) {
            addCriterion("Ssignature <>", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureGreaterThan(String value) {
            addCriterion("Ssignature >", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureGreaterThanOrEqualTo(String value) {
            addCriterion("Ssignature >=", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureLessThan(String value) {
            addCriterion("Ssignature <", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureLessThanOrEqualTo(String value) {
            addCriterion("Ssignature <=", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureLike(String value) {
            addCriterion("Ssignature like", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureNotLike(String value) {
            addCriterion("Ssignature not like", value, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureIn(List<String> values) {
            addCriterion("Ssignature in", values, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureNotIn(List<String> values) {
            addCriterion("Ssignature not in", values, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureBetween(String value1, String value2) {
            addCriterion("Ssignature between", value1, value2, "ssignature");
            return (Criteria) this;
        }

        public Criteria andSsignatureNotBetween(String value1, String value2) {
            addCriterion("Ssignature not between", value1, value2, "ssignature");
            return (Criteria) this;
        }

        public Criteria andStelIsNull() {
            addCriterion("Stel is null");
            return (Criteria) this;
        }

        public Criteria andStelIsNotNull() {
            addCriterion("Stel is not null");
            return (Criteria) this;
        }

        public Criteria andStelEqualTo(String value) {
            addCriterion("Stel =", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotEqualTo(String value) {
            addCriterion("Stel <>", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelGreaterThan(String value) {
            addCriterion("Stel >", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelGreaterThanOrEqualTo(String value) {
            addCriterion("Stel >=", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLessThan(String value) {
            addCriterion("Stel <", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLessThanOrEqualTo(String value) {
            addCriterion("Stel <=", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLike(String value) {
            addCriterion("Stel like", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotLike(String value) {
            addCriterion("Stel not like", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelIn(List<String> values) {
            addCriterion("Stel in", values, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotIn(List<String> values) {
            addCriterion("Stel not in", values, "stel");
            return (Criteria) this;
        }

        public Criteria andStelBetween(String value1, String value2) {
            addCriterion("Stel between", value1, value2, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotBetween(String value1, String value2) {
            addCriterion("Stel not between", value1, value2, "stel");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceIsNull() {
            addCriterion("CareerExperience is null");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceIsNotNull() {
            addCriterion("CareerExperience is not null");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceEqualTo(String value) {
            addCriterion("CareerExperience =", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceNotEqualTo(String value) {
            addCriterion("CareerExperience <>", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceGreaterThan(String value) {
            addCriterion("CareerExperience >", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("CareerExperience >=", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceLessThan(String value) {
            addCriterion("CareerExperience <", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceLessThanOrEqualTo(String value) {
            addCriterion("CareerExperience <=", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceLike(String value) {
            addCriterion("CareerExperience like", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceNotLike(String value) {
            addCriterion("CareerExperience not like", value, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceIn(List<String> values) {
            addCriterion("CareerExperience in", values, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceNotIn(List<String> values) {
            addCriterion("CareerExperience not in", values, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceBetween(String value1, String value2) {
            addCriterion("CareerExperience between", value1, value2, "careerexperience");
            return (Criteria) this;
        }

        public Criteria andCareerexperienceNotBetween(String value1, String value2) {
            addCriterion("CareerExperience not between", value1, value2, "careerexperience");
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