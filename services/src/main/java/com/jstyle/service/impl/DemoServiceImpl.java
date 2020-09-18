package com.jstyle.service.impl;
import com.jstyle.service.DemoService;
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hi, " + name;
    }
}
