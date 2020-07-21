<<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
          pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="alterarAnimal" value="/animal/alterar"></c:url>



<h1>Lista de Animais</h1>

<table class="table table-striped">
    <thead>
    <tr>

        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Idade</th>
        <th scope="col">Raça</th>
        <th scope="col">Dono</th>
        <th scope="col">Ação</th>

    </tr>
    </thead>
    <tbody>
    <c:if test="${!empty animais}">
    <c:forEach items="${animais}" var="animal">
    <tr>
        <td>${animal.id}</td>
        <td>${animal.nome}</td>
        <td>${animal.idade}</td>
        <td>${animal.raca}</td>
        <td>${animal.dono}</td>
        <td><a href="/apppet/animal/alterar/${animal.id}">Alterar</a> | <a href="/apppet/animal/excluir/${animal.id}">Excluir</a></td>

    </tr>
    </c:forEach>
    </c:if>
    </tbody>
</table>