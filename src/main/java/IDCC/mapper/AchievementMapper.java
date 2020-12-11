package IDCC.mapper;

import IDCC.bean.Achievement;
import IDCC.bean.AchievementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AchievementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    long countByExample(AchievementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int deleteByExample(AchievementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int deleteByPrimaryKey(Integer achievementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int insert(Achievement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int insertSelective(Achievement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    List<Achievement> selectByExample(AchievementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    Achievement selectByPrimaryKey(Integer achievementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") Achievement record, @Param("example") AchievementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int updateByExample(@Param("record") Achievement record, @Param("example") AchievementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int updateByPrimaryKeySelective(Achievement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement
     *
     * @mbg.generated Tue Dec 08 20:41:27 CST 2020
     */
    int updateByPrimaryKey(Achievement record);
}