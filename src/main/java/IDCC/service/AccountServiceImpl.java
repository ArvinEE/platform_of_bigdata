package IDCC.service;

import IDCC.bean.Account;
import IDCC.bean.AccountExample;
import IDCC.bean.Teacher;
import IDCC.bean.TeacherExample;
import IDCC.mapper.AccountMapper;
import IDCC.mapper.StudentMapper;
import IDCC.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
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
    public int deleteOneRecord(String accountId) {
        return accountMapper.deleteByPrimaryKey(accountId);
    }

    /**
     * @description: 实现登录验证
     * @return: List<Object>
     * @author: Lai Zhouhao
     * @time: 2020/11/27 19:02
     */
    @Override
    public List<Object> userLogin(String userName, String userPwd) {
        List<Object> userInformation = new LinkedList<>();
        //查找账号
        Account account = new Account();
        try {
            account = accountMapper.selectByPrimaryKey(userName);
            userInformation.add(account);
        }catch (NullPointerException e){
            System.out.println(e);
        }
        //账号不存在或者密码错误则返回null
        if (account == null){
            return null;
        }
        if (!account.getAccountPwd().equals(userPwd)){
            userInformation.remove(0);
            userInformation.add(null);
            return userInformation;
        }
        //将账户信息、该用户个人信息返回
        if (account.getAccountRight() == 2){
            try {
                Teacher teacher = teacherMapper.selectByPrimaryKey(userName);
                userInformation.add(teacher);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        if (account.getAccountRight() == 1){
            try {
                Teacher teacher = teacherMapper.selectByPrimaryKey(userName);
                userInformation.add(teacher);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return userInformation;
    }


    /**
     * @description: 查找一条账号信息（根据id）
     * @return: Account对象
     * @author: Lai Zhouhao
     * @time: 2020/12/13 9:32
     */
    @Override
    public Account searchAccount(String accountId) {
        return accountMapper.selectByPrimaryKey(accountId);
    }

    /**
     * @description: 查询多条账户信息（模糊查询）
     * @return: List<Account>
     * @author: Lai Zhouhao
     * @time: 2020/12/13 20:48
     */
    @Override
    public List<Account> searchAccountByExample(String condition) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andAccountIdLike("%"+condition+"%");
        return accountMapper.selectByExample(accountExample);
    }

    /**
     * @description: 查找所有账户信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/7 15:34
     */
    @Override
    public List<Account> getAllAccounts() {
        AccountExample accountExample = new AccountExample();
        return accountMapper.selectByExample(accountExample);
    }
}
