package IDCC.bean;

public class Priindex {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column priindex.Subject_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private String subjectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column priindex.Primary_Index
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private Integer primaryIndex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column priindex.PriIndex_Name
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private String priindexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column priindex.Student_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    private Integer studentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column priindex.Subject_Id
     *
     * @return the value of priindex.Subject_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column priindex.Subject_Id
     *
     * @param subjectId the value for priindex.Subject_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column priindex.Primary_Index
     *
     * @return the value of priindex.Primary_Index
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public Integer getPrimaryIndex() {
        return primaryIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column priindex.Primary_Index
     *
     * @param primaryIndex the value for priindex.Primary_Index
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setPrimaryIndex(Integer primaryIndex) {
        this.primaryIndex = primaryIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column priindex.PriIndex_Name
     *
     * @return the value of priindex.PriIndex_Name
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public String getPriindexName() {
        return priindexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column priindex.PriIndex_Name
     *
     * @param priindexName the value for priindex.PriIndex_Name
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setPriindexName(String priindexName) {
        this.priindexName = priindexName == null ? null : priindexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column priindex.Student_Id
     *
     * @return the value of priindex.Student_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column priindex.Student_Id
     *
     * @param studentId the value for priindex.Student_Id
     *
     * @mbg.generated Thu Dec 10 20:41:55 CST 2020
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}