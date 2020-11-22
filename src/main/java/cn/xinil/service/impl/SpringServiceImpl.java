package cn.xinil.service.impl;

import cn.xinil.dao.ISpringMapper;
import cn.xinil.domain.Spring;
import cn.xinil.service.ISpringService;

import java.util.List;

public class SpringServiceImpl implements ISpringService {
    ISpringMapper springMapper;

    public ISpringMapper getSpringMapper() {
        return springMapper;
    }

    public void setSpringMapper(ISpringMapper springMapper) {
        this.springMapper = springMapper;
    }

    @Override
    public List<Spring> findAllSpring() {
        return springMapper.findAllSpring();
    }
}
