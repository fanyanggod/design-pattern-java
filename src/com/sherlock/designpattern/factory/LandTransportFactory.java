package com.sherlock.designpattern.factory;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public class LandTransportFactory implements AbstractFactory{

    @Override
    public String createLandTransport() {
        return null;
    }

    @Override
    public String createWaterTransport() {
        return null;
    }
}
