package IDCC.service;

import IDCC.bean.Account;
import IDCC.mapper.AccountMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    public AccountMapper accountMapper;
    /**
     * @description: 实现插入一条信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/11/26 21:20
     */
    @Override
    public int insertOneRecord(Account account) {
        return accountMapper.insert(account);
    }

    /**
     * @description: 实现删除一条信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/11/26 21:20
     */
    @Override
    public int deleteOneRecord(int accountId) {
        return accountMapper.deleteByPrimaryKey(accountId);
    }
}
