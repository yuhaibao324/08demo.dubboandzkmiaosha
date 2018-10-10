package com.geekq.miaosha.service;

import com.geekq.miaosha.api.DemoService;

/**
 * Created by qiurunze on 2018/10/10.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello " + name ;
    }
}
