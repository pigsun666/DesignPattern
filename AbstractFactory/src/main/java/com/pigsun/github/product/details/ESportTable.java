package com.pigsun.github.product.details;

import com.pigsun.github.product.Table;

/**
 * 电竞桌
 * @author pigsun
 */
public class ESportTable implements Table {

    public int hasLegs() {
        return 4;
    }

    public void sitOn() {
        System.out.println("电竞桌子我也不知道是什么鬼!");
    }
}
