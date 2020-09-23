学习Thymeleaf
=============
使用Thymeleaf传值，将数据通过controller部分传到前端html部分。

1、引入
-------
``` html
<html xmlns:th="http://www.thymeleaf.org">
```
在html文件的<html>标签中加入

2、两种基本写法
--------------
``` html
<div th:text="${msg}">这是一个div</div>
```
类似于EL表达式

``` html
<div>[[${msg}]]</div>
```
类似于flask表达