package br.com.clienteweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.cliente.dao.IDefaultDao;
import br.com.cliente.dao.UsuarioDao;
import br.com.cliente.model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		boolean oCaraJaLogouAntes = verificaSeOcaraJaLogou(req);
		RequestDispatcher dispatcher = obterProximaPagina(oCaraJaLogouAntes, req);
		dispatcher.forward(req, resp);
	}	
	
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
			
			RequestDispatcher dispatcher = obterProximaPagina(autenticado, request);
			dispatcher.forward(request, response);			
	
	}
	
	private RequestDispatcher obterProximaPagina(boolean oCaraDigitouAsenhaUsuarioCerto, 
			HttpServletRequest request) {
		
		RequestDispatcher dispatcher = null;
		
		if (oCaraDigitouAsenhaUsuarioCerto) {
			dispatcher = request.getRequestDispatcher("/PrincipalServlet");			
			HttpSession sessao = request.getSession();
			sessao.setAttribute("estaAutenticado", oCaraDigitouAsenhaUsuarioCerto);
		}
		else {
			dispatcher = request.getRequestDispatcher("/login.jsp");
			request.setAttribute("erroLogin", "Usuario ou senha informados incorretamente.");
		}		
		
		return dispatcher;
	}
	
	private boolean verificaSeOcaraJaLogou(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object isAutenticado = session.getAttribute("estaAutenticado");
		return isAutenticado != null;
	}
	

	private String getParameter(HttpServletRequest request, String parametro) {

		if (request != null && parametro != null && !parametro.equals(""))
			return request.getParameter(parametro);

		return "";
	}

}















