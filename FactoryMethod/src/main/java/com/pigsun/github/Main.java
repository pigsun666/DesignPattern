package com.pigsun.github;

import com.pigsun.github.constant.Constant;
import com.pigsun.github.service.builder.CarBuilder;
import com.pigsun.github.service.builder.ShipBuilder;
import com.pigsun.github.service.builder.TransportBuilder;

/**
 * @author pigsun
 */
public class Main {

    private static TransportBuilder transportBuilder;


    public static void main(String[] args) {
        configuration("周健");
        runLogic();
    }

    private static void runLogic() {
        if(transportBuilder != null){
            transportBuilder.goToChangSha();
        }
    }

    private static void configuration(String name){
        if(Constant.ZJ.equals(name)){
            transportBuilder = new CarBuilder();
        }else if(Constant.LXH.equals(name)){
            transportBuilder = new ShipBuilder();
        }
    }
}
