package cn.xinil.test;

import cn.xinil.dao.IUserMapper;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class MybatisTest_5 {//删除用户信息
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        int i = sqlSession.getMapper(IUserMapper.class).deleteUser(8);
        sqlSession.commit();
        sqlSession.close();
    }
}
