<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="alterarAnimal" value="/animal/alterar"></c:url>

<script>
    $(document).ready(function(){
        $("#exampleModal").modal('show');
    });
</script>


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">


                <%--@elvariable id="animal" type="br.com.startsl.apppet.dominios.Animal"--%>
                <form:form action="${alterarAnimal}" method="post"  modelAttribute="animal">

                    <div class="form-group">
                        <label for="formGroupExampleInput0">Nome</label>
                        <form:input path="id" type="text" cssClass="form-control" id="formGroupExampleInput0" readonly="true"/>
                    </div>

                    <div class="form-group">
                        <label for="formGroupExampleInput">Nome</label>
                        <form:input path="nome" type="text" cssClass="form-control" id="formGroupExampleInput" placeholder="Nome do animal"/>
                        <form:errors path="nome" cssStyle="color: red"></form:errors>
                    </div>
                    <div class="form-group">
                        <label for="formGroupExampleInput2">Idade</label>
                        <form:input path="idade" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Idade do animal"/>
                        <form:errors path="idade" cssStyle="color: red"></form:errors>
                    </div>

                    <div class="form-group">
                        <label for="formGroupExampleInput3">Raça</label>
                        <form:input path="raca" type="text" class="form-control" id="formGroupExampleInput3" placeholder="Raça do animal"/>
                        <form:errors path="raca" cssStyle="color: red"></form:errors>
                    </div>

                    <div class="form-group">
                        <label for="formGroupExampleInput4">Dono</label>
                        <form:input path="dono" type="text" class="form-control" id="formGroupExampleInput4" placeholder="Nome do dono"/>
                        <form:errors path="dono" cssStyle="color: red"></form:errors>

                    </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <input type="submit" value="Salvar" class="btn btn-primary" />
            </div>
            </form:form>
        </div>
    </div>
</div>