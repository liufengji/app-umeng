
#配置Hive支持JSON存储

###1、添加jar包
>将json-serde-1.3.8-jar-with-dependencies.jar导入到hive的/opt/module/hive/lib路径下。

###2、hive-site.xml文件中添加如下配置
```
<property>
    <name>hive.aux.jars.path</name>
    <value>file:///opt/module/hive/lib/json-serde-1.3.8-jar-with-dependencies.jar</value>
</property>

<property>
    <name>hive.exec.compress.output</name>
    <value>false</value>
</property>
```
#Hive 添加自定义UDF函数
###1、打包
```
添加app_logs_hive.jar到类路径/opt/module/hive/lib下
```
###2、永久添加jar包
```
在hive-site.xml文件中添加
<property>
    <name>hive.aux.jars.path</name>
    <value>file:///opt/module/hive/lib/app_logs_hive.jar</value>
</property>
	由于之前添加过json的jar包所以修改为如下方式
<property>
    <name>hive.aux.jars.path</name>
    <value>file:///opt/module/hive/lib/json-serde-1.3.8-jar-with-dependencies.jar,file:///opt/module/hive/lib/app_logs_hive.jar</value>
</property>
```
###3、注册永久函数
```
hive (default)>create function getdaybegin AS 'com.atguigu.hive.DayBeginUDF';
```

