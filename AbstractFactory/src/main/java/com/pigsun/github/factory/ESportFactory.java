package com.pigsun.github.factory;

import com.pigsun.github.product.Chair;
import com.pigsun.github.product.Table;
import com.pigsun.github.product.details.ESportChair;
import com.pigsun.github.product.details.ESportTable;

/**
 * @author pigsun
 */
public class ESportFactory implements AbstractFactory{

    public Chair createChair() {
        return new ESportChair();
    }

    public Table createTable() {
        return new ESportTable();
    }
}
