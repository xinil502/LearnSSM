package cn.xinil.test.mybatis;

import cn.xinil.dao.IBlogMapper;
import cn.xinil.domain.Blog;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class MybatisTest_10 {
    @Test
    public void Test_10(){  //Blog插入数据记录。
        SqlSession session = SqlSessionUtil.getSqlSession();
        IBlogMapper mapper = session.getMapper(IBlogMapper.class);

        Blog blog = new Blog();
        blog.setAuthor("xinil");
        blog.setViews(9999);
        blog.setTitle("第四篇博客");
        blog.setCreateTime(new Date());
        mapper.addBlog(blog);

        session.commit();
        session.close();
    }
}
