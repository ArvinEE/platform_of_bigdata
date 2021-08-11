package IDCC.service;

import IDCC.bean.Subject;
import IDCC.bean.SubjectExample;
import IDCC.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 项目信息操作实现层
 * @author: Lai Zhouhao
 * @time: 2020/12/10 11:08
 */
@Service
public class SubjectServiceImpl implements SubjectService{
    @Autowired
    private SubjectMapper subjectMapper;

    /**
     * @description: 增加单条项目信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:08
     */
    @Override
    public int addSubject(Subject subject) {
        return subjectMapper.insert(subject);
    }

    /**
     * @description: 删除单条项目信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:08
     */
    @Override
    public int delSubject(String subjectId) {
        return subjectMapper.deleteByPrimaryKey(subjectId, "1000");
    }

    /**
     * @description: 查找单条项目信息
     * @return: Subject对象
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:08
     */
    @Override
    public Subject searchSubject(String subjectId) {
        return subjectMapper.selectByPrimaryKey(subjectId,"1001");
    }

    /**
     * @description: 修改单条项目信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/10 11:08
     */
    @Override
    public int updateSubject(Subject subject) {
        return subjectMapper.updateByPrimaryKey(subject);
    }

    /**
     * @description: 查找所有课题（项目）信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/10 19:16
     */
    @Override
    public List<Subject> getAllSubjects() {
        SubjectExample subjectExample = new SubjectExample();
        return subjectMapper.selectByExample(subjectExample);
    }
}
