package IDCC.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public TeacherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
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
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
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

        public Criteria andStaffIdIsNull() {
            addCriterion("Staff_Id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("Staff_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("Staff_Id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("Staff_Id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("Staff_Id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("Staff_Id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("Staff_Id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("Staff_Id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("Staff_Id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("Staff_Id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("Staff_Id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("Staff_Id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("Staff_Id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("Staff_Id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("Staff_Name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("Staff_Name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("Staff_Name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("Staff_Name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("Staff_Name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("Staff_Name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("Staff_Name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("Staff_Name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("Staff_Name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("Staff_Name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("Staff_Name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("Staff_Name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("Staff_Name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("Staff_Name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffTitleIsNull() {
            addCriterion("Staff_Title is null");
            return (Criteria) this;
        }

        public Criteria andStaffTitleIsNotNull() {
            addCriterion("Staff_Title is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTitleEqualTo(String value) {
            addCriterion("Staff_Title =", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleNotEqualTo(String value) {
            addCriterion("Staff_Title <>", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleGreaterThan(String value) {
            addCriterion("Staff_Title >", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Staff_Title >=", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleLessThan(String value) {
            addCriterion("Staff_Title <", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleLessThanOrEqualTo(String value) {
            addCriterion("Staff_Title <=", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleLike(String value) {
            addCriterion("Staff_Title like", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleNotLike(String value) {
            addCriterion("Staff_Title not like", value, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleIn(List<String> values) {
            addCriterion("Staff_Title in", values, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleNotIn(List<String> values) {
            addCriterion("Staff_Title not in", values, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleBetween(String value1, String value2) {
            addCriterion("Staff_Title between", value1, value2, "staffTitle");
            return (Criteria) this;
        }

        public Criteria andStaffTitleNotBetween(String value1, String value2) {
            addCriterion("Staff_Title not between", value1, value2, "staffTitle");
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

        public Criteria andUsedIsNull() {
            addCriterion("Used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("Used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(Integer value) {
            addCriterion("Used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(Integer value) {
            addCriterion("Used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(Integer value) {
            addCriterion("Used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("Used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(Integer value) {
            addCriterion("Used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(Integer value) {
            addCriterion("Used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<Integer> values) {
            addCriterion("Used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<Integer> values) {
            addCriterion("Used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(Integer value1, Integer value2) {
            addCriterion("Used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("Used not between", value1, value2, "used");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teacher
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 10 20:41:55 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teacher
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
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