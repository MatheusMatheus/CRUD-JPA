package br.com.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.Pessoa;

public class TestaConexao {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD2");
		EntityManager manager = factory.createEntityManager();
		Pessoa p = new Pessoa();
		p.setNome("Matheus");
		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
		factory.close();
	}
}
