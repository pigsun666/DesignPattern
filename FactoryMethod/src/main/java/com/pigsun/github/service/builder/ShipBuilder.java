package com.pigsun.github.service.builder;

import com.pigsun.github.service.TransportService;
import com.pigsun.github.service.impl.Ship;

/**
 * @author pigsun
 */
public class ShipBuilder extends TransportBuilder{
    @Override
    public TransportService chooseTransport() {
        return new Ship();
    }
}
