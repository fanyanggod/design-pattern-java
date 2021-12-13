package com.sherlock.designpattern.factory;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public interface AbstractFactory {
    String createLandTransport();
    String createWaterTransport();
}
