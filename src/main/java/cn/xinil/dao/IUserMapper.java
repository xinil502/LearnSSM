package cn.xinil.dao;

import cn.xinil.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

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

    /**
     * 添加一个用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 修改用户的信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除一个用户
     * @param id
     * @return
     */
    int deleteUser(int id);

    /**
     * 模糊查询用户数据
     * @return
     */
    List<User> findUserLike(String value);

    /**
     * 进行分页查询
     * @param map
     * @return
     */
    List<User> getUserLimit(Map<String,Object> map);
}
