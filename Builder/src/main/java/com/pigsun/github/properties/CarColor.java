package com.pigsun.github.properties;

import com.pigsun.github.enums.CarColorEnum;

/**
 * @author pigsun
 */
public class CarColor {

    private String carColor;

    public CarColor(CarColorEnum enums) {
        this.carColor = enums.name();
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
