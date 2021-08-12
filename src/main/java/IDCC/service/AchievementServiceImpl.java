package IDCC.service;

import IDCC.bean.Achievement;
import IDCC.bean.AchievementExample;

import IDCC.bean.Mygroup;
import IDCC.bean.MygroupExample;
import IDCC.mapper.AchievementMapper;
import IDCC.mapper.MygroupMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 成果信息实现层
 * @author: Peng Chong
 * @time: 2020/12/10 16:03
 */
@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementMapper achievementMapper;
    @Autowired
    private MygroupMapper mygroupMapper;

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

    /**
     * @description: 查询多条成果信息（Id模糊查询）
     * @return: List<Achievement>
     * @author: Peng Chong
     * @time: 2020/12/23 16:36
     */
    @Override
    public List<Achievement> searchAchievementByExample(int condition) {
        AchievementExample achievementExample = new AchievementExample();
//        achievementExample.createCriteria().andA("%"+condition+"%");
//        achievementExample.createCriteria().andAchievementIdLike("%"+condition+"%");
        return achievementMapper.selectByExample(achievementExample);
    }

    /**
     * @description: 查询多条成果信息（成果名模糊查询）
     * @param: name(String)
     * @return: List<Achievement>
     * @author: Lai ZhouHao
     * @time: 2021/8/11 15:34
    **/
    @Override
    public List<Achievement> searchAchievementByExample() {
        AchievementExample achievementExample = new AchievementExample();
        //3即为平台类别
        achievementExample.createCriteria().andAchievementClassEqualTo(3);
        return achievementMapper.selectByExample(achievementExample);
    }

    /**
     * @description: 获取所有成功信息
     * @return: List<Achievement>
     * @author: Peng Chong
     * @time: 2021/8/11 18:48
     */
    @Override
    public List<Achievement> getAllAchievements() {
        AchievementExample achievementExample = new AchievementExample();
        return achievementMapper.selectByExample(achievementExample);
    }

    /**
     * @description: 统计各著作成果数量及总数
     * @return: Map<String, Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 19:25
     */
    @Override
    public Map<String, Integer> countByWriting(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        int sum = 0;
        String[] writingList = {"专著","教材","软著","著作成果"};
        for(String grade:writingList) countMap.put(grade,0);

        for (Achievement obj:getAllAchievements()){
            switch (obj.getAchievementClass()){
                case 5:countMap.put("专著",countMap.get("专著")+1);break;
                case 6:countMap.put("教材",countMap.get("教材")+1);break;
                case 7:countMap.put("软著",countMap.get("软著")+1);break;
            }
        }
        for (String wrting:writingList) sum += countMap.get(wrting);
        countMap.put("著作成果",sum);
        return countMap;
    }

    /**
     * @description: 统计论文和授权专利总数
     * @return: Map<String, Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 19:25
     */
    @Override
    public Map<String, Integer> countPaperAndPatent(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        countMap.put("发表论文",0);
        countMap.put("专利授权",0);

        for (Achievement obj:getAllAchievements()){
            if (obj.getAchievementClass() == 1) countMap.put("发表论文",countMap.get("发表论文")+1);
            else if (obj.getAchievementClass() == 2) countMap.put("专利授权",countMap.get("专利授权")+1);
        }
        return countMap;
    }

    /**
     * @description: 统计各团队论文数
     * @return: Map<String, Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 19:25
     */
    @Override
    public Map<String, Integer> countPaperByGroup(){
        Map<Integer,Integer> groupMap = new HashMap<Integer, Integer>();
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        Map<Integer,String> transferMap = new HashMap<Integer,String>();

        MygroupExample mygroupExample = new MygroupExample();
        List<Mygroup> mygroupList = mygroupMapper.selectByExample(mygroupExample);

        for(Mygroup obj : mygroupList)
        {
            groupMap.put(obj.getGroupId(),0);
            transferMap.put(obj.getGroupId(),obj.getGroupName());
        }

        for (Achievement obj:getAllAchievements()){
            if (obj.getAchievementClass() == 1) {
                int groupId = obj.getGroupId();
                groupMap.put(groupId, groupMap.get(groupId)+1);
            }
        }

        groupMap.forEach((key, value) -> countMap.put(transferMap.get(key),value));
        return countMap;
    }

    /**
     * @description: 统计各团队授权专利数
     * @return: Map<String, Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 19:25
     */
    @Override
    public Map<String, Integer> countPatentByGroup(){
        Map<Integer,Integer> groupMap = new HashMap<Integer, Integer>();
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        Map<Integer,String> transferMap = new HashMap<Integer,String>();

        MygroupExample mygroupExample = new MygroupExample();
        List<Mygroup> mygroupList = mygroupMapper.selectByExample(mygroupExample);

        for(Mygroup obj : mygroupList)
        {
            groupMap.put(obj.getGroupId(),0);
            transferMap.put(obj.getGroupId(),obj.getGroupName());
        }

        for (Achievement obj:getAllAchievements()){
            if (obj.getAchievementClass() == 2) {
                int groupId = obj.getGroupId();
                groupMap.put(groupId, groupMap.get(groupId)+1);
            }
        }

        groupMap.forEach((key, value) -> countMap.put(transferMap.get(key),value));
        return countMap;
    }

}
