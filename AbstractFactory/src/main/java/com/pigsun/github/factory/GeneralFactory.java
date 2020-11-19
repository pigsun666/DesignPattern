package com.pigsun.github.factory;

import com.pigsun.github.product.Chair;
import com.pigsun.github.product.Table;
import com.pigsun.github.product.details.GeneralChar;
import com.pigsun.github.product.details.GeneralTable;

/**
 * @author pigsun
 */
public class GeneralFactory  implements AbstractFactory{
    public Chair createChair() {
        return new GeneralChar();
    }

    public Table createTable() {
        return new GeneralTable();
    }
}
