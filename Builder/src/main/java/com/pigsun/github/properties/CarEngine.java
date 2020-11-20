package com.pigsun.github.properties;

import com.pigsun.github.enums.CarEngineEnum;

/**
 * @author pigsun
 */
public class CarEngine {

    private double num;
    private String pl;

    public CarEngine(CarEngineEnum enums) {
        this.num = enums.getColumn();
        this.pl = enums.getPl();
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }
}
