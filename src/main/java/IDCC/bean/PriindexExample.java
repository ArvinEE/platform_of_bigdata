package IDCC.bean;

import java.util.ArrayList;
import java.util.List;

public class PriindexExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public PriindexExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
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

        public Criteria andSubjectIdIsNull() {
            addCriterion("Subject_Id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("Subject_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(String value) {
            addCriterion("Subject_Id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(String value) {
            addCriterion("Subject_Id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(String value) {
            addCriterion("Subject_Id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("Subject_Id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(String value) {
            addCriterion("Subject_Id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(String value) {
            addCriterion("Subject_Id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLike(String value) {
            addCriterion("Subject_Id like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotLike(String value) {
            addCriterion("Subject_Id not like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<String> values) {
            addCriterion("Subject_Id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<String> values) {
            addCriterion("Subject_Id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(String value1, String value2) {
            addCriterion("Subject_Id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(String value1, String value2) {
            addCriterion("Subject_Id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexIsNull() {
            addCriterion("Primary_Index is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexIsNotNull() {
            addCriterion("Primary_Index is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexEqualTo(Byte value) {
            addCriterion("Primary_Index =", value, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexNotEqualTo(Byte value) {
            addCriterion("Primary_Index <>", value, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexGreaterThan(Byte value) {
            addCriterion("Primary_Index >", value, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("Primary_Index >=", value, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexLessThan(Byte value) {
            addCriterion("Primary_Index <", value, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexLessThanOrEqualTo(Byte value) {
            addCriterion("Primary_Index <=", value, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexIn(List<Byte> values) {
            addCriterion("Primary_Index in", values, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexNotIn(List<Byte> values) {
            addCriterion("Primary_Index not in", values, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexBetween(Byte value1, Byte value2) {
            addCriterion("Primary_Index between", value1, value2, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPrimaryIndexNotBetween(Byte value1, Byte value2) {
            addCriterion("Primary_Index not between", value1, value2, "primaryIndex");
            return (Criteria) this;
        }

        public Criteria andPriindexNameIsNull() {
            addCriterion("PriIndex_Name is null");
            return (Criteria) this;
        }

        public Criteria andPriindexNameIsNotNull() {
            addCriterion("PriIndex_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPriindexNameEqualTo(String value) {
            addCriterion("PriIndex_Name =", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameNotEqualTo(String value) {
            addCriterion("PriIndex_Name <>", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameGreaterThan(String value) {
            addCriterion("PriIndex_Name >", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameGreaterThanOrEqualTo(String value) {
            addCriterion("PriIndex_Name >=", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameLessThan(String value) {
            addCriterion("PriIndex_Name <", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameLessThanOrEqualTo(String value) {
            addCriterion("PriIndex_Name <=", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameLike(String value) {
            addCriterion("PriIndex_Name like", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameNotLike(String value) {
            addCriterion("PriIndex_Name not like", value, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameIn(List<String> values) {
            addCriterion("PriIndex_Name in", values, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameNotIn(List<String> values) {
            addCriterion("PriIndex_Name not in", values, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameBetween(String value1, String value2) {
            addCriterion("PriIndex_Name between", value1, value2, "priindexName");
            return (Criteria) this;
        }

        public Criteria andPriindexNameNotBetween(String value1, String value2) {
            addCriterion("PriIndex_Name not between", value1, value2, "priindexName");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("Student_Id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("Student_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("Student_Id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("Student_Id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("Student_Id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Student_Id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("Student_Id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Student_Id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("Student_Id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("Student_Id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("Student_Id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Student_Id not between", value1, value2, "studentId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table priindex
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 11 09:42:03 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table priindex
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
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