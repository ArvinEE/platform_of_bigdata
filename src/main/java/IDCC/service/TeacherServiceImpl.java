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
     * @description: 查询教师人数返回信息
     * @return: HashMap
     * @author: Peng Chong
     * @time: 2021/1/27 18:15
     */
    @Override
    public HashMap<String, Integer> countTeacher() {
        int Professor = 0;
        int associateProfessor=0;
        int Lecturer=0;
        int postdoctoral=0;
        HashMap<String , Integer> Num = new HashMap<String , Integer>();
        for (String title:teacherMapper.selectByStaffTitle()
             ) {
            switch (title){
                case "教授" :Professor++;break;
                case "副教授" :associateProfessor++;break;
                case "讲师" :Lecturer++;break;
                case "博士后" :postdoctoral++;break;
            }
        }
        Num.put("教授",Professor);
        Num.put("副教授",associateProfessor);
        Num.put("讲师",Lecturer);
        Num.put("博士后",postdoctoral);
        return Num;
    }

}
