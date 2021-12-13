package com.sherlock.designpattern.create.singleton;

/**
 * @author sherlock
 * @date 2021/12/10
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    private static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
