package br.com.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD2");
	EntityManager manager = factory.createEntityManager();
	
	public void close() {
		manager.close();
		factory.close();
	}
}
