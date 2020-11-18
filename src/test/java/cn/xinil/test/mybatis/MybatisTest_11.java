package cn.xinil.test.mybatis;

import cn.xinil.dao.IBlogMapper;
import cn.xinil.domain.Blog;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest_11{
    @Test
    public void test(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        IBlogMapper mapper = session.getMapper(IBlogMapper.class);
        List<Blog> list =  mapper.findBlogUseIf("xinil", "第一篇博客");
        for(Blog b : list){
            System.out.println(b);
        }
    }
}
