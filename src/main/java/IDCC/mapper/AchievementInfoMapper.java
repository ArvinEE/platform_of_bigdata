package IDCC.mapper;

import IDCC.bean.AchievementInfo;
import IDCC.bean.AchievementInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AchievementInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    long countByExample(AchievementInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int deleteByExample(AchievementInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int deleteByPrimaryKey(Integer achievementClassid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int insert(AchievementInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int insertSelective(AchievementInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    List<AchievementInfo> selectByExample(AchievementInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    AchievementInfo selectByPrimaryKey(Integer achievementClassid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByExampleSelective(@Param("record") AchievementInfo record, @Param("example") AchievementInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByExample(@Param("record") AchievementInfo record, @Param("example") AchievementInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByPrimaryKeySelective(AchievementInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table achievement_info
     *
     * @mbg.generated Wed Aug 11 16:49:25 CST 2021
     */
    int updateByPrimaryKey(AchievementInfo record);
}