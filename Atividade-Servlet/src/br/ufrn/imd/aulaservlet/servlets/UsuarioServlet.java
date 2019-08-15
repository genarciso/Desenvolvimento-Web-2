package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

@WebServlet("/usuario")
public class UsuarioServlet extends HttpServlet {
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("usuarios") == null) {
			request.getSession().setAttribute("usuarios", listaUsuarios);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		
		usuario.setNome(request.getParameter("nome"));
		usuario.setLogin(request.getParameter("login"));
		usuario.setSenha(request.getParameter("senha"));
		
		listaUsuarios.add(usuario);
		request.getSession().setAttribute("usuarios", listaUsuarios);
	
	}

}
