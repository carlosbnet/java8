<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2>Listar Albuns</h2>

<table class="table">

	<thead>
	
		<th>ID</th>
		<th>Nome da musica</th>
		<th>data da criação</th>
		<th>Ações</th>
	</thead>
	
	<tbody>
	
	<c:if test="${!empty musicas }">
		<c:forEach items="${ musicas }"var="musica">
		
			<tr>
				<td>${musica.id}</td>
				<td>${musica.nome}</td>
				<td>${musica.dataCriacao}</td>
				<td>${musica.album.nome}</td>
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
<a href="/albuns/adicionar">Adicionar Nova musica</a>
