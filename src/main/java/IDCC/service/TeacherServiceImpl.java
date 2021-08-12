package IDCC.service;


import IDCC.bean.*;
import IDCC.mapper.AccountMapper;
import IDCC.mapper.MygroupMapper;
import IDCC.mapper.PersonnelInfoMapper;
import IDCC.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @description: 教师信息实现层
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:51
 */
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private PersonnelInfoMapper personnelInfoMapper;
    @Autowired
    private MygroupMapper mygroupMapper;
    @Autowired
    private AccountMapper accountMapper;
    /**
     * @description: 增加单条教师信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:52
     */
    @Override
    public int addTeacher(Teacher Teacher) {
        return teacherMapper.insert(Teacher);
    }

    /**
     * @description: 删除单条教师信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:54
     */
    @Override
    public int delTeacher(String TeacherId) {
        return teacherMapper.deleteByPrimaryKey(TeacherId);
    }

    /**
     * @description: 查找单条教师信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:55
     */
    @Override
    public Teacher searchTeacher(String TeacherId) {
        Teacher Teacher = teacherMapper.selectByPrimaryKey(TeacherId);
        return Teacher;
    }

    /**
     * @description: 更新单条教师信息
     * @return:
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:55
     */
    @Override
    public int updateTeacher(Teacher Teacher) {
        return teacherMapper.updateByPrimaryKey(Teacher);
    }

    /**
     * @description: 查找所有教师信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/7 15:34
     */
    @Override
    public List<Teacher> getAllTeachers() {
        TeacherExample teacherExample = new TeacherExample();
        return teacherMapper.selectByExample(teacherExample);
    }


    /**
     * @description: 统计各职称人数
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/7 15:53
     */
    @Override
    public Map<String,Integer> countByStaffTitle(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        for(Teacher obj :getAllTeachers()){
            String staffTitle = obj.getStaffTitle();
            if(countMap.get(staffTitle)==null)
                countMap.put(staffTitle,1);
            else
                countMap.put(staffTitle,countMap.get(staffTitle)+1);
        }
        return countMap;
    }

    /**
     * @description: 统计教师变动情况和总数
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/9 20:00
     */
    @Override
    public Map<String,Integer> countByTransfer(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        countMap.put("教师人数",getAllTeachers().size());
        countMap.put("在职人数",0);
        countMap.put("调动人数",0);
        for(Teacher obj :getAllTeachers()){
            int used = obj.getUsed();
            if(used==1)
                countMap.put("在职人数",countMap.get("在职人数")+1);
            else
                countMap.put("调动人数",countMap.get("调动人数")+1);
        }
        return countMap;
    }

    /**
     * @description: 统计各团队教师人数
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/9 21:20
     */
    public Map<String,Integer> countByGroup(){
        Map<Integer,Integer> groupMap = new HashMap<Integer, Integer>();
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        Map<Integer,String> transferMap = new HashMap<Integer,String>();

        MygroupExample mygroupExample = new MygroupExample();
        List<Mygroup> mygroupList = mygroupMapper.selectByExample(mygroupExample);

        for(Mygroup obj :mygroupList)
        {
            groupMap.put(obj.getGroupId(),0);
            transferMap.put(obj.getGroupId(),obj.getGroupName());
        }

        for(Teacher obj :getAllTeachers()){
            int groupId = obj.getGroupId();
            groupMap.put(groupId, groupMap.get(groupId)+1);
        }

        groupMap.forEach((key, value) -> countMap.put(transferMap.get(key),value));
        return countMap;
    }

    /**
     * @description: 统计教师总人数
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/10 15:58
     */
    public Map<String,Integer> countTeachersNum(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        countMap.put("教师总数",getAllTeachers().size());
        return countMap;
    }

    /**
     * @description: 统计团队教师构成情况
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 14:42
     */
    public Map<String,Integer> countByStructure(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        countMap.put("硕导",0);
        countMap.put("博导",0);
        countMap.put("高层次人才",0);

        for(Teacher obj :getAllTeachers()){
            String postion = obj.getStaffPostion();
            countMap.put(postion,countMap.get(postion)+1);
            if (obj.getIshighLevel() == 1) countMap.put("高层次人才",countMap.get("高层次人才")+1);
        }

//        for(Teacher obj :getAllTeachers()){
//            int isHight_level = obj.getIshighLevel();
//            if (isHight_level == 1) countMap.put("高层次人才",countMap.get("高层次人才")+1);
//        }
        return countMap;
    }

    /**
     * @description: 统计各研究领域人数
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 15:03
     */
    public Map<String,Integer> countByResearchField(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        for(Teacher obj :getAllTeachers()){
            String researchField = obj.getResearchField();
            if(countMap.get(researchField)==null)
                countMap.put(researchField,1);
            else
                countMap.put(researchField,countMap.get(researchField)+1);
        }
        return countMap;
    }

    /**
     * @description: 统计教师男女占比
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 15:29
     */
    public Map<String,Integer> countBySex(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
        Map<String,Integer> accountMap = new HashMap<String, Integer>();

        AccountExample accountExample = new AccountExample();
        List<Account> accountList = accountMapper.selectByExample(accountExample);

        for(Account obj :accountList)
            accountMap.put(obj.getAccountId(), obj.getAccountSex());

        countMap.put("男性",0);
        countMap.put("女性",0);
        for(Teacher obj :getAllTeachers()){
            int sex = accountMap.get(obj.getStaffId());
            if(sex==1)
                countMap.put("男性",countMap.get("男性")+1);
            else
                countMap.put("女性",countMap.get("女性")+1);
        }
        return countMap;
    }

    /**
     * @description: 统计各高层次人才数
     * @return: Map<String,Integer>
     * @author: Peng Chong
     * @time: 2021/8/11 16:17
     */
    public Map<String,Integer> countByHighLevel(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        PersonnelInfoExample personnelInfoExample = new PersonnelInfoExample();
        List<PersonnelInfo> personnelInfoList = personnelInfoMapper.selectByExample(personnelInfoExample);
        for(PersonnelInfo obj :personnelInfoList){
            String personnelName = obj.getPersonnelName();
            if(countMap.get(personnelName)==null)
                countMap.put(personnelName,1);
            else
                countMap.put(personnelName,countMap.get(personnelName)+1);
        }

        return countMap;
    }

}