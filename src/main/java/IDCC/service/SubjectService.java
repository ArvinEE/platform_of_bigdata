package IDCC.service;

import IDCC.bean.Subject;

import java.util.List;
import java.util.Map;

/**
 * @description: 项目信息操作接口层
 * @author: Lai Zhouhao
 * @time: 2020/12/10 11:01
 */
public interface SubjectService {
    //增加单条项目信息
    public int addSubject(Subject subject);
    //删除单条项目信息(根据id)
    public int delSubject(String subjectId);
    //查找单条项目信息(根据id)
    public Subject searchSubject(String subjectId);
    //修改单条项目信息（根据id）
    public int updateSubject(Subject subject);
    //获取所有教师信息
    public List<Subject> getAllSubjects();
    //统计正在进行的项目数量和已解题的项目数量
    public Map<String, Integer> countSubjectScheduleNum();
    //统计所有项目进度
    public Map<String, String> countBySchedule();
    //统计各项目资助类别数
    public Map<String, Integer> countByClass();
    //统计项目立项个数
    public Map<String, Integer> countBySubject();
}
