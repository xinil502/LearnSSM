package cn.xinil.test;

import cn.xinil.dao.IStudentMapper;
import cn.xinil.dao.ITeacherMapper;
import cn.xinil.domain.Student;
import cn.xinil.domain.Teacher;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest_8 {


    @Test
    public void test_8_1(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        IStudentMapper mapper = session.getMapper(IStudentMapper.class);
        List<Student> list = mapper.findStudet();

        for(Student s : list){
            System.out.println(s);
        }
    }
}
