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
