package IDCC.service;


import IDCC.bean.Achievement;

import java.util.List;
import java.util.Map;

/**
 * @description: 成果信息实现层接口
 * @author: Peng Chong
 * @time: 2020/12/10 15:40
 */

public interface AchievementService {
    //增加单条成果信息
    public int addAchievement(Achievement achievement);
    //删除单条成果信息(根据id删除)
    public int delAchievement(int achievementId);
    //查找单条成果信息(根据id查)
    public Achievement searchAchievement(int achievementId);
    //修改单条成果信息
    public int updateAchievement(Achievement achievement);
    //模糊查询成果信息(Id)
    List<Achievement> searchAchievementByExample(int condition);
    //模糊查询成果信息()
    List<Achievement> searchAchievementByExample();
    //获取所有成果信息
    List<Achievement> getAllAchievements();
    //统计各著作成果数量及总数
    public Map<String, Integer> countByWriting();
    //统计论文和授权专利总数
    public Map<String, Integer> countPaperAndPatent();
    //统计各团队论文数
    public Map<String, Integer> countPaperByGroup();
    //统计各团队授权专利数
    public Map<String, Integer> countPatentByGroup();

}
