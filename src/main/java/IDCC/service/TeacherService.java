package IDCC.service;


import IDCC.bean.PersonnelInfo;
import IDCC.bean.Teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @description: 教师信息实现层接口
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:47
 */
public interface TeacherService {
    //增加单条教师信息
    public int addTeacher(Teacher teacher);
    //删除单条教师信息(根据id删除)
    public int delTeacher(String teacherId);
    //查找单条教师信息(根据id查)
    public Teacher searchTeacher(String teacherId);
    //修改单条教师信息
    public int updateTeacher(Teacher teacher);
    //获取所有教师信息
    List<Teacher> getAllTeachers();
    //统计教师各职称人数
    Map<String,Integer> countByStaffTitle();
    //统计教师变动情况
    Map<String,Integer> countByTransfer();
    // 统计各团队教师人数
    Map<String,Integer> countByGroup();
    // 统计教师总人数
    Map<String,Integer> countTeachersNum();
    // 统计团队教师构成情况
    Map<String,Integer> countByStructure();
    // 统计各研究领域人数
    Map<String,Integer> countByResearchField();
    //  统计教师男女占比
    Map<String,Integer> countBySex();
    // 统计各高层次人才数
    Map<String,Integer> countByHighLevel();

}
