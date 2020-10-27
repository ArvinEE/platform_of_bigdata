package IDCC.mapper;

import IDCC.bean.Account;
import IDCC.bean.AccountExample;
import org.junit.Test;

import java.util.List;

public class AccountMapperIml implements AccountMapper{
    AccountMapper accountMapper;

    @Override
    public long countByExample(AccountExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AccountExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer accountId) {
        return 0;
    }

    /**
     * @description: 插入数据到account表
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/10/27 16:38
     */
    @Override
    public int insert(Account record) {
        System.out.println(record.getAccountPwd());
        if (accountMapper.insert(record) == 1){
            return 1;
        }
        return 0;
    }

    @Override
    public int insertSelective(Account record) {
        return 0;
    }

    @Override
    public List<Account> selectByExample(AccountExample example) {
        return null;
    }

    @Override
    public Account selectByPrimaryKey(Integer accountId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Account record, AccountExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Account record, AccountExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Account record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Account record) {
        return 0;
    }
}
