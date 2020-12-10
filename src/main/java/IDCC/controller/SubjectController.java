package IDCC.controller;

import IDCC.bean.Subject;
import IDCC.service.SubjectServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectServiceImpl subjectService;

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
     * @return: SUCCESS/FAILE
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
}
