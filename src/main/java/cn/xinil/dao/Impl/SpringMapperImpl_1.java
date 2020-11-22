package cn.xinil.dao.Impl;

import cn.xinil.dao.ISpringMapper;
import cn.xinil.domain.Spring;

import java.util.ArrayList;
import java.util.List;

public class SpringMapperImpl_1 implements ISpringMapper {
    @Override
    public List<Spring> findAllSpring() {
        List<Spring> list = new ArrayList<>();
        Spring spring = new Spring();
        spring.setSpring("Impl_1");
        list.add(spring);
        return list;
    }
}
