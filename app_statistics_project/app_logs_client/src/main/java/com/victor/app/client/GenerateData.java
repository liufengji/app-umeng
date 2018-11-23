package com.victor.app.client;

import com.victor.app.common.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author liufengji
 */
public class GenerateData {

    /**
     * // 0 创建随机数对象
     */
    public static Random random = new Random();

    /**
     * 1、准备基类log的属性值
     * 1.1、功能属性值
     * 日志创建时间
     */
    public static Long[] createdAtMsS = initCreatedAtMs();
    /**
     * 应用唯一标识
     */
    public static String appId = "sdk34734";
    /**
     * 租户唯一标识,企业用户
     */
    public static String[] tenantIds = {"cake"};
    /**
     * 设备唯一标识
     */
    public static String[] deviceIds = initDeviceId();
    /**
     * 版本
     */
    public static String[] appVersions = {"3.2.1", "3.2.2"};
    /**
     * 渠道,安装时就在清单中制定了，appStore等。
     */
    public static String[] appChannels = {"youmeng1", "youmeng2"};
    /**
     * 平台
     */
    public static String[] appPlatforms = {"android", "ios"};
    /**
     * 操作系统
     */
    public static String[] osTypes = {"8.3", "7.1.1"};
    /**
     * 机型
     */
    public static String[] deviceStyles = {"iPhone 6", "iPhone 6 Plus", "红米手机1s"};

    /**
     * 初始化设备id
     */
    public static String[] initDeviceId() {

        String base = "device22";
        String[] result = new String[100];

        for (int i = 0; i < 100; i++) {
            result[i] = base + i + "";
        }

        return result;
    }

    /**
     * 1.1.2 初始化创建时间
     * @return
     */
    public static Long[] initCreatedAtMs() {

        Long createdAtMs = System.currentTimeMillis();
        Long[] result = new Long[11];

        for (int i = 0; i < 10; i++) {
            result[i] = createdAtMs - (long) (i * 24 * 3600 * 1000);
        }

        result[10] = createdAtMs;

        return result;
    }

    /**
     * 1.2 启动日志属性值
     * //国家，终端不用上报，服务器自动填充该属性
     */
    public static String[] countrys = {"America", "china"};
    /**
     * //省份，终端不用上报，服务器自动填充该属性
     */
    public static String[] provinces = {"Washington", "jiangxi", "beijing"};
    /**
     * //网络
     */
    public static String[] networks = {"WiFi", "CellNetwork"};
    /**
     * //运营商
     */
    public static String[] carriers = {"中国移动", "中国电信", "EE"};
    /**
     * //品牌
     */
    public static String[] brands = {"三星", "华为", "Apple", "魅族", "小米", "锤子"};
    /**
     * //分辨率
     */
    public static String[] screenSizes = {"1136*640", "960*640", "480*320"};


    /**
     * // 1.3 事件日志属性值
     * //事件唯一标识
     */
    public static String[] eventIds = {"popMenu", "autoImport", "BookStore"};
    /**
     * //事件持续时长
     */
    public static Long[] eventDurationSecsS = {new Long(25), new Long(67), new Long(45)};
    static Map<String, String> map1 = new HashMap<String, String>() {
        {
            put("testparam1key", "testparam1value");
            put("testparam2key", "testparam2value");
        }
    };

    static Map<String, String> map2 = new HashMap<String, String>() {
        {
            put("testparam3key", "testparam3value");
            put("testparam4key", "testparam4value");
        }
    };

    /**
     * //参数名/值对
     */
    public static Map[] paramKeyValueMapsS = {map1, map2};



    /**
     * // 1.4 使用时长日志属性值
     * //单次使用时长(秒数),指一次启动内应用在前台的持续时长
     */
    public static Long[] singleUseDurationSecsS = initSingleUseDurationSecs();



    /**
     *  // 1.4.1 单次使用时长
     * @return
     */
    public static Long[] initSingleUseDurationSecs() {

        Long[] result = new Long[200];

        for (int i = 1; i < 200; i++) {
            result[i] = (long) random.nextInt(200);
        }

        return result;
    }


