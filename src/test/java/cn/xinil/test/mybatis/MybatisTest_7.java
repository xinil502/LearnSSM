package cn.xinil.test.mybatis;

import cn.xinil.dao.IUserMapper;
import cn.xinil.domain.User;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest_7 {
    @Test
    public void test_7(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("startIndex", 3);
        map.put("pageSize", 6);
        List<User> users = mapper.getUserLimit(map);

        for(User user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }


}
