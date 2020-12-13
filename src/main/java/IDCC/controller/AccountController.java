package IDCC.controller;

import IDCC.bean.Account;
import IDCC.bean.Student;
import IDCC.bean.Teacher;
import IDCC.service.AccountServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.ArrayList;
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
    public String userLogin(String accountId, String userPwd, Model model){
        List<Object> userInformation = accountService.userLogin(accountId,userPwd);
        //获取账号信息
        Account account = (Account)userInformation.get(0);
        model.addAttribute("account",account);
        //获取该账号是教师还是教师
        if(account.getAccountRight() == 2){
            model.addAttribute("student",((Student)userInformation.get(1)));
        }else{
            model.addAttribute("teacher",((Teacher)userInformation.get(1)));
        }
        return "index";
    }

    /**
     * @description: 控制增加一条信息
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
     * @description: 控制删除一条信息
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

    /**
     * @description: 控制查找一条账户信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/13 9:26
     */
    @GetMapping("/searchAccount")
    @ApiOperation(value = "查找单条账户信息",notes = "未测试")
    @ResponseBody
    public String searchAccount(String accountId, Model model){
        Account account = accountService.searchAccount(accountId);
        if(account != null){
            model.addAttribute("account",account);
            return "SUCCESS";
        }
        return "FAILE";
    }

    /**
     * @description: 控制模糊查找账户信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/12/13 9:26
     */
    @GetMapping("/searchAccountByExample")
    @ApiOperation(value = "模糊查找账户信息",notes = "未测试")
    @ResponseBody
    public String searchAccountByExample(String condition, Model model){
        List<Account> accountList = new ArrayList<>();
        accountList = accountService.searchAccountByExample(condition);
        if(accountList.size() != 0){
            model.addAttribute("accountList",accountList);
            return "SUCCESS";
        }
        return "FAILE";
    }
}
