<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Core principal da taglib do JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Taglib de formatação de datas -->
<!-- <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  -->

<!-- Taglib customizada para trabalhar com datas do java 8 -->
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/imagens/foton.png" var="imagem" />
	<c:import url="cabecalho.jsp" />
	<a href="cadastro.html">Voltar para a página de cadastro</a>


	<img src="${ imagem }" />

	<h2>Usuário ${ param.nome } cadastrado(a) com sucesso!</h2>
	<table>
		<tr>
			<th>Nome</th>
			<th>Telefone</th>
			<th>CPF</th>
			<th>Data Nascimento</th>
			<th>Email</th>
			<th>Remover</th>
			<th>Alterar</th>
		</tr>
		<c:forEach var="pessoa" items="${ pessoas }">
			<tr>
				<td>${ pessoa.nome }</td>
				<td>${ pessoa.telefone }</td>
				<td>${ pessoa.cpf }</td>
				<td>${ pessoa.dataNascimento }</td>
				<td>
					<c:if test="${ not empty pessoa.email }">
						<a href="mailto:${ pessoa.email }">${ pessoa.email }</a>
					</c:if> <c:if test="${ empty pessoa.email }">
						Email não informado
					</c:if>
				</td>
				<td>
					<a href="mvc?logica=RemovePessoaLogica&id=${ pessoa.id }">Remover</a>
				</td>
				
				<td>
					<a href="mvc?logica=MostraPessoaLogica&id=${ pessoa.id }">Alterar</a>
				</td>
			</tr>
		</c:forEach>
	</table>

	<c:import url="rodape.jsp" />
</body>
</html>


<!-- 
Formatar data com java 8

<fmt:parseDate value="${dateForParsing}" pattern="yyyy-MM-dd" var="parsedDate" type="date" />

<fmt:formatDate value="${parsedDate}" var="newParsedDate" type="date" pattern="dd.MM.yyyy" />
 -->



<%-- 	
 Switch case com taglib
 <c:choose>
		<c:when test="${not empty pessoa.email}">
			<a href="mailto:${pessoa.email}">${pessoa.email}</a>
		</c:when>
		<c:otherwise>E-mail não informado</c:otherwise>
	</c:choose> --%>