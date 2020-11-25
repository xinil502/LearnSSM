package cn.xinil.test.aop_1;

public class UserServiceImpl implements IUserService {
    @Override
    public int insert() {
        System.out.println("增加了一个用户");
        return 1;
    }

    @Override
    public int delete() {
        System.out.println("删除了一个用户");
        return 2;
    }

    @Override
    public int update() {
        System.out.println("修改了一个用户");
        return 3;
    }

    @Override
    public int select() {
        System.out.println("查找了一个用户");
        return 4;
    }
}
