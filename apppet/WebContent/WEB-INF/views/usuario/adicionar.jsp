<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

    <c:url var="adicionaUsuario" value="/usuario/add"></c:url>


<h2>Inserção de novo usuário...</h2>
<br />

<%--@elvariable id="usuario" type="br.com.startsl.apppet.dominios.Usuario"--%>
<form:form action="${adicionaUsuario}" method="post"   modelAttribute="usuario">
    <div class="form-group">
        <label for="formGroupExampleInput">Username</label>
        <form:input path="username" type="text" cssClass="form-control" id="formGroupExampleInput"/>
        <form:errors path="username" cssStyle="color: red"></form:errors>
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Passwords</label>
        <form:input path="password" type="password" class="form-control" id="formGroupExampleInput2"/>
        <form:errors path="password" cssStyle="color: red"></form:errors>
    </div>

    <div class="form-group">
        <label for="formGroupExampleInput3">Permissão</label>
        <form:input path="roler" type="text" class="form-control" id="formGroupExampleInput3"/>
        <form:errors path="roler" cssStyle="color: red"></form:errors>
    </div>


    <input type="submit" value="Salvar" class="btn btn-primary" />


</form:form>
