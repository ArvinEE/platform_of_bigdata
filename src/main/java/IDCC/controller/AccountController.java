package IDCC.controller;

import IDCC.bean.Account;
import IDCC.bean.Student;
import IDCC.bean.Teacher;
import IDCC.service.AccountServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @description: 账号信息控制层
 * @author: Lai Zhouhao
 * @time: 2020/11/27 10:39
 */
@Controller
@Api(value = "账户操作控制层")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;

    /**
     * @description: 控制登录验证
     * @return: List<Object>
     * @author: Lai Zhouhao
     * @time: 2020/11/27 18:45
     */
    @PostMapping("/login")
    @ApiOperation(value = "用户登录", notes = "21点00分 已测试")
    public String userLogin(String accountId, String userPwd, HttpServletRequest httpServletRequest){
        List<Object> userInformation = accountService.userLogin(accountId,userPwd);
        //获取账号信息
        Account account = (Account)userInformation.get(0);
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("account",account);
        //将用户信息放入session
        if(account.getAccountRight() == 2){
            session.setAttribute("user",((Student)userInformation.get(1)));
        }else{
            session.setAttribute("user",((Teacher)userInformation.get(1)));
        }
        return "index";
    }

    /**
     * @description: 控制增加一条账号信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/11/26 21:23
     */
    @PutMapping("/addAccount")
    @ResponseBody
    @ApiOperation(value = "增加账号信息",notes = "21点45分 已测试")
    public String addAccount(Account account){
        int result = accountService.insertOneRecord(account);
        if (result == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 控制删除一条账号信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/11/26 21:23
     */
    @PutMapping("/delAccount")
    @ResponseBody
    @ApiOperation(value = "删除账号信息",notes = "21点50分 已测试")
    public String deleteAccount(String accountId){
        int result = accountService.deleteOneRecord(accountId);
        if (result == 1){
            return "SUCCESS";
        }
        return "FAILE";
    }


}
