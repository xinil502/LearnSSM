package cn.xinil.test.mybatis;

import cn.xinil.dao.IUserMapper;
import cn.xinil.domain.User;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest_4 {//修改用户数据
    @Test
    public void test_4(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        User user = sqlSession.getMapper(IUserMapper.class).findById(4);
        if(user == null){
            System.out.println("无该用户数据");
            sqlSession.close();
            return;
        }
        user.setUage(21);
        int re = sqlSession.getMapper(IUserMapper.class).updateUser(user);
        if(re == 1){
            System.out.println("成功修改数据");
            sqlSession.commit();
        }else{
            System.out.println("数据修改失败");
        }
        sqlSession.close();
    }
}
