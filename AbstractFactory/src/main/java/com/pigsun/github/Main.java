package com.pigsun.github;

import com.pigsun.github.constant.Constant;
import com.pigsun.github.factory.AbstractFactory;
import com.pigsun.github.factory.ESportFactory;
import com.pigsun.github.factory.GeneralFactory;

/**
 * main
 * @author pigsun
 */
public class Main {


    static AbstractFactory factory;


    public static void main(String[] args) {
        configuration("周健");
        doGame();
    }

    private static void doGame() {
        factory.createChair().sitOn();
        factory.createTable().sitOn();
    }

    private static void configuration(String name){
        if(Constant.ZJ.equals(name)){
            factory = new GeneralFactory();
        }else if(Constant.LXH.equals(name)){
            factory = new ESportFactory();
        }
    }
}
