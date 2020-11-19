package com.pigsun.github.product.details;

import com.pigsun.github.product.Table;

/**
 * 方桌
 * @author pigsun
 */
public class GeneralTable implements Table {

    public int hasLegs() {
        return 4;
    }

    public void sitOn() {
        System.out.println("坐上了普通大桌子!!!");
    }
}