    /**
     * // 1.5 错误日志属性值
     *  //错误摘要
     */
    public static String[] errorBriefs = {"at cn.lift.dfdf.web.AbstractBaseController.validInbound(AbstractBaseController.java:72)", "at cn.lift.appIn.control.CommandUtil.getInfo(CommandUtil.java:67)"};
    /**
     * //错误详情
     */
    public static String[] errorDetails = {"java.lang.NullPointerException\\n    " + "at cn.lift.appIn.web.AbstractBaseController.validInbound(AbstractBaseController.java:72)\\n " + "at cn.lift.dfdf.web.AbstractBaseController.validInbound", "at cn.lift.dfdfdf.control.CommandUtil.getInfo(CommandUtil.java:67)\\n " + "at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\\n" + " at java.lang.reflect.Method.invoke(Method.java:606)\\n"};


    /**
     * // 1.6 页面使用情况日志属性值
     * //页面id
     */
    public static String[] pageIds = {"list.html", "main.html", "test.html"};
    /**
     * //访问顺序号，0为第一个页面
     */
    public static int[] visitIndexs = {0, 1, 2, 3, 4};
    /**
     * //下一个访问页面，如为空则表示为退出应用的页面
     */
    public static String[] nextPages = {"list.html", "main.html", "test.html", null};
    /**
     * //当前页面停留时长
     */
    public static Long[] stayDurationSecsS = {new Long(45), new Long(2), new Long(78)};


    /**
     *    2 初始化五类log的数据
     *    启动相关信息的数组
     */
    public static AppStartupLog[] appStartupLogs = initAppStartupLogs();
    /**
     * //页面跳转相关信息的数组
     */
    public static AppPageLog[] appPageLogs = initAppPageLogs();
    /**
     * //事件相关信息的数组
     */
    public static AppEventLog[] appEventLogs = initAppEventLogs();
    /**
     * //app使用情况相关信息的数组
     */
    public static AppUsageLog[] appUsageLogs = initAppUsageLogs();
    /**
     * //错误相关信息的数组
     */
    public static AppErrorLog[] appErrorLogs = initAppErrorLogs();

    /**
     * / 2.1 初始化每类log的公共属性值
     * @param baselog
     */
    public static void initLogCommon(AppBaseLog baselog){
        // 日志创建时间
        baselog.setCreatedAtMs(System.currentTimeMillis());
        // appid
        baselog.setAppId(appId);
        // 租户唯一标识,企业用户
        String tenantId = tenantIds[random.nextInt(tenantIds.length)];
        if (tenantId != null) {
            baselog.setTenantId(tenantId);
        }
        baselog.setTenantId(tenantIds[random.nextInt(tenantIds.length)]);
        // 设备唯一标识
        baselog.setDeviceId(deviceIds[random.nextInt(deviceIds.length)]);
        // 版本
        baselog.setAppVersion(appVersions[random.nextInt(appVersions.length)]);
        // 渠道
        baselog.setAppChannel(appChannels[random.nextInt(appChannels.length)]);
        // 平台
        baselog.setAppPlatform(appPlatforms[random.nextInt(appPlatforms.length)]);
        // 操作系统
        baselog.setOsType(osTypes[random.nextInt(osTypes.length)]);
        // 机型
        baselog.setDeviceStyle(deviceStyles[random.nextInt(deviceStyles.length)]);
    }

