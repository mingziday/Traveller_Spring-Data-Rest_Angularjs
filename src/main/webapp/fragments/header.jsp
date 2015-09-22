<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>traveller :: a Spring Framework demonstration</title>

	 <spring:url value="/webjars/jquery/2.1.1/jquery.min.js" var="jQuery"/>
    <script src="${jQuery}"></script>
	<!-- jquery-ui.js file is really big so we only load what we need instead of loading everything -->
    <spring:url value="/webjars/jquery-ui/1.10.3/ui/jquery.ui.core.js" var="jQueryUiCore"/>
    <script src="${jQueryUiCore}"></script>
    
    <spring:url value="/webjars/bootstrap/3.3.5/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
	<spring:url value="/common/js/validator.min.js" var="bootstrapvalidatorJS"/>
	<script src="${bootstrapvalidatorJS}"></script>
	<spring:url value="/webjars/bootstrap/3.3.5/js/bootstrap.min.js" var="bootstrapJS"/>
	<script src="${bootstrapJS}"></script>

<!--  
	<spring:url value="/webjars/jquery-ui/1.10.3/ui/jquery.ui.datepicker.js" var="jQueryUiDatePicker"/>
    <script src="${jQueryUiDatePicker}"></script>
-->   
    <!-- jquery-ui.css file is not that big so we can afford to load it -->
    <spring:url value="/webjars/jquery-ui/1.10.3/themes/base/jquery-ui.css" var="jQueryUiCss"/>
    <link href="${jQueryUiCss}" rel="stylesheet"></link>
    
  <spring:url value="/common/css/icomoon-social.css" var="icomoonsocialCss"/>
  <link href="${icomoonsocialCss}" rel="stylesheet"/>
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700,600,800" rel="stylesheet" type="text/css" /> 
 
  <spring:url value="/common/css/leaflet.css" var="leafletCss"/>
  <link href="${leafletCss}" rel="stylesheet"/>
  <spring:url value="/common/css/main-special.css" var="mainspecialCss"/>
  <link href="${mainspecialCss}" rel="stylesheet"/>
 <!-- 箭头 -->
 <spring:url value="/common/css/font-awesome.min.css" var="fountawesomeCss"/>
 <link href="${fountawesomeCss}" rel="stylesheet"/>
 <spring:url value="/common/css/line-icons.css" var="lineiconsCss"/>
 <link href="${lineiconsCss}" rel="stylesheet"/>
 <!--滚动图
 <spring:url value="/common/css/owl.carousel.css" var="owlcarouselCss"/>
 <link href="${owlcarouselCss}" rel="stylesheet"/>
 -->
</head>


