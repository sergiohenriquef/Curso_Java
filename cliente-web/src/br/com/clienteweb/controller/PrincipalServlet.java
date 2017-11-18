package br.com.clienteweb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.ClienteDao;
import br.com.cliente.model.Cliente;

/**
 * Servlet implementation class PrincipalServlet
 */
public class PrincipalServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		buscaOsClientes(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		buscaOsClientes(req, resp);
	}

	private void buscaOsClientes(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String filtro = req.getParameter("txtPesquisa");

		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = (List<Cliente>) dao.select();

		if (filtro != null && !filtro.equals("")) {

			List<Cliente> listaTemporaria = new ArrayList<Cliente>();
			req.setAttribute("filtro", filtro);

			for (Cliente cliente : clientes) {
				if (cliente.getNome().toLowerCase().contains(filtro.toLowerCase())) {
					listaTemporaria.add(cliente);
				}
			}			

			if (!listaTemporaria.isEmpty())
				clientes = listaTemporaria;
			else 
				clientes.clear();
		}

		req.setAttribute("clientes", clientes);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
		dispatcher.forward(req, resp);
	}

}
