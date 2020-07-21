<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

    <c:url var="adicionaMedico" value="/medico/add"></c:url>


<h2>Inserção de novo Medico...</h2>
<br />

<%--@elvariable id="medico" type="br.com.startsl.apppet.dominios.MedicoVeterinario"--%>

<form:form action="${adicionaMedico}" method="post"  modelAttribute="medico">
    <div class="form-group">
        <label for="formGroupExampleInput">Nome</label>
        <form:input path="nome" type="text" cssClass="form-control" id="formGroupExampleInput" placeholder="Nome do Medico"/>
        <form:errors path="nome" cssStyle="color: red"></form:errors>
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Especialidade</label>
        <form:input path="especialidade" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Especialidade"/>
        <form:errors path="especialidade" cssStyle="color: red"></form:errors>
    </div>

    <div class="form-group">
        <label for="formGroupExampleInput3">Numero do Registro</label>
        <form:input path="num_crv" type="text" class="form-control" id="formGroupExampleInput3" placeholder="Numero do Registro"/>
        <form:errors path="num_crv" cssStyle="color: red"></form:errors>
    </div>

    <input type="submit" value="Salvar" class="btn btn-primary" />


</form:form>
