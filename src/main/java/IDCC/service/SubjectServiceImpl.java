package IDCC.service;

import IDCC.bean.Subject;
import IDCC.bean.SubjectExample;
import IDCC.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * @description: 统计正在进行的项目数量和已解题的项目数量
     * @param: 无
     * @return: Map<String, Integer>
     * @author: Lai ZhouHao
     * @time: 2021/8/11 19:20
    **/
    @Override
    public Map<String, Integer> countSubjectScheduleNum() {
        Map<String, Integer> map = new HashMap<>();
        List<Subject> subjects = subjectMapper.selectByExample(new SubjectExample());
        int finished = 0, process = 0;
        for (Subject subject : subjects) {
            String schedule = subject.getSubjectSchedule();
            switch (schedule){
                case "已结题":
                    finished++;
                    break;
                case "正在进行":
                    process++;
                    break;
            }
        }
        map.put("已结题", finished);
        map.put("正在进行", process);
        return map;
    }


}
