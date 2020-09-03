读取文件内容的前提
=================
要将对象放在一个容器中
```
@Component
```
需要配置
```
@ConfigurationProperties(prefix = "person")

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```

读取文件内容的三种方法：
=====================
1、通过application.properties文件内容编写
---------------------------------------
通过prefix = "person"，在properties中以person.属性赋值
```
person.name=hjh
person.age=20
person.boss=true
person.maps.k1=v1
person.maps.k2=v2
person.lists=list1,list2
```
注意：List类型的写法较特殊，等号两边不能有空格

2、通过application.yml文件内容编写
---------------------------------
以对象的形式编写赋值
```
person:
  name: hjh
  age: 20
  boss: false
  maps:
    k1: v1
    k2: v2
  lists:
    - list1
    - list2
  dog:
    name: 小卡
    age: 2
```
注意：
    1、一定要有抬头前缀person，才能通过prefix = "person"找到赋值内容；
    2、冒号和短横杠后面一定要有空格
    3、List类型写法较特殊，需要在赋值前加上-

3、通过自定义properties文件内容编写
---------------------------------
需要在类对象中添加注解@PropertySource，才能找到自定义文件
```
@PropertySource(value = "classpath:person.properties")
```
通过prefix = "person"，在properties中以person.属性赋值

注意：在自定义文件中可以通过-连接属性名称，即username = person.user-name


测试
====
实例化一个对象
```
@Autowired
Person person;
```