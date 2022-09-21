//package com.example.pmTrial.layout;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.Layout;
//import org.slf4j.event.LoggingEvent;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class JsonLayoutConfig extends Layout{
//	 private final ObjectMapper om;
//	    private SimpleDateFormat dateFormat;
//	    
//	    public JsonLayoutConfig() {
//	        this.om = new ObjectMapper();
//	        this.om.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//	        this.dateFormat = new SimpleDateFormat(pattern);
//	    }
//	    public void activateOptions() {
//	    }
//
//	    public boolean ignoresThrowable() {
//	        return false;
//	    }
//
//	    @SuppressWarnings("unchecked")
//		public String format(LoggingEvent loggingEvent) {
//	        Date timestamp = new Date(loggingEvent.getTimeStamp());
//
//	        String stacktrace = null;
//
//	        if (loggingEvent.getThrowable() != null) {
//	            stacktrace = String.join("\n", (Iterable<? extends CharSequence>) loggingEvent.getThrowable());
//	        }
//
//	        LogItems li = new LogItems(
//	            this.dateFormat.format(timestamp),
//	            loggingEvent.getLevel().toString(),
//	            loggingEvent.getLoggerName(),
//	            loggingEvent.getThreadName(),
//	            loggingEvent.getMessage().toString(),
//	            stacktrace
//	        );
//
//	        String out;
//
//	        try {
//	            out = om.writeValueAsString(li);
//	        } catch (JsonProcessingException e) {
//	            return "JsonLayout - ERROR formatting log message\n";
//	        }
//
//	        return out + "\n";
//	    }
//
//	    public void setDatePattern(String pattern) {
//	        try {
//	            this.dateFormat = new SimpleDateFormat(pattern);
//	        } catch (Exception e) {
//	            this.dateFormat = new SimpleDateFormat(pattern);
//	        }
//	    }
//	}
