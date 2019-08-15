package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

@WebServlet("/sair")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().invalidate();
		resp.sendRedirect("/Atividade-Servlet/login.jsp");
	}

}
