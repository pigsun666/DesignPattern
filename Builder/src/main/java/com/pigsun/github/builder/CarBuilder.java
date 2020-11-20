package com.pigsun.github.builder;

import com.pigsun.github.enums.CarColorEnum;
import com.pigsun.github.enums.CarEngineEnum;
import com.pigsun.github.enums.CarTypeEnum;
import com.pigsun.github.model.Car;
import com.pigsun.github.properties.CarColor;
import com.pigsun.github.properties.CarEngine;
import com.pigsun.github.properties.CarType;

/**
 * @author pigsun
 */
public class CarBuilder implements Builder<CarBuilder>{

    private Car car;

    public CarBuilder carType(CarTypeEnum carType) {
        if(car == null){
            car = new Car();
        }
        car.setCarType(new CarType(carType));
        return this;
    }

    public CarBuilder color(CarColorEnum color) {
        if(car == null){
            car = new Car();
        }
        car.setCarColor(new CarColor(color));
        return this;
    }

    public CarBuilder engine(CarEngineEnum engine) {
        if(car == null){
            car = new Car();
        }
        car.setCarEngine(new CarEngine(engine));
        return this;
    }

    public Car getInstants(){
        return car;
    }

}
