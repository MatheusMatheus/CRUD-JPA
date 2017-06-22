package br.com.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.model.EntidadeAutent;

public class PessoaDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD2");
	private EntityManager manager = factory.createEntityManager();
	
	public void inserir(EntidadeAutent entidade) {
		manager.getTransaction().begin();
		manager.persist(entidade);
		manager.getTransaction().commit();
	}
	
	
	public EntidadeAutent buscar(EntidadeAutent entidade) {
		return manager.find(EntidadeAutent.class, entidade.getId());
	}
	
	public void atualizar(EntidadeAutent entidade) {
		EntidadeAutent p = buscar(entidade);
		inserir(p);
	}
	
	public List<EntidadeAutent> listar() {
		TypedQuery<EntidadeAutent> query = manager.createQuery("SELECT p from Pessoa p", EntidadeAutent.class);
		return query.getResultList();
	}
}
