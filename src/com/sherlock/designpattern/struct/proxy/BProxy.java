package com.sherlock.designpattern.struct.proxy;

/**
 * @author sherlock
 * @date 2021/12/14
 */
public class BProxy extends B{
    @Override
    public void login() {
        //非业务代码
        //...
        //业务代码
        super.login();
    }
}
