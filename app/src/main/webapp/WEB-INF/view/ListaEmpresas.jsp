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
<title>Java Standard</title>
</head>
<body>



	Usuario Logado:${  usuarioLogado.login }
	
	<br>
	<br>
	<br>
	<br>

	<div>Empresas Cadastradas</div>
	<br>
	<ul>
			<c:forEach items="${ empresas }" var="empresa">
			
		<li>${empresa.id} - ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> <a href="/entrada?acao=MostraEmpresa&id=${empresa.id} " >  Editar  </a><a href="/entrada?acao=RemoveEmpresa&id=${empresa.id}">  Remover  </a> </li>
			</c:forEach> 
	</ul>
	<br>
	 <a href="/entrada?acao=NovaEmpresaForm">Ir para Cadastro</a>
	 <a href="/entrada?acao=Logout">Sair da Aplicação</a>
	
</body>
</html>
