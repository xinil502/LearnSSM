package cn.xinil.test.mybatis;

import cn.xinil.dao.ITeacherMapper;
import cn.xinil.domain.Teacher;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest_9 {

    @Test
    public void test_9_1(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        ITeacherMapper mapper = session.getMapper(ITeacherMapper.class);
        List<Teacher> list =  mapper.findTeacher();
        for(Teacher t: list){
            System.out.println(t);
        }
        session.close();
    }
}
