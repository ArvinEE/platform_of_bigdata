package IDCC.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public SubjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
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
     * This method corresponds to the database table subject
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
     * This method corresponds to the database table subject
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
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
     * This class corresponds to the database table subject
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

        public Criteria andLeaderIdIsNull() {
            addCriterion("Leader_Id is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNotNull() {
            addCriterion("Leader_Id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdEqualTo(String value) {
            addCriterion("Leader_Id =", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotEqualTo(String value) {
            addCriterion("Leader_Id <>", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThan(String value) {
            addCriterion("Leader_Id >", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("Leader_Id >=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThan(String value) {
            addCriterion("Leader_Id <", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("Leader_Id <=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLike(String value) {
            addCriterion("Leader_Id like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotLike(String value) {
            addCriterion("Leader_Id not like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIn(List<String> values) {
            addCriterion("Leader_Id in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotIn(List<String> values) {
            addCriterion("Leader_Id not in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdBetween(String value1, String value2) {
            addCriterion("Leader_Id between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotBetween(String value1, String value2) {
            addCriterion("Leader_Id not between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("Subject_Name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("Subject_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("Subject_Name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("Subject_Name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("Subject_Name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("Subject_Name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("Subject_Name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("Subject_Name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("Subject_Name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("Subject_Name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("Subject_Name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("Subject_Name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("Subject_Name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("Subject_Name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("Group_Id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("Group_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("Group_Id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("Group_Id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("Group_Id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("Group_Id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("Group_Id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("Group_Id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("Deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("Deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("Deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("Deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("Deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("Deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("Deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("Deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("Deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("Deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("Deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("Deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleIsNull() {
            addCriterion("Subject_Schedule is null");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleIsNotNull() {
            addCriterion("Subject_Schedule is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleEqualTo(String value) {
            addCriterion("Subject_Schedule =", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleNotEqualTo(String value) {
            addCriterion("Subject_Schedule <>", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleGreaterThan(String value) {
            addCriterion("Subject_Schedule >", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("Subject_Schedule >=", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleLessThan(String value) {
            addCriterion("Subject_Schedule <", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleLessThanOrEqualTo(String value) {
            addCriterion("Subject_Schedule <=", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleLike(String value) {
            addCriterion("Subject_Schedule like", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleNotLike(String value) {
            addCriterion("Subject_Schedule not like", value, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleIn(List<String> values) {
            addCriterion("Subject_Schedule in", values, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleNotIn(List<String> values) {
            addCriterion("Subject_Schedule not in", values, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleBetween(String value1, String value2) {
            addCriterion("Subject_Schedule between", value1, value2, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectScheduleNotBetween(String value1, String value2) {
            addCriterion("Subject_Schedule not between", value1, value2, "subjectSchedule");
            return (Criteria) this;
        }

        public Criteria andSubjectClassIsNull() {
            addCriterion("Subject_Class is null");
            return (Criteria) this;
        }

        public Criteria andSubjectClassIsNotNull() {
            addCriterion("Subject_Class is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectClassEqualTo(String value) {
            addCriterion("Subject_Class =", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNotEqualTo(String value) {
            addCriterion("Subject_Class <>", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassGreaterThan(String value) {
            addCriterion("Subject_Class >", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassGreaterThanOrEqualTo(String value) {
            addCriterion("Subject_Class >=", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassLessThan(String value) {
            addCriterion("Subject_Class <", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassLessThanOrEqualTo(String value) {
            addCriterion("Subject_Class <=", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassLike(String value) {
            addCriterion("Subject_Class like", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNotLike(String value) {
            addCriterion("Subject_Class not like", value, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassIn(List<String> values) {
            addCriterion("Subject_Class in", values, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNotIn(List<String> values) {
            addCriterion("Subject_Class not in", values, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassBetween(String value1, String value2) {
            addCriterion("Subject_Class between", value1, value2, "subjectClass");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNotBetween(String value1, String value2) {
            addCriterion("Subject_Class not between", value1, value2, "subjectClass");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table subject
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
     * This class corresponds to the database table subject
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