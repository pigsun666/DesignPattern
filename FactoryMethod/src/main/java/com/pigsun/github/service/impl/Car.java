package com.pigsun.github.service.impl;

import com.pigsun.github.service.TransportService;

/**
 * @author pigsun
 */
public class Car implements TransportService {
    public void transport() {
        System.out.println("小轿车出发了！！！");
        ride();
    }

    public void ride() {
        System.out.println("小轿车坐着健哥!");
    }
}
