package com.sherlock.designpattern.create.factory;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public class CarTransportFactory implements FactoryMethodFactory{
    @Override
    public String createTransport() {
        return "car";
    }
}
