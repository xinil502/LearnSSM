package cn.xinil.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import javax.annotation.Resource;
import java.io.InputStream;

public class SqlSessionUtil { //SqlSession工具类
    private static SqlSessionFactory factory;
    static{
        InputStream is = Resource.class.getResourceAsStream("/SqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(is);
    }
    public static SqlSession getSqlSession(){
        return factory.openSession();
    }
}
