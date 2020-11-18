package cn.xinil.test.mybatis;

import cn.xinil.dao.IBlogMapper;
import cn.xinil.domain.Blog;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest_12 {

    @Test
    public void Test_12(){  //使用choose  when   otherwise
        SqlSession session = null;
        try {
            session = SqlSessionUtil.getSqlSession();
            IBlogMapper mapper = session.getMapper(IBlogMapper.class);
//            List<Blog> list =  mapper.findBlogUseChoose("xinil", null);  //按author
//            List<Blog> list =  mapper.findBlogUseChoose("xinil", "第一篇博客");//按author
            List<Blog> list =  mapper.findBlogUseChoose(null, "第一篇博客");//按title

            for(Blog b : list){
                System.out.println(b);
            }
        }finally {
            session.close();
        }

    }
}
