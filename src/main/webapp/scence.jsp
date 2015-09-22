<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html data-ng-app="scenceApp">
<jsp:include page="fragments/header.jsp" />
<body> 
<div class="container"> 
  <jsp:include page="fragments/nav.jsp" />
</div>

<div ui-view></div>

<div class="container-fluid">
<div ng-include="'fragments/footer.html'"></div>
</div>

<script type="text/javascript" src="webjars/angularjs/1.3.8/angular.js"></script>
<script type="text/javascript" src="common/js/angular-spring-data-rest.min.js"></script>
<script type="text/javascript" src="common/js/lodash.min.js"></script>
<script type="text/javascript" src="scence/js/app.js"></script>
<script type="text/javascript" src="scence/js/controllers.js"></script>
<script type="text/javascript" src="common/myjs/services.js"></script>
<script type="text/javascript" src="webjars/restangular/1.4.0/restangular.min.js"></script>
<script type="text/javascript" src="webjars/angular-ui-router/0.2.15/angular-ui-router.min.js"></script>
<script type="text/javascript" src="webjars/angular-sanitize/1.3.11/angular-sanitize.min.js"></script> 
<!-- angularjs 在线编辑器
<script type="text/javascript" src="webjars/textAngular/1.4.1/textAngular-rangy.min.js"></script>
<script type="text/javascript" src="webjars/textAngular/1.4.1/textAngular-sanitize.min.js"></script>
<script type="text/javascript" src="webjars/textAngular/1.4.1/textAngular.min.js"></script>
 <link href="webjars/textAngular/1.4.1/textAngular.css" rel="stylesheet"/>
 -->
 <!-- ueditor在线编辑器 -->
<script type="text/javascript" src="common/ueditor/ueditor.config.js">
</script>
<script type="text/javascript" src="common/ueditor/ueditor.all.min.js">
</script>
<script type="text/javascript" src="common/ueditor/angular-ueditor.min.js">
</script>

</body>
</html>