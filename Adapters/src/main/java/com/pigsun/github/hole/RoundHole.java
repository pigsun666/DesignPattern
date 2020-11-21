package com.pigsun.github.hole;

import com.pigsun.github.peg.RoundPeg;

/**
 * 圆孔
 * @author pigsun
 */
public class RoundHole {
    /**
     * 半径
     */
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    /**
     * 判断圆钉能否放入当前的圆孔
     * @param peg
     * @return
     */
    public boolean fits(RoundPeg peg){
        if(peg == null ){
            return false;
        }
        boolean flag;
        flag = (this.getRadius() >= peg.getRadius());
        return flag;

    }

    public double getRadius() {
        return radius;
    }
}
