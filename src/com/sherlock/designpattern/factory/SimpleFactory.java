package com.sherlock.designpattern.factory;

/**
 * @author sherlock
 * @date 2021/12/13
 */
public class SimpleFactory {
    public static String createTransport(String product) {
        String transport = null;
        switch (product) {
            case "container":
                transport = "ship";
                break;
            case "box":
                transport = "car";
                break;
            default:
                break;
        }
        return transport;
    }
}
