package com.sherlock.designpattern.create.factory;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public class ShipTransportFactory implements FactoryMethodFactory{
    @Override
    public String createTransport() {
        return "ship";
    }
}
