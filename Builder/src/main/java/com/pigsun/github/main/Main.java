package com.pigsun.github.main;

import com.pigsun.github.builder.CarBuilder;
import com.pigsun.github.enums.CarColorEnum;
import com.pigsun.github.enums.CarEngineEnum;
import com.pigsun.github.enums.CarTypeEnum;
import com.pigsun.github.model.Car;

/**
 * @author pigsun
 */
public class Main {

    public static void main(String[] args) {
        Car car = new CarBuilder().carType(CarTypeEnum.SUV).color(CarColorEnum.RED).engine(CarEngineEnum.PERFORMANCE).getInstants();
        System.out.println(car);
    }
}
