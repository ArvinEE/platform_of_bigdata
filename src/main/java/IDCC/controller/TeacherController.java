package IDCC.controller;

import IDCC.bean.Teacher;
import IDCC.service.TeacherServiceImpl;
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
 * @description: 控制教师信息的操作
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:46
 */
@Controller
@Api(value = "教师信息操作控制层")
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    /**
     * @description: 控制增加单条教师信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/7 21:02
     */
    @PostMapping("/addTeacher")
    @ApiOperation(value = "增加单条教师信息",notes = "未测试")
    @ResponseBody
    public String addteacher(@ModelAttribute Teacher teacher, HttpServletRequest httpServletRequest){
        if(teacherService.addTeacher(teacher) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 删除单条教师信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/8 19:29
     */
    @PostMapping("/delTeacher")
    @ApiOperation(value = "删除单条教师信息",notes = "未测试")
    @ResponseBody
    public String delteacher(String teacherId){
        if (teacherService.delTeacher(teacherId) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 查找单条教师信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/8 19:29
     */
    @GetMapping("/searchTeacher")
    @ApiOperation(value = "查找单条教师信息",notes = "未测试")
    @ResponseBody
    public String searchteacher(String teacherId, HttpServletRequest httpServletRequest){
        Teacher teacher = teacherService.searchTeacher(teacherId);
        if (teacher != null){
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("teacher",teacher);
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 修改单条教师信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/8 19:29
     */
    @PostMapping("/updateTeacher")
    @ApiOperation(value = "修改单条教师信息",notes = "未测试")
    @ResponseBody
    public String updatateacher(@ModelAttribute Teacher teacher, HttpServletRequest httpServletRequest){
        if (teacherService.updateTeacher(teacher) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }
    /**
     * @description: 查询教师数量
     * @return: map
     * @author: Peng Chong
     * @time: 2021/1/26 18:05
     */
    @GetMapping("/countTeacher")
    @ApiOperation(value = "查询教师数量",notes = "未测试")
    @ResponseBody
    public Map<String, Integer> countTeacher(){
        return teacherService.countTeacher();
    }
}
