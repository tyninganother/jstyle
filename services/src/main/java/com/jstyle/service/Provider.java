package com.jstyle.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author haining
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("****************************start");
        System.in.read(); // 按任意键退出
    }
}