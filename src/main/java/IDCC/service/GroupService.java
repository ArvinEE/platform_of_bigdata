package IDCC.service;

import IDCC.bean.Mygroup;

import java.util.List;
import java.util.Map;

/**
 * @description: 团队信息实现层接口
 * @author: Peng Chong
 * @time: 2020/12/10 18:27
 */

public interface GroupService {
    //增加单条团队信息
    public int addGroup(Mygroup group);
    //删除单条团队信息(根据id删除)
    public int delGroup(int groupId);
    //查找单条团队信息(根据id查)
    public Mygroup searchGroup(int groupId);
    //修改单条团队信息
    public int updateGroup(Mygroup group);
    //模糊查询成果信息(Id)
    List<Mygroup> searchGroupByExample(int condition);
    // 获取所有团队信息
    List<Mygroup> getAllGroups();
    // 获取各团队规模
    Map<String, Integer> getGroupsScale();
}
