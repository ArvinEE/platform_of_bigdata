package IDCC.bean;

public class PersonnelInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column personnel_info.Staff_Id
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private String staffId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column personnel_info.Personnel_Name
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    private String personnelName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column personnel_info.Staff_Id
     *
     * @return the value of personnel_info.Staff_Id
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column personnel_info.Staff_Id
     *
     * @param staffId the value for personnel_info.Staff_Id
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column personnel_info.Personnel_Name
     *
     * @return the value of personnel_info.Personnel_Name
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public String getPersonnelName() {
        return personnelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column personnel_info.Personnel_Name
     *
     * @param personnelName the value for personnel_info.Personnel_Name
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName == null ? null : personnelName.trim();
    }
}