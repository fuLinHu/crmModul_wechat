package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.Test;
import com.aiwen.wfgwechat.publicmodules.Entity.Page;

public interface TestService {
    public Iterable findAll();
    public void save(Test test);

}
