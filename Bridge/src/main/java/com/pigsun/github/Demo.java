package com.pigsun.github;

import com.pigsun.github.devices.Device;
import com.pigsun.github.devices.Radio;
import com.pigsun.github.devices.TV;
import com.pigsun.github.remote.AdvanceRemote;
import com.pigsun.github.remote.BasicRemote;

import java.util.ArrayList;

/**
 * @author pigsun
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvanceRemote advancedRemote = new AdvanceRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
