package com.training.demo;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.event.LoggingEvent;
import org.springframework.boot.logging.structured.StructuredLogFormatter;

public class MyLoggingFormat implements StructuredLogFormatter<LoggingEvent> {
    @Override
    public String format(LoggingEvent event) {
        return event.getTimeStamp() + event.getMessage();
    }
}
