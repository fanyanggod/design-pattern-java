package com.sherlock.designpattern.struct.proxy;

/**
 * @author sherlock
 * @date 2021/12/14
 */
public class AProxy implements IA{
    private A a;

    public AProxy(A a) {
        this.a = a;
    }

    @Override
    public void login() {
        //非业务代码
        //.....
        //委托
        a.login();
    }
}
