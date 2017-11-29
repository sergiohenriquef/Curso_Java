package br.com.jpa.main;

import java.util.List;

import br.com.jpa.JPAFactory;
import br.com.jpa.dao.ClienteDao;
import br.com.jpa.entity.Cliente;

public class JPATeste {

	public static void main(String[] args) {
		
	

		System.out.println("Listando todos os registros ...");
		
		ClienteDao caraQVaiNoBancoEFazAsCoisas = new ClienteDao(JPAFactory.getEntity());
		List<Cliente> selecionarTodosOsRegistros = caraQVaiNoBancoEFazAsCoisas.selectAll();
		
		for (Cliente cliente : selecionarTodosOsRegistros) {
			System.out.println(cliente);
		}
				
		System.out.println("Selecionando por id ...");
		Cliente clienteAAlterar = caraQVaiNoBancoEFazAsCoisas.selecteById(64);
		
		System.out.println(clienteAAlterar);
		
		System.out.println("Realizando UPDATE ...");
		clienteAAlterar.setNome(clienteAAlterar.getNome() + " - UPDATE");
		caraQVaiNoBancoEFazAsCoisas.update(clienteAAlterar);
		
		 
	}

}









