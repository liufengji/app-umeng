package com.victor.app.common;

import java.util.Map;

/**
 * @author liufengji
 */
public class AppEventLog extends AppBaseLog {

    /**
     * 事件唯一标识
     */
    private String eventId;
    /**
     * 事件持续时长
     */
    private Long eventDurationSecs;
    /**
     * //参数名/值对
     */
    private Map<String,String> paramKeyValueMap;


    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Long getEventDurationSecs() {
        return eventDurationSecs;
    }

    public void setEventDurationSecs(Long eventDurationSecs) {
        this.eventDurationSecs = eventDurationSecs;
    }

    public Map<String, String> getParamKeyValueMap() {
        return paramKeyValueMap;
    }

    public void setParamKeyValueMap(Map<String, String> paramKeyValueMap) {
        this.paramKeyValueMap = paramKeyValueMap;
    }
}
