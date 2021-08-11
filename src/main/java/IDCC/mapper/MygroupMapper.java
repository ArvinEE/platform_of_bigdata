package IDCC.mapper;

import IDCC.bean.Mygroup;
import IDCC.bean.MygroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MygroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    long countByExample(MygroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int deleteByExample(MygroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int deleteByPrimaryKey(Integer groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int insert(Mygroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int insertSelective(Mygroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    List<Mygroup> selectByExample(MygroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    Mygroup selectByPrimaryKey(Integer groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int updateByExampleSelective(@Param("record") Mygroup record, @Param("example") MygroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int updateByExample(@Param("record") Mygroup record, @Param("example") MygroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int updateByPrimaryKeySelective(Mygroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mygroup
     *
     * @mbg.generated Wed Aug 11 09:42:03 CST 2021
     */
    int updateByPrimaryKey(Mygroup record);
}