package com.geekq.miaosha;

import com.geekq.miaosha.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by qiurunze on 2018/10/10.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("哈哈哈"));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
