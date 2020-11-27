package com.pigsun.github.remote;

/**
 * @author pigsun
 */
public interface Remote {
    /**
     * 开关
     */
    void power();

    /**
     * 调低音量
     */
    void volumeDown();

    /**
     * 调高音量
     */
    void volumeUp();

    /**
     * 频道-1
     */
    void channelDown();

    /**
     * 频道+1
     */
    void channelUp();
}
