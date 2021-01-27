package IDCC.controller;

import IDCC.bean.Mygroup;
import IDCC.bean.Student;
import IDCC.service.StudentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    private StudentServiceImpl studentService;

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
    public String updatastudent(@ModelAttribute Student student, HttpServletRequest httpServletRequest){
        if (studentService.updateStudent(student) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }
    /**
     * @description: 查询学生数量
     * @return: HashMap
     * @author: Peng Chong
     * @time: 2021/1/27 18:35
     */
    @GetMapping("/countStudent")
    @ApiOperation(value = "查询学生数量",notes = "未测试")
    @ResponseBody
    public HashMap<String, Integer> countStudent(){
        return studentService.countStudent();
    }
}
