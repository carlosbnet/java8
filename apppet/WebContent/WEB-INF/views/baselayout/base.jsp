<%--
  Created by IntelliJ IDEA.
  User: carlos
  Date: 01/06/2020
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%--Mapeio os meus recursos para esta usando eles--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<spring:url value="/resources/css/bootstrap.css" var="BootStrapCSS"></spring:url>
<spring:url value="/resources/js/bootstrap.js" var="BootStrapJS"></spring:url>
<spring:url value="/resources/js/jquery.min.js/" var="Jquery"></spring:url>

<%--        Joga todos os recursos nos devidos lugares--%>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><tiles:insertAttribute name="title" ignore="true"> </tiles:insertAttribute>  </title>
    <script type="text/javascript" src="${Jquery}"></script>

    <link href="${BootStrapCSS}" rel="stylesheet" />
    <script type="text/javascript" src="${BootStrapJS}"></script>


</head>

<body>

<%--Cria a base das paginas--%>
<div class="container">

<div style="...">
    <tiles:insertAttribute name="header" ignore="false"></tiles:insertAttribute>
</div>

<div style="...">
    <tiles:insertAttribute name="body" ignore="false"></tiles:insertAttribute>
</div>

<div style="...">
    <tiles:insertAttribute name="footer" ignore="false"></tiles:insertAttribute>
</div>
</div>
</body>
</html>
