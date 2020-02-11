package com.epam.lab.hw_6_logging.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class View2 {
    private static final Logger log = LogManager.getLogger(View2.class);

    public void view() {
        log.trace("This is a trace message");
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.fatal("This is a fatal message");
        log.error("This is an error message");
    }
}
