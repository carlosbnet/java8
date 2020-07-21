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

	<c:url var="usuarios" value="/springmvc/usuarios/adicionar"></c:url>


	<form:form action="${usuarios}" method="post" modelAttribute="usuario">
		
				Usuario:
			<form:input path="username"></form:input>
		<form:errors path="username"></form:errors>
		<table>
			<tr>
				<td>Senha:</td>
				<td><form:password path="password" /></td>
				<form:errors path="password"></form:errors>
			</tr>
			<tr>
					<div>
					
					<label>Perfil</label>
						<select name="role">
							<option value="ROLE_ADMIN">Administrador</option>
							<option value="ROLE_USER">Usuario comum</option>
						</select>
					</div>	
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
	
	
	
</body>
</html>