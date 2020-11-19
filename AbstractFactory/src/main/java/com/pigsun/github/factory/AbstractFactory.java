package com.pigsun.github.factory;

import com.pigsun.github.product.Chair;
import com.pigsun.github.product.Table;

/**
 * @author pigsun
 */
public interface AbstractFactory {

    /**
     * 创建椅子
     * @return
     */
    Chair createChair();

    /**
     * 创建桌子
     * @return
     */
    Table createTable();
}
