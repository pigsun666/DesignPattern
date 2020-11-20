package com.pigsun.github.model;

import com.pigsun.github.properties.CarColor;
import com.pigsun.github.properties.CarEngine;
import com.pigsun.github.properties.CarType;

/**
 * car 实体
 */
public class Car {

    private CarType carType;

    private CarColor carColor;

    private CarEngine carEngine;



    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }
}
