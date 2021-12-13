package com.sherlock.designpattern.singleton;

/**
 * @author sherlock
 * @date 2021/12/10
 */
public class StaticInternalSingleton {
    private StaticInternalSingleton() {
    }

    private static class SingletonHolder{
        private static final StaticInternalSingleton instance = new StaticInternalSingleton();
    }

    public static StaticInternalSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
