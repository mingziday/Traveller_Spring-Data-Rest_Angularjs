<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html data-ng-app="otherApp">
<jsp:include page="fragments/header.jsp" /> 
<body> 
<div class="container"> 
  <jsp:include page="fragments/nav.jsp" />
</div>

<div class="container content-sm" ng-controller="OtherController">
<ul class="list-group">
  <li class="list-group-item">Cras justo odio</li>
  <li class="list-group-item">Dapibus ac facilisis in</li>
  <li class="list-group-item">Morbi leo risus</li>
  <li class="list-group-item">Porta ac consectetur ac</li>
  <li class="list-group-item">Vestibulum at eros</li>
</ul>
</div>

<div class="container-fluid">
<div ng-include="'fragments/footer.html'"></div>
</div>
<script type="text/javascript" src="webjars/angularjs/1.3.8/angular.js"></script>
<script type="text/javascript" src="other/js/app.js"></script>
</body>
</html>