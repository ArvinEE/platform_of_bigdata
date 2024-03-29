package IDCC.controller;

import IDCC.bean.Student;
import IDCC.service.StudentService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 控制学生信息的操作
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:46
 */
@Controller
@Api(value = "学生信息操作控制层")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * @description: 控制增加单条学生信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/7 21:02
     */
    @PostMapping("/addStudent")
    @ApiOperation(value = "增加单条学生信息",notes = "未测试")
    @ResponseBody
    public String addStudent(@ModelAttribute Student student, HttpServletRequest httpServletRequest){
        if(studentService.addStudent(student) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 删除单条学生信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/8 19:29
     */
    @PostMapping("/delStudent")
    @ApiOperation(value = "删除单条学生信息",notes = "未测试")
    @ResponseBody
    public String delstudent(String studentId){
        if (studentService.delStudent(studentId) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 查找单条学生信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/8 19:29
     */
    @GetMapping("/searchStudent")
    @ApiOperation(value = "查找单条学生信息",notes = "未测试")
    @ResponseBody
    public String searchstudent(String studentId, HttpServletRequest httpServletRequest){
        Student student = studentService.searchStudent(studentId);
        if (student != null){
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("student",student);
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 修改单条学生信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/8 19:29
     */
    @PostMapping("/updateStudent")
    @ApiOperation(value = "修改单条学生信息",notes = "未测试")
    @ResponseBody
    public String updateStudent(@ModelAttribute Student student, HttpServletRequest httpServletRequest){
        if (studentService.updateStudent(student) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 获取所有学生信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/10 16:10
     */
    @GetMapping("/getAllStudents")
    @ApiOperation(value = "获取所有学生信息",notes = "未测试")
    @ResponseBody
    public List<Student> getAllStudents(){
        List<Student> studentsList = new ArrayList<>();
        studentsList = studentService.getAllStudents();
        return studentsList;
    }

    /**
     * @description: 统计学生总人数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/10 16:20
     */
    @GetMapping("/countStudentsNum")
    @ApiOperation(value = "统计学生总人数",notes = "未测试")
    @ResponseBody
    public String countStudentsNum(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();
//        countMap.put("学生总数",getAllStudents().size());
        countMap = studentService.countStudentsNum();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计各年级学生人数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/10 16:30
     */
    @GetMapping("/countByGrade")
    @ApiOperation(value = "统计各年级学生人数",notes = "未测试")
    @ResponseBody
    public String countByGrade(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        countMap = studentService.countByGrade();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 新生新增人数变化（划分为博士、硕士两条线）
     * @param: 无
     * @return:
     * @author: Lai ZhouHao
     * @time: 2021/8/11 18:43
    **/
    @GetMapping("/countNewStudentNum")
    @ApiOperation(value = "新生新增人数变化（划分为博士、硕士两条线）",notes = "未测试")
    @ResponseBody
    public String countNewStudentNum(){
        return JSONObject.toJSONString(studentService.countNewStudentNum());
    }
}
