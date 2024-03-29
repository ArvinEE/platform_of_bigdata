package IDCC.mapper;

import IDCC.bean.Student;
import IDCC.bean.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    long countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int deleteByPrimaryKey(String studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    Student selectByPrimaryKey(String studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByPrimaryKey(Student record);
}