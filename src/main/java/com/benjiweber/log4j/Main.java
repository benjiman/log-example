package com.benjiweber.log4j;

import org.apache.logging.log4j.LogManager;

public class Main {

    public static void main(String... args) {
        var log = LogManager.getRootLogger();
        log.info("Hello World");
    }
}
