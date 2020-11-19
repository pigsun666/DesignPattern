package com.pigsun.github.service.impl;

import com.pigsun.github.service.TransportService;


/**
 * @author pigsun
 */
public class Ship implements TransportService {

    public void transport() {
        System.out.println("黑珍珠号轮船启程了！！！！");
        ride();
    }

    public void ride() {
        System.out.println("穿上坐了1个人");
    }
}
