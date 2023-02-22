<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">

<meta charset="ISO-8859-1">
<title>Register App</title>
</head>
<body>
	<nav class="navigation">
		<ul>
			<li><span style="color: yellow">Register App</span></li>
			<li><a href="cadastrarProduto.jsp">Cadastrar Produto</a></li>
			<li><a href="consultarProduto.jsp">Consultar Produto</a></li>
		</ul>
	</nav>
	<main class="main">
		<form action="cadastrarProdutoController" method="post" class="register-form">
			<div>
				<label><strong>Descri��o:</strong></label><input type="text"
					name="descricao">
			</div>
			<div>
				<label><strong>Quantidade:</strong></label><input type="text"
					name="quantidade">
			</div>
			<div>
				<label><strong>Pre�o:</strong></label><input type="text"
					name="preco">
			</div>

			<label><strong>Dispon�vel On-Line:</strong></label><input
				type="checkbox" name="online">
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Cadastrar Produto">
			</div>
		</form>
	</main>
</body>
</html>