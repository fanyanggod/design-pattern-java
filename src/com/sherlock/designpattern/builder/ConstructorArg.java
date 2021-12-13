package com.sherlock.designpattern.builder;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    public ConstructorArg(ConstructorArgBuilder builder) {
        this.isRef = builder.isRef;
        this.type= builder.type;
        this.arg= builder.arg;
    }
}
