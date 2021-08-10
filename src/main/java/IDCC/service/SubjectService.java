package IDCC.service;

import IDCC.bean.Subject;
import IDCC.bean.Teacher;

import java.util.List;

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
    List<Subject> getAllSubjects();
}
