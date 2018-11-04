package com.aiwen.wfgwechat.controller;

import com.aiwen.wfgwechat.entity.Test;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.Page;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/page")
    @ResponseBody
    public ResultMessage test(Page page){
        ResultMessage rm = new ResultMessage();
        try {
            Iterable all = testService.findAll();
            rm.setData(all);
        }catch (Exception e){
            rm.setData("ok");
            rm.setStatus(Constant.STATUS_500);
            rm.setSuccess(Constant.FALSE);
            e.printStackTrace();
        }
        return rm;
    }
    @RequestMapping("/web")
    public String webtest(){
        return "404";
    }
    @RequestMapping("/save")
    @ResponseBody
    public ResultMessage save(Test test){
        ResultMessage rm = new ResultMessage();
        try{
            testService.save(test);
        }catch (Exception e){
            rm.setStatus(Constant.STATUS_500);
            rm.setSuccess(Constant.FALSE);
            e.printStackTrace();
        }
        return rm;
    }

}
