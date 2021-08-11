package IDCC.service;


import IDCC.bean.Achievement;

import java.util.List;

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
    //模糊查询成果信息(Name)
    List<Achievement> searchAchievementByExample(String name);
}
