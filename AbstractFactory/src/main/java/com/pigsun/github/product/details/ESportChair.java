package com.pigsun.github.product.details;

import com.pigsun.github.product.Chair;

/**
 * @author pigsun
 * 电竞椅
 */
public class ESportChair implements Chair {

    /**
     * 滑轮 没脚
     * @return
     */
    public int hasLegs() {
        return 0;
    }

    /**
     * 坐上去
     */
    public void sitOn() {
        System.out.println("迪瑞克斯电竞椅！！！");
    }
}
