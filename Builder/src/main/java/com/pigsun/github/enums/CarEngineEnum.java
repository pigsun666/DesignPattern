package com.pigsun.github.enums;

/**
 * @author pigsun
 */

public enum CarEngineEnum {

    GENERAL(1.5,"L"),PERFORMANCE(2.0,"T");

    private double column;

    private String pl;

    CarEngineEnum(double num,String pl) {
        this.column = num;
        this.pl = pl;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }
}
