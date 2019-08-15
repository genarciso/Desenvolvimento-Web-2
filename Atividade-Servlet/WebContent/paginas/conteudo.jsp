<%@page import="br.ufrn.imd.aulaservlet.dominio.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conteudo</title>
</head>
<body>
	<h1>ENTROU NO CONTEUDO</h1>
	<p>Usuário: <%= ((Usuario) session.getAttribute("usuario")).getNome() %></p>
	<form action="usuario" method="get">
		<button type="submit">Listar</button>
	</form>
	
	<form action="../sair">
		<button type="submit">Sair</button>
	</form>
</body>
</html>