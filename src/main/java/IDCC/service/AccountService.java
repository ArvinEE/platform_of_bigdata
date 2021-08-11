package IDCC.service;


import IDCC.bean.Account;

import java.util.List;

/**
 * @description: 用户信息接口层
 * @author: Lai Zhouhao
 * @time: 2020/11/25 9:46
 */
public interface AccountService {
    //插入一条账号信息
    int insertOneRecord(Account account);
    //删除一条账号信息
    int deleteOneRecord(String accountId);
    //查找一条账户信息
    Account searchAccount(String accountId);
    //登录验证
    List<Object> userLogin(String accountId, String userPwd);
    //模糊查询
    List<Account> searchAccountByExample(String condition);
    //获取所有账户信息
    List<Account> getAllAccounts();
}
