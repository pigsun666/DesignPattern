package com.pigsun.github.product.details;

import com.pigsun.github.product.Chair;

/**
 * 普通椅子
 * @author pigsun
 */
public class GeneralChar implements Chair {
    /**
     * 4条腿
     * @return
     */
    public int hasLegs() {
        return 4;
    }

    /**
     * 坐
     */
    public void sitOn() {
        System.out.println("坐上了普通的椅子!!!");
    }
}
