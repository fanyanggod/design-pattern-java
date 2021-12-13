package com.sherlock.designpattern.create.singleton;

/**
 * @author sherlock
 * @date 2021/12/10
 */
public enum EnumSingleton {
    //实例
    INSTANCE;

    public void log() {
        System.out.println("log");
    }
}
