package IDCC.bean;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Student_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Student_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Student_Grade
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String studentGrade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Supervisor_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String supervisorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Used
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private Integer used;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Student_Id
     *
     * @return the value of student.Student_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Student_Id
     *
     * @param studentId the value for student.Student_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Student_Name
     *
     * @return the value of student.Student_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Student_Name
     *
     * @param studentName the value for student.Student_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Student_Grade
     *
     * @return the value of student.Student_Grade
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getStudentGrade() {
        return studentGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Student_Grade
     *
     * @param studentGrade the value for student.Student_Grade
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade == null ? null : studentGrade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Supervisor_Id
     *
     * @return the value of student.Supervisor_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getSupervisorId() {
        return supervisorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Supervisor_Id
     *
     * @param supervisorId the value for student.Supervisor_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId == null ? null : supervisorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Group_Id
     *
     * @return the value of student.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Group_Id
     *
     * @param groupId the value for student.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Used
     *
     * @return the value of student.Used
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Used
     *
     * @param used the value for student.Used
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setUsed(Integer used) {
        this.used = used;
    }
}