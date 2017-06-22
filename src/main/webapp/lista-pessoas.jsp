<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<a href="cadastro.html">Voltar para a página de cadastro</a>

	<jsp:useBean id="dao" class="br.com.model.dao.PessoaDAO">
		<h2>Usuário ${param.nome} cadastrado(a) com sucesso!</h2>
		<table>
			<tr>
				<th>Nome</th>
				<th>Telefone</th>
				<th>CPF</th>
				<th>Data Nascimento</th>
				<th>Sexo</th>
			</tr>
			<c:forEach var="pessoa" items="${dao.lista}">
				<tr>
					<td>${pessoa.nome}</td>
					<td>${pessoa.telefone}</td>
					<td>${pessoa.cpf}</td>
					<td>${pessoa.dataNasc}</td>
					<td>${pessoa.sexo}</td>
				</tr>
			</c:forEach>
		</table>
	</jsp:useBean>
	<%-- 					<c:if test="${not empty contato.email}"> --%>
	<%-- 						<a href="mailto:${contato.email}">${contato.email}</a> --%>
	<%-- 					</c:if> --%>

	<%-- 				<c:choose> --%>
	<%-- 					<c:when test="${not empty contato.email}"> --%>
	<%-- 						<a href="mailto:${contato.email}">${contato.email}</a> --%>
	<%-- 					</c:when> --%>
	<%-- 					<c:otherwise> --%>
	<!-- 						E-mail não informado -->
	<%-- 					</c:otherwise> --%>
	<%-- 				</c:choose> --%>


	<c:import url="rodape.jsp" />
</body>
</html>