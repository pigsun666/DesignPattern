package com.pigsun.github.remote;

import com.pigsun.github.devices.Device;

/**
 * @author pigsun
 */
public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    /**
     * 关机-》开机
     * 开机-》关机
     */
    public void power() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    /**
     * 音量-1
     */
    public void volumeDown() {
        device.setVolume(device.getVolume()-1);
    }

    /**
     * 音量+1
     */
    public void volumeUp() {
        device.setVolume(device.getVolume()+1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() -1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
