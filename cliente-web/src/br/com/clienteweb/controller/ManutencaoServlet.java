package br.com.clienteweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.ClienteDao;
import br.com.cliente.model.Cliente;

/**
 * Servlet implementation class ManutencaoServlet
 */
public class ManutencaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idCliente = request.getParameter("id");

		if (idCliente != null)
			update(idCliente, request, response);
		else
			insert(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("manutencao.jsp");
		dispatcher.forward(request, response);

	}

	private void update(String idCliente, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClienteDao dao = new ClienteDao();
		List<Cliente> lista = (List<Cliente>) dao.select();

		Cliente cliente = new Cliente();
		cliente.setId(idCliente);

		for (Cliente item : lista) {

			if (item.equals(cliente)) {
				request.setAttribute("cliente", item);
				break;
			}
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("manutencao.jsp");
		dispatcher.forward(request, response);

	}

}
