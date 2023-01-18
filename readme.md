# 简单的登录系统

## 项目说明

### 构建系统

本项目由*gradle-kotlin*构建，使用*springboot3.0*和*Java17.05*

* [gradle](https://gradle.org/)
* [springboot](https://spring.io/projects/spring-boot)
* [Java17](https://www.oracle.com/java/technologies/downloads/#java17)
* [gradle-kotlin简单配置教程](https://zhuanlan.zhihu.com/p/162073022)

### 项目结构

```text
├── build.gradle.kts
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── HELP.md
├── README.md
├── settings.gradle.kts
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── seuwxxh
    │   │           └── login_demo
    │   │               ├── LoginApplication.java
    │   │               ├── controller
    │   │               │   └── LoginController.java
    │   │               ├── dao
    │   │               │   └── LoginDao.java
    │   │               ├── model
    │   │               │   └── User.java
    │   │               ├── service
    │   │               │   └── LoginService.java
    │   │               └── util
    │   │                   └── LoginUtil.java
    │   └── resources
    │       ├── application.properties
    │       ├── templates
    │       └── static
    └── test
        └── java
            └── com
                └── example
                    └── login
                        └── LoginApplicationTests.java
```
### 各个包的作用
* **controller**:控制层，接收前端的请求，调用service层的方法，返回结果
* **dao**:数据访问层，负责数据库的操作
* **model**:实体类，用于存储数据
* **service**:业务层，负责业务逻辑的处理
* **util**:工具类，用于存放一些工具方法
* **resources**:资源文件，用于存放配置文件和静态资源
* **test**:测试文件，用于测试
* **static**:静态资源文件，用于存放静态资源
* **templates**:模板文件，用于存放模板文件
* **application.properties**:配置文件，用于存放配置信息
* **LoginApplication.java**:启动类
* **LoginApplicationTests.java**:测试类

### 任务分配

* 数据库设计：@mpy
* 业务逻辑相关（.service）：@ljr
* 前端相关（.controller）：@lwb
* 工具类相关（.util）：不单独分配，由各个组员自行完成