package br.com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {
	
	public static EntityManager getEntity() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("projetoFinal");
		return factory.createEntityManager();
	}

}
