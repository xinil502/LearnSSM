package cn.xinil.dao;

import cn.xinil.domain.User;
import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 通过班级查找学生
     * @param uclass
     * @return
     */
    List<User> findByUClass(String uclass);
}
