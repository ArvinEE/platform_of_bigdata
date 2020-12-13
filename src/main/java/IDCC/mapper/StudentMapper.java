package IDCC.mapper;

import IDCC.bean.Student;
import IDCC.bean.StudentExample;
import java.util.List;

import io.swagger.annotations.ApiModel;
import org.apache.ibatis.annotations.Param;
@ApiModel
public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    long countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int deleteByPrimaryKey(String studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    Student selectByPrimaryKey(String studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Dec 11 21:01:08 CST 2020
     */
    int updateByPrimaryKey(Student record);
}