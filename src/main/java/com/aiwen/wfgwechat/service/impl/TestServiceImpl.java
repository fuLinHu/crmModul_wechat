package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.entity.Test;
import com.aiwen.wfgwechat.publicmodules.Entity.Page;
import com.aiwen.wfgwechat.dao.TestRepository;
import com.aiwen.wfgwechat.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testDao;

    @Override
    public Iterable findAll() {
        List<Test> all = testDao.findAll();
        return all;
    }

    @Override
    public void save(Test test) {
        testDao.save(test);
    }

}
