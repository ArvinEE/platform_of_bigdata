package IDCC.bean;

public class Achievement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement.Achievement_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private Integer achievementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement.Achievement_Name
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private String achievementName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement.Achievement_Desc
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private String achievementDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement.Achievement_Picture
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private String achievementPicture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement.Achievement_Video
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private String achievementVideo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column achievement.Group_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private Integer groupId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement.Achievement_Id
     *
     * @return the value of achievement.Achievement_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public Integer getAchievementId() {
        return achievementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement.Achievement_Id
     *
     * @param achievementId the value for achievement.Achievement_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setAchievementId(Integer achievementId) {
        this.achievementId = achievementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement.Achievement_Name
     *
     * @return the value of achievement.Achievement_Name
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public String getAchievementName() {
        return achievementName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement.Achievement_Name
     *
     * @param achievementName the value for achievement.Achievement_Name
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setAchievementName(String achievementName) {
        this.achievementName = achievementName == null ? null : achievementName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement.Achievement_Desc
     *
     * @return the value of achievement.Achievement_Desc
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public String getAchievementDesc() {
        return achievementDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement.Achievement_Desc
     *
     * @param achievementDesc the value for achievement.Achievement_Desc
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setAchievementDesc(String achievementDesc) {
        this.achievementDesc = achievementDesc == null ? null : achievementDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement.Achievement_Picture
     *
     * @return the value of achievement.Achievement_Picture
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public String getAchievementPicture() {
        return achievementPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement.Achievement_Picture
     *
     * @param achievementPicture the value for achievement.Achievement_Picture
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setAchievementPicture(String achievementPicture) {
        this.achievementPicture = achievementPicture == null ? null : achievementPicture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement.Achievement_Video
     *
     * @return the value of achievement.Achievement_Video
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public String getAchievementVideo() {
        return achievementVideo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement.Achievement_Video
     *
     * @param achievementVideo the value for achievement.Achievement_Video
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setAchievementVideo(String achievementVideo) {
        this.achievementVideo = achievementVideo == null ? null : achievementVideo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column achievement.Group_Id
     *
     * @return the value of achievement.Group_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column achievement.Group_Id
     *
     * @param groupId the value for achievement.Group_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}