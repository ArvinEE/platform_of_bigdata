package IDCC.controller;

import IDCC.bean.Subject;


import IDCC.bean.Subject;
import IDCC.service.SubjectService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(value = "项目信息控制层")
@CrossOrigin
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;


    /**
     * @description: 控制增加项目信息操作
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:13
     */
    @PostMapping("/addSubject")
    @ResponseBody
    @ApiOperation(value = "增加单条项目信息",notes = "未测试")
    public String addSubject(Subject subject){
        if(subjectService.addSubject(subject) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 控制删除项目信息操作
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:13
     */
    @PostMapping("/delSubject")
    @ResponseBody
    @ApiOperation(value = "删除单条项目信息",notes = "未测试")
    public String delSubject(String subjectId){
        if(subjectService.delSubject(subjectId) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 控制查找项目信息操作
     * @return: Subject对象
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:13
     */
    @PostMapping("/searchSubject")
    @ResponseBody
    @ApiOperation(value = "查找单条项目信息",notes = "未测试")
    public String searchSubject(String subjectId, Model model){
        Subject subject = subjectService.searchSubject(subjectId);
        if(subject != null){
            model.addAttribute("subject",subject);
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 控制修改项目信息操作
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:13
     */
    @PostMapping("/updateSubject")
    @ResponseBody
    @ApiOperation(value = "修改单条项目信息",notes = "未测试")
    public String updateSubject(Subject subject){
        if(subjectService.updateSubject(subject) == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 查找所有课题（项目）信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/10 19:20
     */
    @GetMapping("/getAllSubjects")
    @ApiOperation(value = "查找所有课题（项目）信息",notes = "未测试")
    @ResponseBody
    public List<Subject> getAllSubjects(){
        List<Subject> subjectsList = new ArrayList<>();
        subjectsList = subjectService.getAllSubjects();
        return subjectsList;
    }

    /**
     * @description: 统计所有项目进度
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/10 19:27
     */
    @GetMapping("/countBySchedule")
    @ApiOperation(value = "统计所有项目进度",notes = "未测试")
    @ResponseBody
    public String countBySchedule(){
        Map<String, Map<String, String>> countMap = new HashMap<>();

        countMap = subjectService.countBySchedule();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计正在进行的项目数量和已结题的项目数量
     * @param: 无
     * @return:
     * @author: Lai ZhouHao
     * @time: 2021/8/11 19:17
    **/
    @GetMapping("/countSubjectScheduleNum")
    @ApiOperation(value = "统计正在进行的项目数量和已结题的项目数量",notes = "未测试")
    @ResponseBody
    public String countSubjectScheduleNum(){
        return JSONObject.toJSONString(subjectService.countSubjectScheduleNum());
    }

    /**
     * @description: 统计各项目资助类别数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/11 19:30
     */
    @GetMapping("/countByClass")
    @ApiOperation(value = "统计各项目资助类别数",notes = "未测试")
    @ResponseBody
    public String countByClass(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        countMap = subjectService.countByClass();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

    /**
     * @description: 统计项目立项个数
     * @return: json
     * @author: Peng Chong
     * @time: 2021/8/10 19:27
     */
    @GetMapping("/countBySubject")
    @ApiOperation(value = "统计项目立项个数",notes = "未测试")
    @ResponseBody
    public String countBySubject(){
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        countMap = subjectService.countBySubject();
        String json = JSONObject.toJSONString(countMap);
        return json;
    }

}
