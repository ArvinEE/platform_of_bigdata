package IDCC.bean;

import java.util.Date;

public class Mygroup {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mygroup.Group_Id
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mygroup.Group_Name
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mygroup.Group_Scale
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private Integer groupScale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mygroup.Group_Sec
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private String groupSec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mygroup.Group_Time
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private Date groupTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mygroup.Group_Id
     *
     * @return the value of mygroup.Group_Id
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mygroup.Group_Id
     *
     * @param groupId the value for mygroup.Group_Id
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mygroup.Group_Name
     *
     * @return the value of mygroup.Group_Name
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mygroup.Group_Name
     *
     * @param groupName the value for mygroup.Group_Name
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mygroup.Group_Scale
     *
     * @return the value of mygroup.Group_Scale
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public Integer getGroupScale() {
        return groupScale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mygroup.Group_Scale
     *
     * @param groupScale the value for mygroup.Group_Scale
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setGroupScale(Integer groupScale) {
        this.groupScale = groupScale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mygroup.Group_Sec
     *
     * @return the value of mygroup.Group_Sec
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public String getGroupSec() {
        return groupSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mygroup.Group_Sec
     *
     * @param groupSec the value for mygroup.Group_Sec
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setGroupSec(String groupSec) {
        this.groupSec = groupSec == null ? null : groupSec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mygroup.Group_Time
     *
     * @return the value of mygroup.Group_Time
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public Date getGroupTime() {
        return groupTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mygroup.Group_Time
     *
     * @param groupTime the value for mygroup.Group_Time
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setGroupTime(Date groupTime) {
        this.groupTime = groupTime;
    }
}