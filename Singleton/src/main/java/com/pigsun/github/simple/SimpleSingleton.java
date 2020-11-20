package com.pigsun.github.simple;

/**
 * 简单版本 单例模式
 * @author pigsun
 */
public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    private SimpleSingleton(){}

    public static SimpleSingleton getInstants(){
        if(instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
