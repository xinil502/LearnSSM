package cn.xinil.test;

import cn.xinil.dao.IUserMapper;
import cn.xinil.domain.User;
import cn.xinil.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class MybatisTest_2 {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();

        IUserMapper mapper = session.getMapper(IUserMapper.class);

        User user = mapper.findById(4);
        System.out.println(user);
    }
}
