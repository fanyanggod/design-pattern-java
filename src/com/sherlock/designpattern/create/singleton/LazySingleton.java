package com.sherlock.designpattern.create.singleton;

/**
 * @author sherlock
 * @date 2021/12/10
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    private static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
