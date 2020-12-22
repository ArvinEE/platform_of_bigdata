package IDCC.service;


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
}
