package com.sherlock.designpattern.create.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sherlock
 * @date 2021/12/10
 */
public class LoggerUnSafe {
    public static class Logger {
        private  FileWriter writer;
        public Logger(){
            File file = new File("log file path");
            try {
                writer = new FileWriter(file, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        private final Logger logger = new Logger();

        public void create() {
            logger.log("create user");
        }
    }

    public static class OrderController{
        private final Logger logger = new Logger();

        public void create() {
            logger.log("create Order");
        }
    }
}
