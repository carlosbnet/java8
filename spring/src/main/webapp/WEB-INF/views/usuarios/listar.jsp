<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2>Listar Albuns</h2>

<table class="table">

	<thead>
	
		<th>ID</th>
		<th>Nome do Usuario</th>
		<th>Roler</th>
		
	</thead>
	
	<tbody>
	
	<c:if test="${!empty usuarios }">
		<c:forEach items="${ usuarios }"var="usuario">
		
			<tr>
				<td>${usuario.id}</td>
				<td>${usuario.username}</td>
				<td>${usuario.role}</td>
				<td>
					<a href="/springmvc/musicas/alterar/${musica.id}">Alterar</a>
					<a href="/springmvc/musicas/excluir/${musica.id}">Excluir</a>
				
				</td>			
			</tr>
			
		
		
		</c:forEach>	
	
	</c:if>
	
	</tbody>

</table>
<br>
<a href="/albuns/adicionar">Adicionar Novo usuario</a>
