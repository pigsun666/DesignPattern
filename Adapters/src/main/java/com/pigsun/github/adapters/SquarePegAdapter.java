package com.pigsun.github.adapters;

import com.pigsun.github.peg.RoundPeg;
import com.pigsun.github.peg.SquarePeg;

/**
 * 方钉适配器  方钉可以通过该适配器 适配圆孔
 * @author pigsun
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
