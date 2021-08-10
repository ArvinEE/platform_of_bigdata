package IDCC.controller;

import IDCC.bean.Mygroup;
import IDCC.bean.Teacher;
import IDCC.service.GroupServiceImpl;
import IDCC.service.TeacherServiceImpl;
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
    @Autowired
    private GroupServiceImpl groupService;

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
     * @description: 获取所有教师信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/7 15:40
     */
    @GetMapping("/getAllTeachers")
    @ApiOperation(value = "获取所有教师信息",notes = "未测试")
    @ResponseBody
    public List<Teacher> getAllTeachers(){
        List<Teacher> teachersList = new ArrayList<>();
        teachersList = teacherService.getAllTeachers();
        return teachersList;
    }
    /**
     * @description: 统计各职称人数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/7 15:53
     */
    @GetMapping("/countByStaffTitle")
    @ApiOperation(value = "统计各职称人数",notes = "未测试")
    @ResponseBody
    public String countByStaffTitle(){
        HashMap<String,Integer> countMap = new HashMap<String, Integer>();
        for(Teacher obj :teacherService.getAllTeachers()){
            String stafftitle = obj.getStaffTitle();
            if(countMap.get(stafftitle)==null)
                countMap.put(stafftitle,1);
            else
                countMap.put(stafftitle,countMap.get(stafftitle)+1);
        }
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计教师变动情况
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/9 20:00
     */
    @GetMapping("/countByTransfer")
    @ApiOperation(value = "统计教师变动情况",notes = "未测试")
    @ResponseBody
    public String countByTransfer(){
        HashMap<String,Integer> countMap = new HashMap<String, Integer>();
        countMap.put("教师人数",getAllTeachers().size());
        countMap.put("在职人数",0);
        countMap.put("调动人数",0);
        for(Teacher obj :teacherService.getAllTeachers()){
            int used = obj.getUsed();
            if(used==1)
                countMap.put("在职人数",countMap.get("在职人数")+1);
            else
                countMap.put("调动人数",countMap.get("调动人数")+1);
        }
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计各团队教师人数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/9 21:20
     */
    @GetMapping("/countByGroup")
    @ApiOperation(value = "统计各团队教师人数",notes = "未测试")
    @ResponseBody
    public String countByGroup(){

        HashMap<Integer,Integer> groupMap = new HashMap<Integer, Integer>();
        HashMap<String,Integer> countMap = new HashMap<String, Integer>();
        HashMap<Integer,String> transferMap = new HashMap<Integer,String>();

        for(Mygroup obj :groupService.getAllGroups())
        {
            groupMap.put(obj.getGroupId(),0);
            transferMap.put(obj.getGroupId(),obj.getGroupName());
        }

        for(Teacher obj :teacherService.getAllTeachers()){
            int groupId = obj.getGroupId();
            groupMap.put(groupId, groupMap.get(groupId)+1);
        }

        groupMap.forEach((key, value) -> countMap.put(transferMap.get(key),value));

        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计教师总人数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/10 15:58
     */
    @GetMapping("/countTeachersNum")
    @ApiOperation(value = "统计教师总人数",notes = "未测试")
    @ResponseBody
    public String countTeachersNum(){
        HashMap<String,Integer> countMap = new HashMap<String, Integer>();
        countMap.put("教师总数",getAllTeachers().size());
        String json = JSONObject.toJSONString(countMap);
        return json;
    }



}
