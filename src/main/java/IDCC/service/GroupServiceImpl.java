package IDCC.service;

import IDCC.bean.Mygroup;
import IDCC.bean.MygroupExample;
import IDCC.mapper.MygroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 团队信息实现层
 * @author: Peng Chong
 * @time: 2020/12/10 18:39
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private MygroupMapper groupMapper;

    /**
     * @description: 增加单条团队信息
     * @return: 0/1
     * @author: Peng Chong
     * @time: 2020/12/10 18:41
     */
    @Override
    public int addGroup(Mygroup group) {
        return groupMapper.insert(group);
    }

    /**
     * @description: 删除单条团队信息(根据id删除)
     * @return: 0/1
     * @author: Peng Chong
     * @time: 2020/12/10 18:42
     */

    @Override
    public int delGroup(int groupId) {
        return groupMapper.deleteByPrimaryKey(groupId);
    }

    /**
     * @description: 查找单条团队信息(根据id查找)
     * @return: 对象
     * @author: Peng Chong
     * @time: 2020/12/10 18:43
     */
    @Override
    public Mygroup searchGroup(int groupId) {
        Mygroup group=groupMapper.selectByPrimaryKey(groupId);
        return group;
    }

    /**
     * @description: 更新单条团队信息
     * @return:
     * @author: Peng Chong
     * @time: 2020/12/10 18:45
     */
    @Override
    public int updateGroup(Mygroup group) {
        System.out.println();
        return groupMapper.updateByPrimaryKey(group);
    }

    /**
     * @description: 查询多条团队信息（Id模糊查询）
     * @return: List<Mygroup>
     * @author: Peng Chong
     * @time: 2020/12/23 18:21
     */
    @Override
    public List<Mygroup> searchGroupByExample(int condition) {
        MygroupExample mygroupExample = new MygroupExample();
//        mygroupExample.createCriteria().andGroupIdIdLike("%"+condition+"%");
        return groupMapper.selectByExample(mygroupExample);
    }
    /**
     * @description: 获取所有团队信息
     * @return: List<Mygroup>
     * @author: Peng Chong
     * @time: 2021/8/9 16:34
     */
    @Override
    public List<Mygroup> getAllGroups() {
        MygroupExample mygroupExample = new MygroupExample();
        return groupMapper.selectByExample(mygroupExample);
    }
    /**
     * @description: 获取所有团队信息
     * @return: Map<String, Integer>
     * @author: Peng Chong
     * @time: 2021/8/9 16:34
     */
    @Override
    public Map<String, Integer> getGroupsScale() {
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        for(Mygroup obj :getAllGroups())
            countMap.put(obj.getGroupName(),obj.getGroupScale());

        return countMap;
    }
}
