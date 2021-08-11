package IDCC.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
     * @description: 查找所有教师信息
     * @return: List
     * @author: Peng Chong
     * @time: 2021/8/7 15:34
     */
    @Override
    public List<Teacher> getAllTeachers() {
        TeacherExample teacherExample = new TeacherExample();
        return teacherMapper.selectByExample(teacherExample);
    }

}