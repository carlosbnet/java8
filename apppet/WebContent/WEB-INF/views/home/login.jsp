<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<h2>Login</h2>
<br />
<form name="f" action="<c:url value='/login'/>" method="post">
    <div class="row">
        <div class="col-md-6">
            <div class="form-group">
                <label>Nome de usuário:</label>
                <input type="text" name="username"  value="" class="form-control">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <div class="form-group">
                <label>Senha:</label>
                <input type="password" name="password"  class="form-control">
            </div>
        </div>
    </div>
    <input type="submit" name="submit" value="Login" class="btn btn-primary" />

    <div class="form-group">
        <label for="remember-me" >Lempbra?</label>
        <input type="checkbox" id="remember-me" name="remember-me"/>
    </div>

</form>