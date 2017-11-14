package br.com.clienteweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.IDefaultDao;
import br.com.cliente.dao.UsuarioDao;
import br.com.cliente.model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = getParameter(request, "txtUsuario");
		String senha = getParameter(request, "txtSenha");

		IDefaultDao daoUsuario = new UsuarioDao();
		List<Usuario> lista = (List<Usuario>) daoUsuario.select();

		boolean autenticado = false;

		for (Usuario item : lista) {
			if (item.getUsuario().equals(usuario) && item.getSenha().equals(senha)) {
				autenticado = true;
				break;
			}
		}

		RequestDispatcher dispatcher = null;
		if (autenticado)
			dispatcher = request.getRequestDispatcher("/index.jsp");
		else {
			dispatcher = request.getRequestDispatcher("/login.jsp");
			request.setAttribute("erro-login", "Usuario ou senha informados incorretamente.");
		}
		
		dispatcher.forward(request, response);

	}

	private String getParameter(HttpServletRequest request, String parametro) {

		if (request != null && parametro != null && !parametro.equals(""))
			return request.getParameter(parametro);

		return "";
	}

}
