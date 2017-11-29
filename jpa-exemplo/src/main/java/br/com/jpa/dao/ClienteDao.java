package br.com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.jpa.entity.Cliente;

public class ClienteDao {

	private EntityManager entity;

	public ClienteDao(EntityManager entity) {
		this.entity = entity;
	}

	public void salvar(Cliente cliente) {
		try {
			entity.getTransaction().begin();
			entity.persist(cliente);
			entity.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entity.getTransaction().rollback();
		}
	}

	public void update(Cliente cliente) {
		try {
			entity.getTransaction().begin();
			entity.merge(cliente);
			entity.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entity.getTransaction().rollback();
		}
	}

	public void remove(int id) {
		Cliente cliente = selecteById(id);
		if (cliente != null) {
			try {
				this.entity.getTransaction().begin();
				this.entity.remove(cliente);
				this.entity.getTransaction().commit();
			} catch (Exception e) {
				this.entity.getTransaction().rollback();
			}
		}
	}

	public Cliente selecteById(int id) {
		Cliente retornoDoBanco = this.entity.find(Cliente.class, id);
		return retornoDoBanco;
	}

	
	@SuppressWarnings("unchecked")
	public List<Cliente> selectAll() {
		Query query = this.entity.createQuery("select c from Cliente c");
		List<Cliente> todoOsRegistros = query.getResultList();
		return todoOsRegistros;
	}

}













