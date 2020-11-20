package cn.xinil.test.mybatis;

import cn.xinil.dao.IBlogMapper;
import cn.xinil.domain.Blog;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest_15 { //一级sqlsession缓存

    @Test
    public void test_15(){
        SqlSession session = null;
        try {
            session = SqlSessionUtil.getSqlSession();
            IBlogMapper mapper = session.getMapper(IBlogMapper.class);

            List<Blog> blogs = mapper.findBlogUseIf("xinil","第一篇博客");
            for (Blog b: blogs){
                System.out.println(b);
            }

            System.out.println("====================");
            blogs = mapper.findBlogUseIf("xinil","第二篇博客");
            for (Blog b: blogs){
                System.out.println(b);
            }
            session.close();

            session = SqlSessionUtil.getSqlSession();
            mapper = session.getMapper(IBlogMapper.class);
            System.out.println("====================");
            blogs = mapper.findBlogUseIf("xinil","第一篇博客");
            for (Blog b: blogs){
                System.out.println(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
