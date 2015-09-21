<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html data-ng-app="userApp">
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
<script type="text/javascript" src="user/js/app.js"></script>
<script type="text/javascript" src="webjars/angularjs/1.3.8/angular-resource.min.js"></script>
<script type="text/javascript" src="webjars/restangular/1.4.0/restangular.min.js"></script>
<script type="text/javascript" src="webjars/angular-ui-router/0.2.15/angular-ui-router.min.js"></script> 


</body>
</html>