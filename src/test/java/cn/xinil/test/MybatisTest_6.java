package cn.xinil.test;

import cn.xinil.dao.IUserMapper;
import cn.xinil.domain.User;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Iterator;
import java.util.List;

public class MybatisTest_6 {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        List<User> list = sqlSession.getMapper(IUserMapper.class).findUserLike("张_");

        for(Iterator<User> ite = list.iterator(); ite.hasNext();){
            System.out.println(ite.next());
        }
    }
}
