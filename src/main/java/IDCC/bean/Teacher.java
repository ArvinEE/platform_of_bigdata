package IDCC.bean;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.Staff_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String staffId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.Staff_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String staffName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.Staff_Title
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String staffTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.Used
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private Integer used;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.Staff_Id
     *
     * @return the value of teacher.Staff_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.Staff_Id
     *
     * @param staffId the value for teacher.Staff_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.Staff_Name
     *
     * @return the value of teacher.Staff_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.Staff_Name
     *
     * @param staffName the value for teacher.Staff_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.Staff_Title
     *
     * @return the value of teacher.Staff_Title
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getStaffTitle() {
        return staffTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.Staff_Title
     *
     * @param staffTitle the value for teacher.Staff_Title
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setStaffTitle(String staffTitle) {
        this.staffTitle = staffTitle == null ? null : staffTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.Group_Id
     *
     * @return the value of teacher.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.Group_Id
     *
     * @param groupId the value for teacher.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.Used
     *
     * @return the value of teacher.Used
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.Used
     *
     * @param used the value for teacher.Used
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setUsed(Integer used) {
        this.used = used;
    }
}