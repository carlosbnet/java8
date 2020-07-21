<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<c:url var="alterarProntuario" value="/prontuario/alterar"></c:url>

<script>
    $(document).ready(function(){
        $("#exampleModal1").modal('show');
    });
</script>


<!-- Modal -->
<div class="modal fade" id="exampleModal1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">


                <%--@elvariable id="prontuario" type="br.com.startsl.apppet.dominios.Prontuario"--%>

                <form:form action="${alterarProntuario}" method="post"  modelAttribute="prontuario">

                    <div class="form-group">
                        <label for="formGroupExampleInput0">ID</label>
                        <form:input path="id" type="text" cssClass="form-control" id="formGroupExampleInput0" readonly="true"/>
                    </div>

                    <div class="form-group">
                        <label for="formGroupExampleInput">Nome Animal</label>
                        <form:input path="animal_atend" type="text" cssClass="form-control" id="formGroupExampleInput" />
                        <form:errors path="animal_atend" cssStyle="color: red"></form:errors>
                    </div>
                    <div class="form-group">
                        <label for="formGroupExampleInput2">Veterinario Responsavel</label>
                        <form:input path="atend_veterinario" type="text" class="form-control" id="formGroupExampleInput2" />
                        <form:errors path="atend_veterinario" cssStyle="color: red"></form:errors>
                    </div>

                    <div class="form-group">
                        <label for="formGroupExampleInput3">Data Atendimento</label>
                        <form:input path="data_atendimnento"  class="form-control" id="formGroupExampleInput3" />
                        <form:errors path="data_atendimnento" cssStyle="color: red"></form:errors>
                    </div>

                    <div class="form-group">
                        <label for="formGroupExampleInput4">Obeservação</label>
                        <form:input path="observacao" type="text" class="form-control" id="formGroupExampleInput4" />
                        <form:errors path="observacao" cssStyle="color: red"></form:errors>

                    </div>

            </div>
            <div class="modal-footer">
                <a type="button" href="/apppet/prontuario/listar" class="btn btn-secondary" data-dismiss="modal">Close</a>
                <input type="submit" value="Salvar" class="btn btn-primary" />
            </div>
            </form:form>
        </div>
    </div>
</div>