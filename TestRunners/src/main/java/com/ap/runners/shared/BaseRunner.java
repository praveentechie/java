package com.ap.runners.shared;

public abstract class BaseRunner {
    protected enum LogLevel {
        DEBUG,
        ERROR,
        INFO,
        KEY,
        WARN
    }

    protected void writeLog(Object message, LogLevel logLevel) {
        String levelSymbol = LogLevel.KEY.toString().equals(logLevel.toString()) ? " ### " : "";
        System.out.println("[" + logLevel + "] " + levelSymbol + message.toString());
    }
}
