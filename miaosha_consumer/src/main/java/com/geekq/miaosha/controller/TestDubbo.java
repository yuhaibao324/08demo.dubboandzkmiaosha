package com.geekq.miaosha.controller;

import com.alibaba.dubbo.common.json.JSON;
import com.geekq.miaosha.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qiurunze on 2018/10/10.
 */
@RequestMapping("/test")
@Controller
public class TestDubbo {

    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/demo", produces = "application/json; charset=UTF-8")
    public String getTestInfo() {
        System.out.println("===================");
        demoService.sayHello("i am say hello !");
        return "hello  world !" ;
    }
}
