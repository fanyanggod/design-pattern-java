package com.sherlock.designpattern.builder;

/**
 * @author sherlock
 * @date 2021/12/13
 *
 * ResourceConfig config = new ResourceConfig(name);
 * config.setMaxTotal = 8;
 * config.setMaxIdle = 8;
 * config.setMinIdle = 1;
 */
public class ResourcePoolConfig2 {
    /** max resource total */
    private static final int DEFAULT_MAX_TOTAL = 8;
    /** max idle resource total */
    private static final int DEFAULT_MAX_IDLE = 8;
    /** min idle resource total */
    private static final int DEFAULT_MIN_TOTAL = 0;
    /** resource name */
    private String name;

    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_TOTAL;

    public ResourcePoolConfig2(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty.");
        }
    }

    public void setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("maxTotal should be positive.");
        }
    }

    public void setMaxIdle(int maxIdle) {
        if (maxIdle <= 0) {
            throw new IllegalArgumentException("maxIdle should be positive.");
        }
        this.maxIdle = maxIdle;
    }

    public void setMinIdle(int minIdle) {
        if (minIdle <= 0) {
            throw new IllegalArgumentException("minIdle should be positive.");
        }
        this.minIdle = minIdle;
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
