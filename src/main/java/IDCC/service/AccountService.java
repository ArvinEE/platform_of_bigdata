package IDCC.service;

import IDCC.bean.Account;

/**
 * @description: 用户信息接口层
 * @author: Lai Zhouhao
 * @time: 2020/11/25 9:46
 */
public interface AccountService {
    //插入一条账号信息
    int insertOneRecord(Account account);
    //删除一条账号信息
    int deleteOneRecord(int accountId);
}
