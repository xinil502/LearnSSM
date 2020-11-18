package cn.xinil.test.mybatis;

import cn.xinil.dao.IBlogMapper;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest_13 {
    @Test
    public void test_13(){
        SqlSession session = null;
        try{
            session = SqlSessionUtil.getSqlSession();
            IBlogMapper mappper = session.getMapper(IBlogMapper.class);
            mappper.updateBlogUseSet(2 , "第一篇博客", 2);
            session.commit();
        }finally {
            session.close();
        }
    }
}
