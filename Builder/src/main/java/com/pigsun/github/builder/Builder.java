package com.pigsun.github.builder;

import com.pigsun.github.enums.CarColorEnum;
import com.pigsun.github.enums.CarEngineEnum;
import com.pigsun.github.enums.CarTypeEnum;

/**
 * @author pigsun
 */
public interface Builder<T> {

    /**
     * 设置车类型
     * @param carType
     * @return
     */
    T carType(CarTypeEnum carType);

    /**
     * 设置车颜色
     * @param color
     * @return
     */
    T color(CarColorEnum color);

    /**
     * 设置引擎
     * @param engine
     * @return
     */
    T engine(CarEngineEnum engine);

}
