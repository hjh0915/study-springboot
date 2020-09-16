日志
====
通过slf4j打印日志
----------------
``` java
Logger logger = LoggerFactory.getLogger(HelloLog.class);
logger.trace("trace");
logger.debug("debug");
logger.info("info");
logger.warn("warn");
logger.error("error");
```
不需要在pom.xml文件中引入相关的包，可以通过spring-boot自动配置
通过测试检验是否能够输出日志

打印存放日志有三种方法
--------------------
### 1、根据文件位置存放
``` 
logging.level.com.jxgmxy.demo=trace
logging.file.name=D:/springboot.log
```

### 2、根据文件路径存放
```
logging.level.com.jxgmxy.demo=trace
logging.file.path=/spring/log123
```

### 3、根据logback.xml进行配置
```
<configuration>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="debug">
        <appender-ref ref="STDOUT" />
    </root>
</configuration>
```