package IDCC.service;

import IDCC.bean.Student;

import java.util.List;
import java.util.Map;

/**
 * @description: 教师信息实现层接口
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:47
 */
public interface StudentService {
    //增加单条教师信息
    public int addStudent(Student student);
    //删除单条教师信息(根据id删除)
    public int delStudent(String studentId);
    //查找单条教师信息(根据id查)
    public Student searchStudent(String studentId);
    //修改单条教师信息
    public int updateStudent(Student student);
    //获取所有教师信息
    List<Student> getAllStudents();
    //统计新生新增人数变化（划分为博士、硕士两条线）
    Map<String, Map<String, Integer>> countNewStudentNum();
//    Map<String, Integer> countNewStudentNum();
    //统计学生总人数
    Map<String, Integer> countStudentsNum();
    //统计各年级学生人数
    Map<String, Integer> countByGrade();
}
