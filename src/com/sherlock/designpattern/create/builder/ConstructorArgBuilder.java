package com.sherlock.designpattern.create.builder;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public class ConstructorArgBuilder {
    public boolean isRef;
    public Class type;
    public Object arg;

    public ConstructorArg build() {
        if (isRef) {
            if (!(arg instanceof String)) {
                throw new IllegalArgumentException("arg should be String");
            }
            type = null;
        }else {
            if (!(arg instanceof String) || type == null) {
                throw new IllegalArgumentException("...");
            }
        }
        return new ConstructorArg(this);
    }

    public ConstructorArgBuilder setIsRef(boolean isRef) {
        this.isRef = isRef;
        return this;
    }

    public ConstructorArgBuilder setType(Class type) {
        this.type= type;
        return this;
    }

    public ConstructorArgBuilder setArg(Object arg) {
        this.arg = arg;
        return this;
    }
}
