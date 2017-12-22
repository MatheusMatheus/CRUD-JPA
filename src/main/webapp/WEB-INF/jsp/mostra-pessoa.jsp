<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "mvc" method = "post">
		Nome<input type = "text" name = "nome" value = ${ pessoa.nome }>
		<br><br>Telefone<input type = "text" name = "telefone" value = ${ pessoa.telefone }>
		<br><br>CPF<input type = "text" name = "cpf" value = ${ pessoa.cpf }>
		<br><br>Data de Nascimento<input type = "date" name = "dataNasc" value = ${ pessoa.dataNascimento }>
		<br><br>Email<input type = "text" name = "email" value = ${ pessoa.email }>
		<br><br>Sexo<br><input type = "radio" name = "sexo" value = "Masculino">
		Masculino
		<br><input type = "radio" name = "sexo" value = "Feminino"/>
		Feminino
		<br><input type = "radio" name = "sexo" value = "Outro"/>
		Outro
		<br><br><hr>
		<br><br>Cidade<input type = "text" name = "cidade" value = ${ endereco.cidade }>
		<br><br>CEP<input type = "text" name = "cep" value = ${ endereco.cep }>
		<br><br>Logradouro<input type = "text" name = "logradouro" value = ${ endereco.logradouro }>
		<br><br>Numero<input type = "text" name = "numero" value = ${ endereco.numero }>
		<input type = "hidden" name = "logica" value = "AlteraPessoaLogica">
		<br><br><input type = "submit" value = "Alterar"/>
	</form>

</body>
</html>