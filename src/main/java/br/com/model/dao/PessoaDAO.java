package br.com.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.model.EntidadeAutent;
import br.com.model.Pessoa;

public class PessoaDAO extends DAO {
	
	public PessoaDAO(){}
	
	public void inserir(Pessoa entidade) {
		manager.getTransaction().begin();
		manager.persist(entidade);
		manager.getTransaction().commit();
	}
	
	public Pessoa buscar(Pessoa pessoa) {
		return manager.find(Pessoa.class, pessoa.getId());
	}
	
	public void atualizar(Pessoa entidade) {
		Pessoa p = buscar(entidade);
		inserir(p);
	}
	
	public List<Pessoa> getLista() {
		TypedQuery<Pessoa> query = manager.createQuery("SELECT p from Pessoa p", Pessoa.class);
		//CriteriaBuilder builder = manager.getCriteriaBuilder();
		//CriteriaQuery<Pessoa> query = builder.createQuery(Pessoa.class);
		//query.from(Pessoa.class);
		return query.getResultList();
	}
	
	public void remove(Pessoa pessoa) {
		manager.getTransaction().begin();
		manager.remove(buscar(pessoa));
		manager.getTransaction().commit();
	}
}
