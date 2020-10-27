package IDCC.controller;

import IDCC.bean.Account;
import IDCC.mapper.AccountMapperIml;
import io.swagger.annotations.Api;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @description: 控制层，控制页面得的跳转，数据的输入输出
 * @author: Lai Zhouhao
 * @time: 2020/10/26 21:04
 */
@Controller
public class DemoController {

    AccountMapperIml accountMapperIml;
    /**
     * @description: 
     * @return: 返回界面html的文件名，控制界面跳转
     * @author: Lai Zhouhao
     * @time: 2020/10/26 21:04
     */
    @RequestMapping("/demo")
    public String demo(){
        return "demo";
    }

    /**
     * @description: 控制跳转到index界面
     * @return: 
     * @author: Lai Zhouhao
     * @time: 2020/10/26 21:06
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * @description: 测试数据库的增删改查
     * @return: 无
     * @author: Lai Zhouhao
     * @time: 2020/10/27 16:20
     */
    @Test
    public void Test(){
        Account account = new Account();
        account.setAccountId(1);
        account.setAccountPwd("679914");
        account.setAccountRight("1");
        System.out.println(account.getAccountPwd());
        accountMapperIml.insert(account);
        System.out.println("插入数据成功");
        System.out.println("插入失败");
    }
}
