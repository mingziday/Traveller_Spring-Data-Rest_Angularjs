# Traveller_Spring-Data-Rest_Angularjs
Traveller，翻译为旅行家，是我用来实践最佳web技术的项目，主题是一个给旅行爱好者提供旅行信息的网站。目标是组合现有的先进web技术，实现符合中国用户使用习惯的网站。

相关网址
-------------------------
Git：https://github.com/mingziday/Traveller_Spring-Data-Rest_Angularjs  
Blog：http://www.cnblogs.com/mingziday/category/712097.html

技术规划要点
-------------------------
1、数据库：   
Mysql5    
Navicat11：一款可视化操作Mysql的工具  
2、编辑工具：   
STS：Spring基于Eclipse封装的Spring集成开发工具   
SubLime：一款非常酷的文本编辑工具   
3、服务容器Tomcat   
4、后端MVC框架   
控制层：Spring   
模型层：Hibernate/Spring Data JPA    
后端校验：Hibernate JSR303   
5、前端MVC框架   
Angularjs：2009年出生的前端神器   
6、前端样式框架   
bootstrap  
7、工程管理   
Maven   
webjar： 一种将前端资源文件进行打包整体发布的方法   
8、版本发布工具git   
9、测试框架SpringTest+JUnit    
10、其他    
二级缓存：Memcached、hibernate+coherence     
静态缓存：反向代理nginx+静态缓存varnish+静态化工具Node.js  

安装手册
------------------------
1、下载工程代码  
2、安装Eclipse或者STS  
3、安装Maven  
4、Mysql5  
5、导入数据库，数据脚本sql/traveller.sql  
6、更改数据库连接字串，com.huawei.traveller.config.AppConfig  
			ds.setDriverClass("com.mysql.jdbc.Driver");  
			ds.setJdbcUrl(  
			"jdbc:mysql://localhost:3306/happycardata?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");    
			ds.setUser("root");   
			ds.setPassword("123456");  
7、编译运行  
8、访问    
http://localhost:8080/traveller/index.jsp


更新日志
-------------------------
首页显示scences列表、user列表----2015/9/22   
scences主页显示、主页分页、详细页显示------2015/9/22   
首页增加scences的链接----2015/9/24  
注册登录界面-----2015/9/27  
完成用户注册-----2012/9/30   
简单cache实现----2015/10/5
web.xml配置采用config类的方法代替----2015/10/6
