<<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
          pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>




<h1>Lista de Animais</h1>

<table class="table table-striped">
    <thead>
    <tr>

        <th scope="col">ID</th>
        <th scope="col">Nome Animal</th>
        <th scope="col">Veterinario Responsavel</th>
        <th scope="col">Data Atendimento</th>
        <th scope="col">Obeservações</th>
        <th scope="col">Ação</th>

    </tr>
    </thead>
    <tbody>
    <c:if test="${!empty prontuarios}">
    <c:forEach items="${prontuarios}" var="prontuario">
    <tr>
        <td>${prontuario.id}</td>
        <td>${prontuario.animal_atend}</td>
        <td>${prontuario.atend_veterinario}</td>
        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${prontuario.data_atendimnento}" timeZone="UTC"/></td>
        <td>${prontuario.observacao}</td>
        <td><a href="/apppet/prontuario/alterar/${prontuario.id}">Alterar</a>
            |<a href="/apppet/prontuario/delete?id=${prontuario.id}">Excluir</a></td>

    </tr>
    </c:forEach>
    </c:if>
    </tbody>
</table>