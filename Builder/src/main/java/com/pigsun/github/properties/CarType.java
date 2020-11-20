package com.pigsun.github.properties;

import com.pigsun.github.enums.CarTypeEnum;

/**
 * @author pigsun
 */
public class CarType {

    private String carType;

    public CarType(CarTypeEnum carTypeEnum) {
        this.carType = carTypeEnum.name();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
