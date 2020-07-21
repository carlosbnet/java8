<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>




<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">PetShop</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <sec:authorize access="isAuthenticated()">
        <sec:authentication property="principal" var="principal" />
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/apppet/home/hello">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarCadastro" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Cadastros
                </a>

                <div class="dropdown-menu" aria-labelledby="navbarCadastro">

                    <a class="dropdown-item" href="/apppet/animal/add">Animal</a>
                    <a class="dropdown-item" href="/apppet/medico/add">Medico Veterinario</a>
                    <a class="dropdown-item" href="/apppet/prontuario/add">Prontuario</a>
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <a class="dropdown-item" href="/apppet/usuario/add">Usuario</a>
                    </sec:authorize>
                </div>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarPesquisar" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Pesquisar
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarPesquisar">
                    <a class="dropdown-item" href="/apppet/medico/listar">Medico Veterinario</a>
                    <a class="dropdown-item" href="/apppet/animal/listar">Animal</a>
                    <a class="dropdown-item" href="/apppet/prontuario/listar">Prontuarios</a>
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <a class="dropdown-item" href="/apppet/usuario/listar">Usuarios</a>
                    </sec:authorize>
                </div>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
    </sec:authorize>
</nav>