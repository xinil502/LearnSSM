package cn.xinil.test;

import cn.xinil.dao.IUserMapper;
import cn.xinil.domain.User;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest_3 { //添加用户数据

    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);

        User user = new User(0, 12347651, "张四", 21, "男", "陕西", "软件1904班");
        int re = mapper.addUser(user);
        if(re == 1){
            System.out.println("插入成功");
            sqlSession.commit();  //提交事务
        }else{
            System.out.println("插入失败");
        }
        sqlSession.close();
    }
}
