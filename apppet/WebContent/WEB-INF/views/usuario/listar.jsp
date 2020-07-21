<<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
          pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<h1>Lista de Usuarios</h1>

<table class="table table-striped">
    <thead>
    <tr>

        <th scope="col">ID</th>
        <th scope="col">Usernamer</th>
        <th scope="col">Password</th>
        <th scope="col">Role</th>
        <th scope="col">Ação</th>

    </tr>
    </thead>
    <tbody>
    <c:if test="${!empty usuarios}">
    <c:forEach items="${usuarios}" var="usuario">
    <tr>
        <td>${usuario.id}</td>
        <td>${usuario.username}</td>
        <td>${usuario.password}</td>
        <td>${usuario.roler}</td>
        <td><a href="/apppet/usuario/alterar?id=${usuario.id}">Alterar</a> | <a href="/apppet/usuario/delete?id=${usuario.id}">Excluir</a></td>

    </tr>
    </c:forEach>
    </c:if>
    </tbody>
</table>