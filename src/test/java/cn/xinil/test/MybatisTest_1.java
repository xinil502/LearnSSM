package cn.xinil.test;

import cn.xinil.dao.IUserMapper;
import cn.xinil.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

public class MybatisTest_1 {
    public static void main(String[] args) throws Exception{
        //1.读取配置文件
        InputStream inputStream = Resource.class.getResourceAsStream("/SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);

        //3，使用工厂生产一个SqlSession对象
        SqlSession session = factory.openSession();

        //4.使用SqlSession创建Dao接口的动态代理对象。
        IUserMapper userMapper = session.getMapper(IUserMapper.class);

        //5.使用代理对象执行方法。
        List<User> users = userMapper.findAll();
        for(User u: users){
            System.out.println(u);
        }

        //6.释放资源。
        session.close();
        inputStream.close();
    }
}
