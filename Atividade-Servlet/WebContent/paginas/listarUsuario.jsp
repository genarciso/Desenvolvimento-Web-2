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
		<form action="usuario" method="post">
			<div>
				<p>Nome</p> <input type="text" name="nome"/>
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