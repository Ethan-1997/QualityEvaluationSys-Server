package com.qualityevaluationsys.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class ReviewGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ReviewGradeExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andGrade1IsNull() {
            addCriterion("grade1 is null");
            return (Criteria) this;
        }

        public Criteria andGrade1IsNotNull() {
            addCriterion("grade1 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade1EqualTo(Integer value) {
            addCriterion("grade1 =", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1NotEqualTo(Integer value) {
            addCriterion("grade1 <>", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1GreaterThan(Integer value) {
            addCriterion("grade1 >", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade1 >=", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1LessThan(Integer value) {
            addCriterion("grade1 <", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1LessThanOrEqualTo(Integer value) {
            addCriterion("grade1 <=", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1In(List<Integer> values) {
            addCriterion("grade1 in", values, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1NotIn(List<Integer> values) {
            addCriterion("grade1 not in", values, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1Between(Integer value1, Integer value2) {
            addCriterion("grade1 between", value1, value2, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1NotBetween(Integer value1, Integer value2) {
            addCriterion("grade1 not between", value1, value2, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade2IsNull() {
            addCriterion("grade2 is null");
            return (Criteria) this;
        }

        public Criteria andGrade2IsNotNull() {
            addCriterion("grade2 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade2EqualTo(Integer value) {
            addCriterion("grade2 =", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2NotEqualTo(Integer value) {
            addCriterion("grade2 <>", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2GreaterThan(Integer value) {
            addCriterion("grade2 >", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade2 >=", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2LessThan(Integer value) {
            addCriterion("grade2 <", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2LessThanOrEqualTo(Integer value) {
            addCriterion("grade2 <=", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2In(List<Integer> values) {
            addCriterion("grade2 in", values, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2NotIn(List<Integer> values) {
            addCriterion("grade2 not in", values, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2Between(Integer value1, Integer value2) {
            addCriterion("grade2 between", value1, value2, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2NotBetween(Integer value1, Integer value2) {
            addCriterion("grade2 not between", value1, value2, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade3IsNull() {
            addCriterion("grade3 is null");
            return (Criteria) this;
        }

        public Criteria andGrade3IsNotNull() {
            addCriterion("grade3 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade3EqualTo(Integer value) {
            addCriterion("grade3 =", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3NotEqualTo(Integer value) {
            addCriterion("grade3 <>", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3GreaterThan(Integer value) {
            addCriterion("grade3 >", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade3 >=", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3LessThan(Integer value) {
            addCriterion("grade3 <", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3LessThanOrEqualTo(Integer value) {
            addCriterion("grade3 <=", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3In(List<Integer> values) {
            addCriterion("grade3 in", values, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3NotIn(List<Integer> values) {
            addCriterion("grade3 not in", values, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3Between(Integer value1, Integer value2) {
            addCriterion("grade3 between", value1, value2, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3NotBetween(Integer value1, Integer value2) {
            addCriterion("grade3 not between", value1, value2, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade4IsNull() {
            addCriterion("grade4 is null");
            return (Criteria) this;
        }

        public Criteria andGrade4IsNotNull() {
            addCriterion("grade4 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade4EqualTo(Integer value) {
            addCriterion("grade4 =", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4NotEqualTo(Integer value) {
            addCriterion("grade4 <>", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4GreaterThan(Integer value) {
            addCriterion("grade4 >", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade4 >=", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4LessThan(Integer value) {
            addCriterion("grade4 <", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4LessThanOrEqualTo(Integer value) {
            addCriterion("grade4 <=", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4In(List<Integer> values) {
            addCriterion("grade4 in", values, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4NotIn(List<Integer> values) {
            addCriterion("grade4 not in", values, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4Between(Integer value1, Integer value2) {
            addCriterion("grade4 between", value1, value2, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4NotBetween(Integer value1, Integer value2) {
            addCriterion("grade4 not between", value1, value2, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade5IsNull() {
            addCriterion("grade5 is null");
            return (Criteria) this;
        }

        public Criteria andGrade5IsNotNull() {
            addCriterion("grade5 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade5EqualTo(Integer value) {
            addCriterion("grade5 =", value, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5NotEqualTo(Integer value) {
            addCriterion("grade5 <>", value, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5GreaterThan(Integer value) {
            addCriterion("grade5 >", value, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade5 >=", value, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5LessThan(Integer value) {
            addCriterion("grade5 <", value, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5LessThanOrEqualTo(Integer value) {
            addCriterion("grade5 <=", value, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5In(List<Integer> values) {
            addCriterion("grade5 in", values, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5NotIn(List<Integer> values) {
            addCriterion("grade5 not in", values, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5Between(Integer value1, Integer value2) {
            addCriterion("grade5 between", value1, value2, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade5NotBetween(Integer value1, Integer value2) {
            addCriterion("grade5 not between", value1, value2, "grade5");
            return (Criteria) this;
        }

        public Criteria andGrade6IsNull() {
            addCriterion("grade6 is null");
            return (Criteria) this;
        }

        public Criteria andGrade6IsNotNull() {
            addCriterion("grade6 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade6EqualTo(Integer value) {
            addCriterion("grade6 =", value, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6NotEqualTo(Integer value) {
            addCriterion("grade6 <>", value, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6GreaterThan(Integer value) {
            addCriterion("grade6 >", value, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade6 >=", value, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6LessThan(Integer value) {
            addCriterion("grade6 <", value, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6LessThanOrEqualTo(Integer value) {
            addCriterion("grade6 <=", value, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6In(List<Integer> values) {
            addCriterion("grade6 in", values, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6NotIn(List<Integer> values) {
            addCriterion("grade6 not in", values, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6Between(Integer value1, Integer value2) {
            addCriterion("grade6 between", value1, value2, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade6NotBetween(Integer value1, Integer value2) {
            addCriterion("grade6 not between", value1, value2, "grade6");
            return (Criteria) this;
        }

        public Criteria andGrade7IsNull() {
            addCriterion("grade7 is null");
            return (Criteria) this;
        }

        public Criteria andGrade7IsNotNull() {
            addCriterion("grade7 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade7EqualTo(Integer value) {
            addCriterion("grade7 =", value, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7NotEqualTo(Integer value) {
            addCriterion("grade7 <>", value, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7GreaterThan(Integer value) {
            addCriterion("grade7 >", value, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade7 >=", value, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7LessThan(Integer value) {
            addCriterion("grade7 <", value, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7LessThanOrEqualTo(Integer value) {
            addCriterion("grade7 <=", value, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7In(List<Integer> values) {
            addCriterion("grade7 in", values, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7NotIn(List<Integer> values) {
            addCriterion("grade7 not in", values, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7Between(Integer value1, Integer value2) {
            addCriterion("grade7 between", value1, value2, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade7NotBetween(Integer value1, Integer value2) {
            addCriterion("grade7 not between", value1, value2, "grade7");
            return (Criteria) this;
        }

        public Criteria andGrade8IsNull() {
            addCriterion("grade8 is null");
            return (Criteria) this;
        }

        public Criteria andGrade8IsNotNull() {
            addCriterion("grade8 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade8EqualTo(Integer value) {
            addCriterion("grade8 =", value, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8NotEqualTo(Integer value) {
            addCriterion("grade8 <>", value, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8GreaterThan(Integer value) {
            addCriterion("grade8 >", value, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade8 >=", value, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8LessThan(Integer value) {
            addCriterion("grade8 <", value, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8LessThanOrEqualTo(Integer value) {
            addCriterion("grade8 <=", value, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8In(List<Integer> values) {
            addCriterion("grade8 in", values, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8NotIn(List<Integer> values) {
            addCriterion("grade8 not in", values, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8Between(Integer value1, Integer value2) {
            addCriterion("grade8 between", value1, value2, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade8NotBetween(Integer value1, Integer value2) {
            addCriterion("grade8 not between", value1, value2, "grade8");
            return (Criteria) this;
        }

        public Criteria andGrade9IsNull() {
            addCriterion("grade9 is null");
            return (Criteria) this;
        }

        public Criteria andGrade9IsNotNull() {
            addCriterion("grade9 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade9EqualTo(Integer value) {
            addCriterion("grade9 =", value, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9NotEqualTo(Integer value) {
            addCriterion("grade9 <>", value, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9GreaterThan(Integer value) {
            addCriterion("grade9 >", value, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9GreaterThanOrEqualTo(Integer value) {
            addCriterion("grade9 >=", value, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9LessThan(Integer value) {
            addCriterion("grade9 <", value, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9LessThanOrEqualTo(Integer value) {
            addCriterion("grade9 <=", value, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9In(List<Integer> values) {
            addCriterion("grade9 in", values, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9NotIn(List<Integer> values) {
            addCriterion("grade9 not in", values, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9Between(Integer value1, Integer value2) {
            addCriterion("grade9 between", value1, value2, "grade9");
            return (Criteria) this;
        }

        public Criteria andGrade9NotBetween(Integer value1, Integer value2) {
            addCriterion("grade9 not between", value1, value2, "grade9");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
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