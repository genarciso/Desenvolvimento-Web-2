package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		if(login.equals("genarciso") && senha.equals("123")) {
			Usuario user = new Usuario();
			user.setNome("genarciso");
			req.getSession().setAttribute("usuario", user);
			resp.sendRedirect("/Atividade-Servlet-1.0/paginas/conteudo.jsp");
		} else {
			resp.sendRedirect("/Atividade-Servlet-1.0/login.jsp");
		}
	}
}
