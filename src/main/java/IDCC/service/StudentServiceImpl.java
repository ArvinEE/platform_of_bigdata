package IDCC.service;

import IDCC.bean.Student;
import IDCC.bean.StudentExample;
import IDCC.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @description: 学生信息实现层
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:51
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    /**
     * @description: 增加单条学生信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:52
     */
    @Override
    public int addStudent(Student Student) {
        return studentMapper.insert(Student);
    }

    /**
     * @description: 删除单条学生信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:54
     */
    @Override
    public int delStudent(String StudentId) {
        return studentMapper.deleteByPrimaryKey(StudentId);
    }

    /**
     * @description: 查找单条学生信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:55
     */
    @Override
    public Student searchStudent(String StudentId) {
        Student Student = studentMapper.selectByPrimaryKey(StudentId);
        return Student;
    }

    /**
     * @description: 更新单条学生信息
     * @return:
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:55
     */
    @Override
    public int updateStudent(Student Student) {
        return studentMapper.updateByPrimaryKey(Student);
    }

    /**
     * @description: 查询学生数量
     * @return: HashMap
     * @author: Peng Chong
     * @time: 2021/1/27 18:31
     */

    /**
     * @description: 查找所有学生信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/10 16:07
     */
    @Override
    public List<Student> getAllStudents() {
        StudentExample studentExample = new StudentExample();
        return studentMapper.selectByExample(studentExample);
    }

    /**
     * @description: 统计新生新增人数变化（划分为博士、硕士两条线）
     * @param: 无
     * @return: Map<String, Integer>
     * @author: Lai ZhouHao
     * @time: 2021/8/11 18:48
     **/
    @Override
    public Map<String, Integer> countNewStudentNum() {
        Map<String, Integer> map = new HashMap<>();
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        System.out.println("year="+year);
        StudentExample studentExample = new StudentExample();
        System.out.println(new Date(year-5));
        studentExample.createCriteria().andStudentEnrollmentBetween(new Date(year-5),new Date(year));
        List<Student> students = studentMapper.selectByExample(studentExample);
        System.out.println(students);
        return null;
    }
}
