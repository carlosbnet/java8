<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


    <c:url var="adicionaProntuario" value="/prontuario/add"></c:url>



<h2>Inserção de novo usuário...</h2>
<br />

<%--@elvariable id="prontuario" type="br.com.startsl.apppet.dominios.Prontuario"--%>

<form:form action="${adicionaProntuario}"  method="post"  modelAttribute="prontuario">

    <div class="form-group">
        <label for="formGroupExampleInput45">Nome Animal</label>
<%--        --%>
<%--        <form:input path="animal_atend" type="text" cssClass="form-control"  />--%>
<%--        <form:errors path="animal_atend" cssStyle="color: red"></form:errors>--%>


        <form:select path="animal_atend" cssClass="form-control" id="formGroupExampleInput45">
            <form:options items="${animais}" itemLabel="nome" itemValue="nome" />
        </form:select>


    </div>
    <div class="form-group">
        <label for="formGroupExampleInput46">Veterinario Responsavel</label>
<%--        <form:input path="atend_veterinario" type="text" class="form-control" id="formGroupExampleInput46" />--%>
<%--        <form:errors path="atend_veterinario" cssStyle="color: red"></form:errors>--%>

        <form:select path="atend_veterinario" cssClass="form-control" id="formGroupExampleInput46">
            <form:options items="${veterinarios}" itemLabel="nome" itemValue="nome" />
        </form:select>

    </div>

    <div class="form-group">
        <label for="formGroupExampleInput34">Data Atendimento</label>
        <form:input path="data_atendimnento" class="form-control" id="formGroupExampleInput34" />
        <form:errors path="data_atendimnento" cssStyle="color: red"></form:errors>
    </div>

    <div class="form-group">
        <label for="formGroupExampleInput45">Obeservação</label>
        <form:input path="observacao" type="text" class="form-control" id="formGroupExampleInput45" />
        <form:errors path="observacao" cssStyle="color: red"></form:errors>

    </div>

    <input type="submit" value="Salvar" class="btn btn-primary" />


</form:form>
