<%@page import="java.util.List,apploja.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

List empresas = (List)request.getAttribute("empresas");


%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>Empresas Cadastradas</div>
	<br>
	<ul>
	
	 <%
	 	List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
	 	for(Empresa empresa : lista) {
		%>
		<li><%= empresa.getNome() %></li>
		<%} %> 
	</ul>
	
</body>
</html>