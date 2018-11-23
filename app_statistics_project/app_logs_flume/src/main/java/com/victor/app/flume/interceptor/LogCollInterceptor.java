package com.victor.app.flume.interceptor;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author liufengji
 * 仿写 系统 TimestampInterceptor 类
 * 打成jar包 传输到 flume/lib 目录下
 */
public class LogCollInterceptor implements Interceptor {

    private final boolean preserveExisting;

    private LogCollInterceptor(boolean preserveExisting) {
        this.preserveExisting = preserveExisting;
    }

    @Override
    public void initialize() {

    }

    @Override
    public Event intercept(Event event) {

        // 1获取flume接收消息头
        Map<String, String> headers = event.getHeaders();

        // 2获取flume接收的json数据数组
        byte[] json = event.getBody();

        // 将json数组转换为字符串
        String jsonStr = new String(json);

        // pageLog
        String logType = "";
        if (jsonStr.contains("pageId")) {
            logType = "page";
        }
        // eventLog
        else if (jsonStr.contains("eventId")) {
            logType = "event";
        }
        // usageLog
        else if (jsonStr.contains("singleUseDurationSecs")) {
            logType = "usage";
        }
        // error
        else if (jsonStr.contains("errorBrief")) {
            logType = "error";
        }
        // startup
        else if (jsonStr.contains("network")) {
            logType = "startup";
        }

        // 3将日志类型存储到flume头中
        headers.put("logType", logType);

        return event;
    }

    @Override
    public List<Event> intercept(List<Event> events) {
        Iterator i$ = events.iterator();

        while (i$.hasNext()) {
            Event event = (Event) i$.next();
            this.intercept(event);
        }

        return events;
    }

    @Override
    public void close() {
    }

    public static class Constants {

        public static String TIMESTAMP = "timestamp";
        public static String PRESERVE = "preserveExisting";
        public static boolean PRESERVE_DFLT = false;

        public Constants() {
        }
    }

    public static class Builder implements org.apache.flume.interceptor.Interceptor.Builder {

        private boolean preserveExisting;

        public Builder() {
            this.preserveExisting = LogCollInterceptor.Constants.PRESERVE_DFLT;
        }

        @Override
        public Interceptor build() {
            return new LogCollInterceptor(this.preserveExisting);
        }

        @Override
        public void configure(Context context) {
            this.preserveExisting = context.getBoolean(LogCollInterceptor.Constants.PRESERVE, LogCollInterceptor.Constants.PRESERVE_DFLT).booleanValue();
        }
    }
}
