package IDCC.service;

import IDCC.bean.Teacher;

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
}
