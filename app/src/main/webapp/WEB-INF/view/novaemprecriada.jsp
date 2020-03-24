<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  


<html>

<body>

	
	<c:if test="${not empty empresa}">
	
			Empresa  ${empresa} cadastrada com sucesso
			<br>
	</c:if>
	
	<c:if test="${empty empresa}">
	
		Sem empresa
		<br>
	
	</c:if>




	</ul>
</body>
</html>
