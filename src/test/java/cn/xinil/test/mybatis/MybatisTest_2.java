package cn.xinil.test.mybatis;

import cn.xinil.dao.IUserMapper;
import cn.xinil.domain.User;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class MybatisTest_2 {
    @Test
    public void test2() {
        SqlSession session = SqlSessionUtil.getSqlSession();

        IUserMapper mapper = session.getMapper(IUserMapper.class);

        System.out.println(mapper.findById(4));
        List<User> list = mapper.findByUClass("软件1904班");
        for(Iterator<User> ite = list.iterator();ite.hasNext();){
            System.out.println(ite.next());
        }

        session.close();
    }
}
