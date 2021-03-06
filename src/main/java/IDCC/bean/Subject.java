package IDCC.bean;

import java.util.Date;

public class Subject {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.Subject_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String subjectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.Subject_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String subjectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.Leader_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String leaderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.StartTime
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.Deadline
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private Date deadline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.Subject_Schedule
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    private String subjectSchedule;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.Subject_Id
     *
     * @return the value of subject.Subject_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.Subject_Id
     *
     * @param subjectId the value for subject.Subject_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.Subject_Name
     *
     * @return the value of subject.Subject_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.Subject_Name
     *
     * @param subjectName the value for subject.Subject_Name
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.Leader_Id
     *
     * @return the value of subject.Leader_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getLeaderId() {
        return leaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.Leader_Id
     *
     * @param leaderId the value for subject.Leader_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.Group_Id
     *
     * @return the value of subject.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.Group_Id
     *
     * @param groupId the value for subject.Group_Id
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.StartTime
     *
     * @return the value of subject.StartTime
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.StartTime
     *
     * @param starttime the value for subject.StartTime
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.Deadline
     *
     * @return the value of subject.Deadline
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.Deadline
     *
     * @param deadline the value for subject.Deadline
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.Subject_Schedule
     *
     * @return the value of subject.Subject_Schedule
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public String getSubjectSchedule() {
        return subjectSchedule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.Subject_Schedule
     *
     * @param subjectSchedule the value for subject.Subject_Schedule
     *
     * @mbg.generated Tue Dec 22 21:14:14 CST 2020
     */
    public void setSubjectSchedule(String subjectSchedule) {
        this.subjectSchedule = subjectSchedule == null ? null : subjectSchedule.trim();
    }
}