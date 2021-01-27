package IDCC.service;

import IDCC.bean.Teacher;
import IDCC.mapper.TeacherMapper;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @description: 教师信息实现层
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:51
 */
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;
    /**
     * @description: 增加单条教师信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:52
     */
    @Override
    public int addTeacher(Teacher Teacher) {
        return teacherMapper.insert(Teacher);
    }

    /**
     * @description: 删除单条教师信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:54
     */
    @Override
    public int delTeacher(String TeacherId) {
        return teacherMapper.deleteByPrimaryKey(TeacherId);
    }

    /**
     * @description: 查找单条教师信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:55
     */
    @Override
    public Teacher searchTeacher(String TeacherId) {
        Teacher Teacher = teacherMapper.selectByPrimaryKey(TeacherId);
        return Teacher;
    }

    /**
     * @description: 更新单条教师信息
     * @return:
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:55
     */
    @Override
    public int updateTeacher(Teacher Teacher) {
        return teacherMapper.updateByPrimaryKey(Teacher);
    }

    /**
     * @description: 查询教师人数
     * @return: map
     * @author: Peng Chong
     * @time: 2021/1/26 18:02
     */
    @Override
    public Map<String, Integer> countTeacher() {
        List<HashMap<String, Integer>> list = teacherMapper.countTeacher();
        Map<String,Integer> map = new HashMap<>();
        if (list != null && !list.isEmpty()) {
            for (HashMap<String, Integer> map1 : list) {
                String key = null;
                int value = 0;
                for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                    if ("key".equals(entry.getKey())) {
                        key = entry.getValue().toString();
                    } else if ("value".equals(entry.getKey())) {
                        value = entry.getValue();
                    }
                }
                map.put(key, value);
            }
        }
        return map;
    }
}
