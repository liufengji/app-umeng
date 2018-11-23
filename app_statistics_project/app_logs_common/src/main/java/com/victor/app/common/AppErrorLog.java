package com.victor.app.common;

/**
 * @author liufengji
 */
public class AppErrorLog extends AppBaseLog {

    /**
     * 错误摘要
     */
    private String errorBrief;
    /**
     * 错误详情
     */
    private String errorDetail;

    public String getErrorBrief() {
        return errorBrief;
    }

    public void setErrorBrief(String errorBrief) {
        this.errorBrief = errorBrief;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
