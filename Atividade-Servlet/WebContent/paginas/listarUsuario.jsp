<%@page import="br.ufrn.imd.aulaservlet.dominio.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem Usuarios</title>
</head>
<body>
	<h3>Cadastrar usuário</h3>
	<fieldset>
		<form action="../usuario" method="post">
			<div>
				<p><b>Nome</b> <input type="text" name="nome" required/></p>
				<p><b>Login</b> <input type="text" name="login" required/></p>
				<p><b>Senha</b> <input type="password" name="senha" required/></p>
				<button type="submit">Salvar</button>
			</div>
		</form>
	</fieldset>
	<ul>
		<%List<Usuario> usuarios = (List<Usuario>) session.getAttribute("usuarios");
		for (Usuario user : usuarios) { %>
			<li> <%= user.getNome() %>
		<%} %>
		
	</ul>
</body>
</html>