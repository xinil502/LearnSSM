package cn.xinil.test.mybatis;

import cn.xinil.dao.IBlogMapper;
import cn.xinil.domain.Blog;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MybatisTest_14 {   //foreach测试

    @Test
    public void test(){
        SqlSession session = null;
        try {
            session = SqlSessionUtil.getSqlSession();
            IBlogMapper mapper = session.getMapper(IBlogMapper.class);
            List<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(3);
            list.add(4);
            List<Blog> blogs = mapper.findBlogUseForeachById(list);
            for(Blog b: blogs){
                System.out.println(b);
            }
        }finally {
            session.close();
        }
    }
}
