package IDCC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 成果信息实现层
 * @author: Peng Chong
 * @time: 2020/12/10 16:03
 */
@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementMapper achievementMapper;

    /**
     * @description: 增加单条成果信息
     * @return: 0/1
     * @author: Peng Chong
     * @time: 2020/12/10 16:10
     */

    @Override
    public int addAchievement(Achievement achievement) {
        return achievementMapper.insert(achievement);
    }

    /**
     * @description: 删除单条成果信息(根据id删除)
     * @return: 0/1
     * @author: Peng Chong
     * @time: 2020/12/10 16:14
     */

    @Override
    public int delAchievement(int achievementId) {
        return achievementMapper.deleteByPrimaryKey(achievementId);
    }

    /**
     * @description: 查找单条成果信息(根据id查找)
     * @return: 对象
     * @author: Peng Chong
     * @time: 2020/12/10 16:16
     */

    @Override
    public Achievement searchAchievement(int achievementId) {
        Achievement achievement = achievementMapper.selectByPrimaryKey(achievementId);
        return achievement;
    }

    /**
     * @description: 更新单条成果信息
     * @return:
     * @author: Peng Chong
     * @time: 2020/12/10 16:20
     */
    @Override
    public int updateAchievement(Achievement achievement) {
        return achievementMapper.updateByPrimaryKey(achievement);
    }
}
