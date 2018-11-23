package com.victor.app.common;

/**
 * AppLog实体类
 * 内部含有各种日志时间的集合。
 * @author liufengji
 */
public class AppLogEntity extends AppBaseLog{

    /**
     * //启动相关信息的数组
     */
    private AppStartupLog[] appStartupLogs;
    /**
     * //页面跳转相关信息的数组
     */
    private AppPageLog[] appPageLogs;
    /**
     * //事件相关信息的数组
     */
    private AppEventLog[] appEventLogs;
    /**
     * //app使用情况相关信息的数组
     */
    private AppUsageLog[] appUsageLogs;
    /**
     * //错误相关信息的数组
     */
    private AppErrorLog[] appErrorLogs;

    public AppStartupLog[] getAppStartupLogs() {
        return appStartupLogs;
    }

    public void setAppStartupLogs(AppStartupLog[] appStartupLogs) {
        this.appStartupLogs = appStartupLogs;
    }

    public AppPageLog[] getAppPageLogs() {
        return appPageLogs;
    }

    public void setAppPageLogs(AppPageLog[] appPageLogs) {
        this.appPageLogs = appPageLogs;
    }

    public AppEventLog[] getAppEventLogs() {
        return appEventLogs;
    }

    public void setAppEventLogs(AppEventLog[] appEventLogs) {
        this.appEventLogs = appEventLogs;
    }

    public AppUsageLog[] getAppUsageLogs() {
        return appUsageLogs;
    }

    public void setAppUsageLogs(AppUsageLog[] appUsageLogs) {
        this.appUsageLogs = appUsageLogs;
    }

    public AppErrorLog[] getAppErrorLogs() {
        return appErrorLogs;
    }

    public void setAppErrorLogs(AppErrorLog[] appErrorLogs) {
        this.appErrorLogs = appErrorLogs;
    }
}
