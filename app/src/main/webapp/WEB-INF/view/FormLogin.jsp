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


<form action="/entrada?acao=Login" method="post">

Login: <input type="text" name="login"></input>
Senha <input type="password" name="senha"></input>
<input type="hidden" name="acao" value="Login"></input>
<button type="submit">Entrar</button>

</form>


</body>
</html>