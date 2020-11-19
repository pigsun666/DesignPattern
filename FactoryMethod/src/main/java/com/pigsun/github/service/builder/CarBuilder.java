package com.pigsun.github.service.builder;

import com.pigsun.github.service.TransportService;
import com.pigsun.github.service.impl.Car;

/**
 * @author pigsun
 */
public class CarBuilder extends TransportBuilder{
    @Override
    public TransportService chooseTransport() {
        Car car = new Car();
        return car;
    }
}
