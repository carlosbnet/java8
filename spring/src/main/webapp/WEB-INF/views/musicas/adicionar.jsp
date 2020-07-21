<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert new music</title>
</head>
<body>

	<c:url var="adicionar" value="/springmvc/musicas/adicionar"></c:url>


	<form:form action="${adicionar}" method="post" modelAttribute="musica">
		
				Nome:
			<form:input path="nome"></form:input>
		<form:errors path="nome"></form:errors>
		<table>
			<tr>
				<td>Data de Criação:</td>
				<td><form:input path="dataCriacao" /></td>
				<form:errors path="dataCriacao"></form:errors>
			</tr>
			<tr>
					<div>
					
					<label>Album</label>
						<form:select path="album.id">
						
						<form:options items="${albuns}" itemLabel="nome" itemValue="id"/>
						
						
						</form:select>
					</div>	
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
	
	
	
</body>
</html>