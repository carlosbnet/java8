<%@ page isELIgnored="false" %>
<%@page import="java.util.List,br.com.startsl.appcad.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../css/icons/css/all.css">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Home</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src='main.js'></script>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">CAD UNICO</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#"> Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Clientes
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/testapp?acao=displayregister">Cadastrar</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>

            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>


    <div class="mt-5 mb-5"><h3>Clientes Cadastrados</h3></div>

    <div class="container">
        <table class="table table-striped mt-5 mb-5">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">CPF</th>
                    <th scope="col">Data de Nacimento</th>
                    <th scope="col">Numero da casa</th>
                    <th scope="col">Bairro</th>
                    <th scope="col">Ação </th>
                    

                </tr>
            </thead>
            <tbody>
            <c:forEach items="${ clients }" var="client">
                <tr>
                    <th scope="row">${client.idClient}</th>
                    <td>${client.name}</td>
                    <td>${client.cpf}</td>
                    <td><fmt:formatDate value="${client.date_of_birth}" pattern="dd/MM/yyyy"/> </td>
                    <td>${client.address.logr_numero}</td>
                    <td>${client.address.logr_bairro}</td>
                    <td><a href="/testapp?acao=delete&id=${client.idClient}"><i class="fas fa-trash-alt fa-2x mr-2 text-danger"></i></a> <a href="/testapp?acao=get&id=${client.idClient}"><i class="fas fa-2x fa-user-edit text-primary"></i></a></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>


    <a href="/testapp?acao=logout">Sair do sistema</a>


    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

</body>

</html>