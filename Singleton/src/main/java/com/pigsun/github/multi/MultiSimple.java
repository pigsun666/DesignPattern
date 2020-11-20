package com.pigsun.github.multi;

/**
 * 双重检验 解决线程不安全
 * @author pigsun
 */
public class MultiSimple {

    private static MultiSimple instance = null;

    private MultiSimple(){}

    public static MultiSimple getInstance(){
        if(instance == null ){
            synchronized (MultiSimple.class){
                if(instance == null){
                    instance = new MultiSimple();
                    return instance;
                }
            }
        }

        return instance;
    }
}
