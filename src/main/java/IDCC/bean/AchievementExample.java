package IDCC.bean;

import java.util.ArrayList;
import java.util.List;

public class AchievementExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public AchievementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
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
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
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

        public Criteria andAchievementIdIsNull() {
            addCriterion("Achievement_Id is null");
            return (Criteria) this;
        }

        public Criteria andAchievementIdIsNotNull() {
            addCriterion("Achievement_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementIdEqualTo(Integer value) {
            addCriterion("Achievement_Id =", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdNotEqualTo(Integer value) {
            addCriterion("Achievement_Id <>", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdGreaterThan(Integer value) {
            addCriterion("Achievement_Id >", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Achievement_Id >=", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdLessThan(Integer value) {
            addCriterion("Achievement_Id <", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdLessThanOrEqualTo(Integer value) {
            addCriterion("Achievement_Id <=", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdIn(List<Integer> values) {
            addCriterion("Achievement_Id in", values, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdNotIn(List<Integer> values) {
            addCriterion("Achievement_Id not in", values, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdBetween(Integer value1, Integer value2) {
            addCriterion("Achievement_Id between", value1, value2, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Achievement_Id not between", value1, value2, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementNameIsNull() {
            addCriterion("Achievement_Name is null");
            return (Criteria) this;
        }

        public Criteria andAchievementNameIsNotNull() {
            addCriterion("Achievement_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementNameEqualTo(String value) {
            addCriterion("Achievement_Name =", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameNotEqualTo(String value) {
            addCriterion("Achievement_Name <>", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameGreaterThan(String value) {
            addCriterion("Achievement_Name >", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameGreaterThanOrEqualTo(String value) {
            addCriterion("Achievement_Name >=", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameLessThan(String value) {
            addCriterion("Achievement_Name <", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameLessThanOrEqualTo(String value) {
            addCriterion("Achievement_Name <=", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameLike(String value) {
            addCriterion("Achievement_Name like", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameNotLike(String value) {
            addCriterion("Achievement_Name not like", value, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameIn(List<String> values) {
            addCriterion("Achievement_Name in", values, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameNotIn(List<String> values) {
            addCriterion("Achievement_Name not in", values, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameBetween(String value1, String value2) {
            addCriterion("Achievement_Name between", value1, value2, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementNameNotBetween(String value1, String value2) {
            addCriterion("Achievement_Name not between", value1, value2, "achievementName");
            return (Criteria) this;
        }

        public Criteria andAchievementDescIsNull() {
            addCriterion("Achievement_Desc is null");
            return (Criteria) this;
        }

        public Criteria andAchievementDescIsNotNull() {
            addCriterion("Achievement_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementDescEqualTo(String value) {
            addCriterion("Achievement_Desc =", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescNotEqualTo(String value) {
            addCriterion("Achievement_Desc <>", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescGreaterThan(String value) {
            addCriterion("Achievement_Desc >", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescGreaterThanOrEqualTo(String value) {
            addCriterion("Achievement_Desc >=", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescLessThan(String value) {
            addCriterion("Achievement_Desc <", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescLessThanOrEqualTo(String value) {
            addCriterion("Achievement_Desc <=", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescLike(String value) {
            addCriterion("Achievement_Desc like", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescNotLike(String value) {
            addCriterion("Achievement_Desc not like", value, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescIn(List<String> values) {
            addCriterion("Achievement_Desc in", values, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescNotIn(List<String> values) {
            addCriterion("Achievement_Desc not in", values, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescBetween(String value1, String value2) {
            addCriterion("Achievement_Desc between", value1, value2, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementDescNotBetween(String value1, String value2) {
            addCriterion("Achievement_Desc not between", value1, value2, "achievementDesc");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureIsNull() {
            addCriterion("Achievement_Picture is null");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureIsNotNull() {
            addCriterion("Achievement_Picture is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureEqualTo(String value) {
            addCriterion("Achievement_Picture =", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureNotEqualTo(String value) {
            addCriterion("Achievement_Picture <>", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureGreaterThan(String value) {
            addCriterion("Achievement_Picture >", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureGreaterThanOrEqualTo(String value) {
            addCriterion("Achievement_Picture >=", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureLessThan(String value) {
            addCriterion("Achievement_Picture <", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureLessThanOrEqualTo(String value) {
            addCriterion("Achievement_Picture <=", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureLike(String value) {
            addCriterion("Achievement_Picture like", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureNotLike(String value) {
            addCriterion("Achievement_Picture not like", value, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureIn(List<String> values) {
            addCriterion("Achievement_Picture in", values, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureNotIn(List<String> values) {
            addCriterion("Achievement_Picture not in", values, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureBetween(String value1, String value2) {
            addCriterion("Achievement_Picture between", value1, value2, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementPictureNotBetween(String value1, String value2) {
            addCriterion("Achievement_Picture not between", value1, value2, "achievementPicture");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoIsNull() {
            addCriterion("Achievement_Video is null");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoIsNotNull() {
            addCriterion("Achievement_Video is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoEqualTo(String value) {
            addCriterion("Achievement_Video =", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoNotEqualTo(String value) {
            addCriterion("Achievement_Video <>", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoGreaterThan(String value) {
            addCriterion("Achievement_Video >", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoGreaterThanOrEqualTo(String value) {
            addCriterion("Achievement_Video >=", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoLessThan(String value) {
            addCriterion("Achievement_Video <", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoLessThanOrEqualTo(String value) {
            addCriterion("Achievement_Video <=", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoLike(String value) {
            addCriterion("Achievement_Video like", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoNotLike(String value) {
            addCriterion("Achievement_Video not like", value, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoIn(List<String> values) {
            addCriterion("Achievement_Video in", values, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoNotIn(List<String> values) {
            addCriterion("Achievement_Video not in", values, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoBetween(String value1, String value2) {
            addCriterion("Achievement_Video between", value1, value2, "achievementVideo");
            return (Criteria) this;
        }

        public Criteria andAchievementVideoNotBetween(String value1, String value2) {
            addCriterion("Achievement_Video not between", value1, value2, "achievementVideo");
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

        public Criteria andAchievementClassIsNull() {
            addCriterion("Achievement_Class is null");
            return (Criteria) this;
        }

        public Criteria andAchievementClassIsNotNull() {
            addCriterion("Achievement_Class is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementClassEqualTo(Integer value) {
            addCriterion("Achievement_Class =", value, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassNotEqualTo(Integer value) {
            addCriterion("Achievement_Class <>", value, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassGreaterThan(Integer value) {
            addCriterion("Achievement_Class >", value, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("Achievement_Class >=", value, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassLessThan(Integer value) {
            addCriterion("Achievement_Class <", value, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassLessThanOrEqualTo(Integer value) {
            addCriterion("Achievement_Class <=", value, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassIn(List<Integer> values) {
            addCriterion("Achievement_Class in", values, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassNotIn(List<Integer> values) {
            addCriterion("Achievement_Class not in", values, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassBetween(Integer value1, Integer value2) {
            addCriterion("Achievement_Class between", value1, value2, "achievementClass");
            return (Criteria) this;
        }

        public Criteria andAchievementClassNotBetween(Integer value1, Integer value2) {
            addCriterion("Achievement_Class not between", value1, value2, "achievementClass");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table achievement
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 11 16:49:25 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table achievement
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
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