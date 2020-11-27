package IDCC.controller;

import IDCC.bean.Account;
import IDCC.service.AccountServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
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
     * @description: 控制增加一条信息
     * @return: SUCCESS/FAILE
     * @author: Lai Zhouhao
     * @time: 2020/11/26 21:23
     */
    @PutMapping("/add")
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
    @PutMapping("/delete")
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
     * @description: 控制登录验证
     * @return: List<Object>
     * @author: Lai Zhouhao
     * @time: 2020/11/27 18:45
     */
    @GetMapping("/login")
    @ResponseBody
    @ApiOperation(value = "用户登录", notes = "21点00分 已测试")
    public List<Object> userLogin(String accountId, String userPwd){
        List<Object> userInformation = accountService.userLogin(accountId,userPwd);
        return userInformation;
    }
}
