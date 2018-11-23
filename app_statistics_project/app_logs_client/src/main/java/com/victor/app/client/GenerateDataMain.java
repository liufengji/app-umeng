package com.victor.app.client;

import com.alibaba.fastjson.JSONObject;
import com.victor.app.common.*;

import static com.victor.app.client.GenerateData.*;

/**
 * @author liufengji
 */
public class GenerateDataMain {
    /**
     * 循环发送数据
     * @param args
     */
    public static void main(String[] args) {

        //发送数据
        for (int i = 1; i <= 200000000; i++) {

            AppLogEntity logEntity = new AppLogEntity();

            // 封装5种log数据
            logEntity.setAppStartupLogs(new AppStartupLog[]{appStartupLogs[random.nextInt(appStartupLogs.length)]});
            logEntity.setAppEventLogs(new AppEventLog[]{appEventLogs[random.nextInt(appEventLogs.length)]});
            logEntity.setAppErrorLogs(new AppErrorLog[]{appErrorLogs[random.nextInt(appErrorLogs.length)]});
            logEntity.setAppPageLogs(new AppPageLog[]{appPageLogs[random.nextInt(appPageLogs.length)]});
            logEntity.setAppUsageLogs(new AppUsageLog[]{appUsageLogs[random.nextInt(appUsageLogs.length)]});

            try {
                // 将对象转换成json string
                String json = JSONObject.toJSONString(logEntity);

                // 网络请求发送json数据
                UploadUtil.upload(json);

                // 每隔5秒发送一条数据
                Thread.sleep(5000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
