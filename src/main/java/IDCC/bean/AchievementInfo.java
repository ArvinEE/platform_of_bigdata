package IDCC.bean;

public class AchievementInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement_info.Achievement_ClassId
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private Integer achievementClassid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement_info.Achievement_ClassName
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private String achievementClassname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement_info.Achievement_ClassId
     *
     * @return the value of achievement_info.Achievement_ClassId
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public Integer getAchievementClassid() {
        return achievementClassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement_info.Achievement_ClassId
     *
     * @param achievementClassid the value for achievement_info.Achievement_ClassId
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setAchievementClassid(Integer achievementClassid) {
        this.achievementClassid = achievementClassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement_info.Achievement_ClassName
     *
     * @return the value of achievement_info.Achievement_ClassName
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public String getAchievementClassname() {
        return achievementClassname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement_info.Achievement_ClassName
     *
     * @param achievementClassname the value for achievement_info.Achievement_ClassName
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setAchievementClassname(String achievementClassname) {
        this.achievementClassname = achievementClassname == null ? null : achievementClassname.trim();
    }
}