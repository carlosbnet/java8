<<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
          pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1>Lista de Animais</h1>

<table class="table table-striped">
    <thead>
    <tr>

        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Epecialidade</th>
        <th scope="col">Numero do Registro</th>


    </tr>
    </thead>
    <tbody>
    <c:if test="${!empty medicos}">
    <c:forEach items="${medicos}" var="medico">
    <tr>
        <td>${medico.id}</td>
        <td>${medico.nome}</td>
        <td>${medico.especialidade}</td>
        <td>${medico.num_crv}</td>

        <td><a href="/apppet/medico/alterar/${medico.id}">Alterar</a> | <a href="/apppet/medico/excluir/${medico.id}">Excluir</a></td>

    </tr>
    </c:forEach>
    </c:if>
    </tbody>
</table>