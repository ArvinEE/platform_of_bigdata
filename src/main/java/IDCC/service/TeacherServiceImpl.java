package IDCC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 教师信息实现层
 * @author: Lai Zhouhao
 * @time: 2020/12/7 20:51
 */
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherService teacherMapper;
    /**
     * @description: 增加单条教师信息
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:52
     */
    @Override
    public int addTeacher(Teacher Teacher) {
        return teacherMapper.addTeacher(Teacher);
    }

    /**
     * @description: 删除单条教师信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:54
     */
    @Override
    public int delTeacher(String TeacherId) {
        return teacherMapper.delTeacher(TeacherId);
    }

    /**
     * @description: 查找单条教师信息(根据id删除)
     * @return: 0/1
     * @author: Lai Zhouhao
     * @time: 2020/12/7 20:55
     */
    @Override
    public Teacher searchTeacher(String TeacherId) {
        Teacher Teacher = teacherMapper.searchTeacher(TeacherId);
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
        return teacherMapper.updateTeacher(Teacher);
    }
}
