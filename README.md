spring-mvc-REST 是一个完整的，轻量、简单的Java RESTful 项目，基于Spring MVC.
里面有基本的增删改查的功能。而且无需修改任何内容，就可以直接跑起来。

-------------------


如何运行：
-------------------
第一步根据 SQL 文件配置Mysql数据库。

第二步直接运行
在命令行界面输入:

    $ cd spring-mvc-REST
    $ mvn tomcat7:run [-Dmaven.tomcat.port=<port no.>] (In case 8080 is busy] 

通过浏览器打开：http://localhost:8080/spring-mvc-REST/students

第三步:
下载一个 REST Client来模拟请求, 具体的URL和Payload参看
REST 架构该怎么生动地理解？ http://zhihu.com/question/27785028/answer/118036452

如果你想要学习或贡献和这个项目：
下载IDEA Intellij,然后选择import project, 选择import一个maven项目即可。
