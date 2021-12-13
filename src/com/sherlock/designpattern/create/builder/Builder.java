package com.sherlock.designpattern.create.builder;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public class Builder {
    /** max resource total */
    private static final int DEFAULT_MAX_TOTAL = 8;
    /** max idle resource total */
    private static final int DEFAULT_MAX_IDLE = 8;
    /** min idle resource total */
    private static final int DEFAULT_MIN_TOTAL = 0;
    /** resource name */
    public String name;
    public int maxTotal = DEFAULT_MAX_TOTAL;
    public int maxIdle = DEFAULT_MAX_IDLE;
    public int minIdle = DEFAULT_MIN_TOTAL;

    public ResourcePoolConfig3 bulid() {
        if (isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        if (maxTotal < maxIdle ) {
            throw new IllegalArgumentException("...");
        }
        if (minIdle > maxTotal || minIdle> maxIdle) {
            throw new IllegalArgumentException("..");
        }
        return new ResourcePoolConfig3(this);
    }

    public Builder setName(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        this.name = name;
        return this;
    }

    public Builder setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("maxTotal should be positive.");
        }
        this.maxTotal= maxTotal;
        return this;
    }

    public Builder setMaxIdle(int maxIdle) {
        if (maxIdle <= 0) {
            throw new IllegalArgumentException("maxIdle should be positive.");
        }
        this.maxIdle = maxIdle;
        return this;
    }

    public Builder setMinIdle(int minIdle) {
        if (minIdle <= 0) {
            throw new IllegalArgumentException("minIdle should be positive.");
        }
        this.minIdle = minIdle;
        return this;
    }

    private static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
