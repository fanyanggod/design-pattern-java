package com.sherlock.designpattern.create.builder;

/**
 * @author sherlock
 * @date 2021/12/13
 *
 * ResourcePoolConfig config = new ResourcePoolConfig.Builder()
 *          .setName()
 *          .setMaxTotal()
 *          .setMaxIdle()
 *          .setMinIdle()
 *          .build();
 */
public class ResourcePoolConfig3 {

    private String name;
    private int maxTotal ;
    private int maxIdle ;
    private int minIdle ;

    public ResourcePoolConfig3 (Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle= builder.maxIdle;
        this.minIdle = builder.minIdle;
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
