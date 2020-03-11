

## 新建Springboot项目

1. Google--Getting started Springboot或者直接新建Spring init...
2. Controller--*IoC控制反转*      **`Application以及Controller`**
3. Bean--DI：*Dependency Inject*(依赖注入) **`在Service的Java类下进行依赖注入@Inject`**
4.  [**XML及JavaBean依赖注入方式**](https://www.springboottutorial.com/spring-boot-java-xml-context-configuration)

----

## Docker

1. docker pull mysql 下载mirror
2. docker run ....创建镜像实例-即Container:参考[**mysql-Docekr**](https://hub.docker.com/_/mysql)
3. 设置MYQSQL_ROOT_ **PASSWORD**,MYSQL_**DATABASE**, **-p 外部端口3306:内部端口3306**

---

## Mybatis（对象关系映射）

1. 在Springboot与Docker下mysql之间建立起**对象关系映射ORM**即Mybatis
2. pom.xml下添加Springboot Mybatis的依赖

 
---
### Bean

1. XML--需要resource\applicationContext.xml

   ```java
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context.xsd">
   创建Bean    <bean id="orderService" class="hello.service.OrderService">
       </bean>
   </beans>
   ```

   还需要xmlconfiguration.java

   ```Java
   @Configuration
   @ImportResource({"classpath*:applicationContext.xml"})
   public class Xmlconfiguration {}
   ```

2. Java注解

   ```java
   @Configuration
   public class JavaConfiguration {
   
       @Bean
       public UserService  userService(UserMapper userMapper) {
           return new UserService(userMapper);
       }
   ```



## Mapper

- 执行SQL语句















