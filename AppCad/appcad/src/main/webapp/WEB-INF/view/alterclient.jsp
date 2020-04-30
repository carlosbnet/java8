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
    <title>Alterar Cliente</title>
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


    <!-- Conteiner Principal -->
    <div class="container  backCont border mt-5 p-4 ">
 
        <!-- Form Principal -->
        <form action="/testapp?acao=update&id=${client.idClient}" method="post">
            <div class="text-center h2 text-bold font-weight-bold mb-4 mt-3">Alterar Cliente:</div>
            <div class="row ">
      
                <div class="form-group col-5">
                    <Label for="name">Nome:</Label>
                    <input type="text" class="form-control w-150" name="name" id="name" value="${client.name}" placeholder="Digite seu nome completo">
                </div>
                <div class="form-group  col">
                    <label for="cpf">CPF:</label>
                    <input type="text" class="form-control" name="cpf" id="cpf" value="${client.cpf}" placeholder="Digite seu cpf">
                </div>
                <div class="form-group col">
                    <label for="date_of_birth">Data Nascimento</label>
                    <input type="date" class="form-control" name="date_of_birth" value="${client.date_of_birth}" id="date">
                </div>
            </div>
           
            <div class="row ">
                <div class="form-group  col-4">
                    <label for="logr_rua">Rua: </label>
                    <input type="text" class="form-control" name="logr_rua" id="logr_rua"  value="${client.address.logr_rua}" placeholder="Rua onde mora">
                </div>
                <div class="form-group col">
                    <label for="logr_bairro">Bairro:</label>
                    <input type="text" class="form-control" name="logr_bairro" id="logr_bairro" value="${client.address.logr_bairro}" placeholder="Seu Bairro">
                </div>

                <div class="form-group col-1">
                    <label for="logr_numero">N: </label>
                    <input type="number" class="form-control" name="logr_numero" id="logr_numero" value="${client.address.logr_numero}" placeholder="num da casa">
                </div>  
                
                <div class="form-group col">
                    <label for="logr_cidade">Cidade: </label>
                    <input type="text" class="form-control" name="logr_cidade" id="logr_cidade" value="${client.address.logr_cidade}" placeholder="Digite sua cidade">
                </div>

                <div class="form-group col-2">
                    <label for="logr_estado">Estado</label>
                    <select class="form-control" name="logr_estado" value="${client.address.logr_estado}" id="logr_cidade">
                        <option value="MA">MA</option>
                        <option value="SP">SP</option>
                        <option value="RJ">RJ</option>
                        <option value="MG">MG</option>
                        <option value="CE">CE</option>
                        <option value="PI">PI</option>
                    </select>
                </div>
            </div>
            <div class="row ">
                <div class="form-group col-4">
                    <label for="telephone">Telefone:</label>
                    <input type="text" class="form-control" name="telephone" value="${client.telephone}" id="telephone">
                </div>
                <div class="form-group col-5">
                    <label for="email">E-mail</label>
                    <input type="text" class="form-control" name="email" id="email" value="${client.email}">
                </div>
            </div>
            <div class="row mt-4">
                <div class="text-right form-group col">
                    <button type="submit" class="btn btn-primary btn_width">Alterar</button>
                </div>
                <div class="text-left form-group col 1 ">
                    <button type="reset" class="btn btn-danger btn_width" >Cancelar</button>
                </div>
            </div>
        </form>
       
        

    </div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>