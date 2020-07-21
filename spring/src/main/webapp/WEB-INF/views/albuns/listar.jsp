<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2>Listar Albuns</h2>
<br>
<div class="row">
	<div class="col-md-12">
		<div class="form-group">
			<label for="">Album a ser pesquisado</label>
			<input type="text" id="campopesquisa" class="form-control">
		</div>
		<button class="btn btn-primary" id="btnpesquisar">Pesquisar</button>
	</div>
</div>


<table class="table" id="tblalbuns">

	<thead>

		<th>ID</th>
		<th>Nome</th>
		<th>ano do lacamento</th>
		<th>acao</th>
	</thead>

	<tbody>

		<c:if test="${!empty albuns }">
			<c:forEach items="${ albuns }" var="album">

				<tr>
					<td>${album.id}</td>
					<td>${album.nome}</td>
					<td>${album.anoLacamento}</td>
					<td>
						<a href="/springmvc/albuns/alterar/${album.id}">Alterar</a>
						<a href="/springmvc/albuns/excluir/${album.id}">Excluir</a>

					</td>
				</tr>



			</c:forEach>

		</c:if>

	</tbody>

</table>
<br>
<a href="/albuns/adicionar">Adicionar Novo</a>

<script type="text/javascript">

	//seletor
	$(document).ready(
		() => {
			$('#btnpesquisar').click(
				() => {
					var nomeAlbum = $('#campopesquisa').val();
					$.ajax({
						method: 'GET',
						url: '/springmvc/albuns/pornome?nome=' + nomeAlbum,
						success: (data) => {
							$('#tblalbuns tbody > tr').remove();
							$.each(data,(index,album)=>{
								$('#tblalbuns tbody').append(
								'<tr>' +
									'<td>'+ album.id + '</td>'+
									'<td>'+ album.nome + '</td>'+
									'<td>'+ album.anoLancamento + '</td>'+
									'<td>'+
									'	<a href="/springmvc/albuns/alterar/'+ album.id+'">Alterar</a> |'+	
									'   <a href="/springmvc/albuns/excluir/'+ album.id+'">Excluir</a>' +
									'</td>'+
								'</tr>'

							);
							})
							
						},

						error: ()=>{
							alert("Houve um erro na requisição");
						}

					})
				}
			)
		}
	);


</script>