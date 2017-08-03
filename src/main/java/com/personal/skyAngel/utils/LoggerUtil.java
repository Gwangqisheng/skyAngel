package com.personal.skyAngel.utils;

import java.util.Date;

import org.apache.log4j.Logger;

public class LoggerUtil {
    private static boolean isLog = true;
    private static Logger logger;

    public static void setLogger(boolean isLog) {
        LoggerUtil.isLog = isLog;
    }

    public static void setLog(Logger logger) {
        LoggerUtil.logger = logger;
    }

    public static void debug(Object msg) {
        if (isLog) {
            logger.debug(new Date() + " " + msg);
        }
    }

    public static void info(Object msg) {
        if (isLog) {
            logger.info(new Date() + " " + msg);
        }
    }

    public static void warn(Object msg) {
        if (isLog) {
            logger.warn(msg);
        }
    }

    public static void error(Object msg) {
        if (isLog) {
            logger.error(msg);
        }
    }

    public static void fatal(Object msg) {
        if (isLog) {
            logger.fatal(msg);
        }
    }

}
