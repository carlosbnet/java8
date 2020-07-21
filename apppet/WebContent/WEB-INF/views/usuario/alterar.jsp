<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="alterarUsuario" value="/usuario/alterar"></c:url>

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


                <%--@elvariable id="usuario" type="br.com.startsl.apppet.dominios.Usuario"--%>
                <form:form action="${alterarUsuario}" method="post"  modelAttribute="usuario">

                    <div class="form-group">
                        <label for="formGroupExampleInput0">ID</label>
                        <form:input path="id" type="text" cssClass="form-control" id="formGroupExampleInput0" readonly="true"/>
                    </div>


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


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <input type="submit" value="Salvar" class="btn btn-primary" />
            </div>
            </form:form>
        </div>
    </div>
</div>