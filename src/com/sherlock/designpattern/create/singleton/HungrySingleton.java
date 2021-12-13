package com.sherlock.designpattern.create.singleton;

/**
 * @author sherlock
 * @date 2021/12/10
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
