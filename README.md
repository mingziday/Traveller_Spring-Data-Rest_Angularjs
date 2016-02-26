# Traveller_Spring-Data-Rest_Angularjs
Traveller，翻译为旅行家，是我用来实践最佳web技术的项目，主题是一个给旅行爱好者提供旅行信息的网站。目标是组合现有的先进web技术，实现符合中国用户使用习惯的网站。

相关网址
-------------------------
Git：https://github.com/mingziday/Traveller_Spring-Data-Rest_Angularjs  
Blog：http://www.cnblogs.com/mingziday/category/712097.html

技术规划要点
-------------------------
1、数据库：   
放弃Mysql5，采用Hsqldb内存数据库，加载的时候自动预制初始化数据    
Navicat11：一款可视化操作Mysql的工具  
2、编辑工具：   
STS：Spring基于Eclipse封装的Spring集成开发工具   
SubLime：一款非常酷的文本编辑工具   
3、服务容器  
Tomcat：动态服务器  
Nginx：静态文件服务器  
4、后端框架   
MVC：Spring MVC    
持久层：Hibernate/Spring Data JPA    
后端校验：Hibernate JSR303  
安全：Spring Security
流程：Spinrg Web Flow   
5、前端MVC框架   
Angularjs：2009年出生的前端神器   
6、前端样式框架   
bootstrap  

使用方法
-------------------------
1、数据库默认不需要配置  
2、编译运行发布到tomcat容器 
3、配置Nginx的nginx.conf 
4、访问http://localhost/index.html


更新日志
-------------------------
首页显示scences列表、user列表----2015/9/22   
scences主页显示、主页分页、详细页显示------2015/9/22   
首页增加scences的链接----2015/9/24  
注册登录界面-----2015/9/27  
完成用户注册-----2012/9/30   
简单cache实现----2015/10/5  
web.xml配置采用config类的方法代替----2015/10/6  
ehcache---2015/10/11   
nginx实现动静分离访问----2015/10/20 
改为使用内存数据库，加载时自动预置数据----2016/2/21  
增加spring web flow的例子----2016/2/26  
