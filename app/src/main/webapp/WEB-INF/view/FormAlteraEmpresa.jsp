<%@ page isELIgnored="false" %>
<%@page import="java.util.List,apploja.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/entrada?acao=AlteraEmpresa&id=${empresa.id}" method="post">

Nome: <input type="text" name="nome" value="${empresa.nome}" ></input>
Data Abertura: <input type="text" name="data"  value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />"></input>
ID <input type="text" name="id" value="${empresa.id}"></input>
<button type="submit">Enviar</button>

</form>


</body>
</html>