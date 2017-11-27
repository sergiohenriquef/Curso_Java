package br.com.jpa.dao;

import javax.persistence.EntityManager;

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
	
	

}












