在maven工程中创建springboot
==========================
1、mvn archetype:generate "-DgroupId=com.work.hello" "-DartifactId=myspring" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false" "-DarchetypeCatalog=internal"

2、在官网创建一个web项目，选择maven、java、spring web
https://start.spring.io/

执行maven工程的springboot
========================
mvn spring-boot:run

执行测试代码
===========
mvn test

生成jar包
=========
mvn package

编译
====
mvn compile