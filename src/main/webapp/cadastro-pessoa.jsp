<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de pessoa</title>
</head>
<body>
	<form action = "mvc" method = "post">
		Nome<input type = "text" name = "nome"/>
		<br><br>Telefone<input type = "text" name = "telefone"/>
		<br><br>CPF<input type = "text" name = "cpf"/>
		<br><br>Data de Nascimento<input type = "date" name = "dataNasc"/>
		<br><br>Email<input type = "text" name = "email"/>
		<br><br>Sexo<br><input type = "radio" name = "sexo" value = "Masculino"/>
		Masculino
		<br><input type = "radio" name = "sexo" value = "Feminino"/>
		Feminino
		<br><input type = "radio" name = "sexo" value = "Outro"/>
		Outro
		<br><br><hr>
		<br><br>Cidade<input type = "text" name = "cidade"/>
		<br><br>CEP<input type = "text" name = "cep"/>
		<br><br>Logradouro<input type = "text" name = "logradouro"/>
		<br><br>Numero<input type = "text" name = "numero"/>
		<input type = "hidden" name = "logica" value = "CadastraPessoaLogica">
		<br><br><input type = "submit" value = "Cadastrar"/>
	</form>
</body>
</html>