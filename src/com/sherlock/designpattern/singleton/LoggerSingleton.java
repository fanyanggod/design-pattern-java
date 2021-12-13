package com.sherlock.designpattern.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sherlock
 * @date 2021/12/10
 */
public class LoggerSingleton {
    public static class Logger {
        private  FileWriter writer;
        private static final Logger instance = new Logger();

        public Logger(){
            File file = new File("log file path");
            try {
                writer = new FileWriter(file, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static Logger getInstance(){
            return instance;
        }

        public void log(String message) {
            try {
                writer.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static class UserController{

        public void create() {
            Logger.getInstance().log("create user");
        }
    }

    public static class OrderController{

        public void create() {
            Logger.getInstance().log("create user");
        }
    }
}
