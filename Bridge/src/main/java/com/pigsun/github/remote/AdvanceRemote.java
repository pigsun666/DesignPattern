package com.pigsun.github.remote;

import com.pigsun.github.devices.Device;

/**
 * @author pigsun
 */
public class AdvanceRemote extends BasicRemote{

    public AdvanceRemote(Device device) {
        super.device = device;
    }

    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
