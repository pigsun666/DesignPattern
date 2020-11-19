package com.pigsun.github.service.builder;

import com.pigsun.github.service.TransportService;

/**
 * @author pigsun
 */
public abstract class TransportBuilder {

    public void goToChangSha(){
        TransportService transport = chooseTransport();
        transport.transport();
    }

    abstract TransportService chooseTransport();
}
