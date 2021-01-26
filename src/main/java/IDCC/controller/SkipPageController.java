package IDCC.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 界面跳转控制层
 * @author: Lai Zhouhao
 * @time: 2020/12/25 15:48
 */
@Controller
@RequestMapping("/page")
public class SkipPageController {
    /**
     * @description: 控制跳转到主界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2020/12/25 15:49
     */
    @GetMapping("/index")
    @ApiOperation(value = "跳转到index界面",notes = "未测试")
    public String toIndex(){
        return "/page/index";
    }
    
    /**
     * @description: 控制跳转到课题组信息界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2021/1/26 22:48
     */
    @GetMapping("team")
    @ApiOperation(value = "跳转到team界面",notes = "已测试")
    public String toTeam(){
        return "/page/team/teamList";
    }

    /**
     * @description: 控制跳转到教师信息界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2021/1/26 22:48
     */
    @GetMapping("teacher")
    @ApiOperation(value = "跳转到teacher界面",notes = "已测试")
    public String toTeacher(){
        return "/page/teacher/teacherList";
    }

    /**
     * @description: 控制跳转到学生信息界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2021/1/26 22:48
     */
    @GetMapping("student")
    @ApiOperation(value = "跳转到student界面",notes = "已测试")
    public String toStudent(){
        return "/page/student/studentList";
    }

    /**
     * @description: 控制跳转到项目信息界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2021/1/26 22:48
     */
    @GetMapping("project")
    @ApiOperation(value = "跳转到project界面",notes = "已测试")
    public String toProject(){
        return "/page/project/projectList";
    }

    /**
     * @description: 控制跳转到成果信息界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2021/1/26 22:48
     */
    @GetMapping("achievement")
    @ApiOperation(value = "跳转到achievement界面",notes = "已测试")
    public String toAchievement(){
        return "/page/achievement/achievementList";
    }

    /**
     * @description: 控制跳转到权限信息界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2021/1/26 22:48
     */
    @GetMapping("authority")
    @ApiOperation(value = "跳转到authority界面",notes = "已测试")
    public String toAuthority(){
        return "/page/authority/authorityList";
    }

    /**
     * @description: 控制跳转到404信息界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2021/1/26 22:48
     */
    @GetMapping("404")
    @ApiOperation(value = "跳转到404界面",notes = "已测试")
    public String toFourZeroFour(){
        return "/page/404";
    }

    /**
     * @description: 控制跳转到登录界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2020/12/25 15:54
     */
    @GetMapping("/login")
    @ApiOperation(value = "跳转到登录界面",notes = "未测试")
    public String toLogin(){
        return "/page/login/login";
    }

    /**
     * @description: 控制跳转到登录界面
     * @return: 界面
     * @author: Lai Zhouhao
     * @time: 2020/12/25 15:54
     */
    @GetMapping("/main")
    @ApiOperation(value = "跳转到main界面",notes = "未测试")
    public String toMain(){
        return "/page/main";
    }
}
