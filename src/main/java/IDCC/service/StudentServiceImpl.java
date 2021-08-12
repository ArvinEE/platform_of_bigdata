package IDCC.service;

import IDCC.bean.Student;
import IDCC.bean.StudentExample;
import IDCC.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String, Map<String, Integer>> countNewStudentNum() {
        Map<String, Map<String, Integer>> map = new HashMap<>();
        Map<String, Integer> master = new HashMap<>();
        Map<String, Integer> docter = new HashMap<>();
        int  []mast = new int[5];
        int  []doc = new int[5];
        List<Student> students = studentMapper.selectByExample(new StudentExample());
        for (Student student : students) {
            String []time = String.valueOf(student.getStudentEnrollment()).split(" ");
            int enterYear = Integer.valueOf(time[time.length-1]);
            int now = Calendar.getInstance().get(Calendar.YEAR);
            if (enterYear <= now && enterYear >= now-5){
                String grade = student.getStudentGrade();
                switch (grade){
                    case "研一":
                        master.put("研一", ++mast[0]);
                        break;
                    case "研二":
                        master.put("研二", ++mast[1]);
                        break;
                    case "研三":
                        master.put("研三", ++mast[2]);
                        break;
                    case "博一":
                        docter.put("博一", ++doc[0]);
                        break;
                    case "博二":
                        docter.put("博二", ++doc[1]);
                        break;
                    case "博三":
                        docter.put("博三", ++doc[2]);
                        break;
                    case "硕士已毕业":
                        if (enterYear == now-4){
                            master.put("硕士毕业一年", ++mast[3]);
                        }else {
                            master.put("硕士毕业两年", ++mast[4]);
                        }
                        break;
                    case "博士已毕业":
                        if (enterYear == now-4){
                            docter.put("博士毕业一年", ++doc[3]);
                        }else {
                            docter.put("博士毕业两年", ++doc[4]);
                        }
                        break;
                }
            }
        }
        map.put("硕士研究生", master);
        map.put("博士研究生", docter);
        return map;
    }
}