    /**
     *  // 2.2 启动相关信息的数组
     * @return
     */
    public static AppStartupLog[] initAppStartupLogs() {

        AppStartupLog[] result = new AppStartupLog[10];

        for (int i = 0; i < 10; i++) {

            AppStartupLog appStartupLog = new AppStartupLog();

            // 初始化公共屬性值
            initLogCommon(appStartupLog);
            //国家
            appStartupLog.setCountry(countrys[random.nextInt(countrys.length)]);
            //省份
            appStartupLog.setProvince(provinces[random.nextInt(provinces.length)]);
            //网络
            appStartupLog.setNetwork(networks[random.nextInt(networks.length)]);
            //运营商
            appStartupLog.setCarrier(carriers[random.nextInt(carriers.length)]);
            //品牌
            appStartupLog.setBrand(brands[random.nextInt(brands.length)]);
            //分辨率
            appStartupLog.setScreenSize(screenSizes[random.nextInt(screenSizes.length)]);

            result[i] = appStartupLog;
        }

        return result;
    }

    /**
     * // 2.3 页面跳转相关信息的数组
     * @return
     */
    public static AppPageLog[] initAppPageLogs() {

        AppPageLog[] result = new AppPageLog[10];

        for (int i = 0; i < 10; i++) {

            AppPageLog appPageLog = new AppPageLog();

            // 初始化公共屬性值
            initLogCommon(appPageLog);

            // 页面id
            String pageId = pageIds[random.nextInt(pageIds.length)];
            appPageLog.setPageId(pageId);

            // 访问頁面顺序号
            int visitIndex = visitIndexs[random.nextInt(visitIndexs.length)];
            appPageLog.setVisitIndex(visitIndex);

            // 下一个访问页面，如为空则表示为退出应用的页面
            String nextPage = nextPages[random.nextInt(nextPages.length)];
            while (pageId.equals(nextPage)) {
                nextPage = nextPages[random.nextInt(nextPages.length)];
            }
            appPageLog.setNextPage(nextPage);

            //当前页面停留时长
            Long stayDurationSecs = stayDurationSecsS[random.nextInt(stayDurationSecsS.length)];
            appPageLog.setStayDurationSecs(stayDurationSecs);

            result[i] = appPageLog;
        }

        return result;
    }

    /**
     * // 2.4 事件相关信息的数组
     * @return
     */
    public static AppEventLog[] initAppEventLogs() {

        AppEventLog[] result = new AppEventLog[10];

        for (int i = 0; i < 10; i++) {
            AppEventLog appEventLog = new AppEventLog();

            // 初始化公共屬性值
            initLogCommon(appEventLog);
            //事件唯一标识
            appEventLog.setEventId(eventIds[random.nextInt(eventIds.length)]);
            //事件持续时长
            appEventLog.setEventDurationSecs(eventDurationSecsS[random.nextInt(eventDurationSecsS.length)]);
            // 事件参数
            appEventLog.setParamKeyValueMap(paramKeyValueMapsS[random.nextInt(paramKeyValueMapsS.length)]);

            result[i] = appEventLog;
        }

        return result;
    }


    /**
     * // 2.5 app使用情况相关信息的数组
     * @return
     */
    public static AppUsageLog[] initAppUsageLogs() {

        AppUsageLog[] result = new AppUsageLog[10];

        for (int i = 0; i < 10; i++) {
            AppUsageLog appUsageLog = new AppUsageLog();

            // 初始化公共屬性值
            initLogCommon(appUsageLog);

            //单次使用时长(秒数),指一次启动内应用在前台的持续时长
            appUsageLog.setSingleUseDurationSecs(singleUseDurationSecsS[random.nextInt(singleUseDurationSecsS.length)]);

            result[i] = appUsageLog;
        }

        return result;
    }

    /**
     * // 2.6 错误相关信息的数组
     * @return
     */
    public static AppErrorLog[] initAppErrorLogs() {

        AppErrorLog[] result = new AppErrorLog[10];

        for (int i = 0; i < 10; i++) {
            AppErrorLog appErrorLog = new AppErrorLog();

            initLogCommon(appErrorLog);

            //错误摘要
            appErrorLog.setErrorBrief(errorBriefs[random.nextInt(errorBriefs.length)]);
            //错误详情
            appErrorLog.setErrorDetail(errorDetails[random.nextInt(errorDetails.length)]);

            result[i] = appErrorLog;
        }

        return result;
    }
}
