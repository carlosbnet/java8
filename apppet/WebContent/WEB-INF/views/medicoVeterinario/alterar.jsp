<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="alterarMedico" value="/medico/alterar/"></c:url>

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


                <%--@elvariable id="medico" type="br.com.startsl.apppet.dominios.MedicoVeterinario"--%>
                <form:form action="${alterarMedico}" method="post"  modelAttribute="medico">

                    <div class="form-group">
                        <label for="formGroupExampleInput0">Nome</label>
                        <form:input path="id" type="text" cssClass="form-control" id="formGroupExampleInput0" readonly="true"/>
                    </div>

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


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <input type="submit" value="Salvar" class="btn btn-primary" />
            </div>
            </form:form>
        </div>
    </div>
</div>