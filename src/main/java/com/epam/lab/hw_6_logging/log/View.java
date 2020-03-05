package com.epam.lab.hw_6_logging.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class View {
    private static final Logger logger1 = LogManager.getLogger(View.class);

    public void logView() {
        logger1.trace("This is a trace message");
        logger1.debug("This is a debug message");
        logger1.info("This is an info message");
        logger1.warn("This is a warn message");
        logger1.fatal("This is a fatal message");
        logger1.error("This is an error message");
    }
}
