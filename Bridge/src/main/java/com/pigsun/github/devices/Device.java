package com.pigsun.github.devices;


/**
 * @author longxinhai
 */
public interface Device {
    /**
     * 是否启用
     * @return
     */
    boolean isEnabled();

    /**
     * 启用
     */
    void enable();

    /**
     * 关闭
     */
    void disable();

    /**
     * 获取音量
     * @return
     */
    int getVolume();

    /**
     * 设置音量
     * @param percent
     */
    void setVolume(int percent);

    /**
     * 获取频道
     * @return
     */
    int getChannel();

    /**
     * 设置频道
     * @param channel
     */
    void setChannel(int channel);

    /**
     * 打印当前状态
     */
    void printStatus();
}
