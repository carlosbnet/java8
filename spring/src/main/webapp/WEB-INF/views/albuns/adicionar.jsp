<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:url var="adicionar" value="/springmvc/albuns/adicionar"></c:url>


	<form:form action="${adicionar}" method="post" modelAttribute="album">
		
				Nome:
			<form:input path="nome"></form:input>
		<form:errors path="nome"></form:errors>
		<table>
			<tr>
				<td>Ano de Lacamento:</td>
				<td><form:input path="anoLacamento" /></td>
				<form:errors path="anoLacamento"></form:errors>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>