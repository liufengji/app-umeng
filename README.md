
##umeng 分析统计架构

userid -> tomcat -> kafkaproduce -> kafkatopic ->  flume  -> hdfs  ->crontab -> hdfs hive目录  -> hive 分析指标 -> ssm -> each.js

##模块功能
```
app_logs_client     用户数据生产
app_logs_collect_web    kafka_produce
app_logs_common      工具模块
app_logs_flume     flume 自定义拦截器
app_logs_hive      hive  自定义udf函数
app_logs_visualize_web    ssm后台服务架构，earch.js前端，hive作为数据库， 可以改进为sqoop调用hive.sql 提取指标数据存入mysql
```
