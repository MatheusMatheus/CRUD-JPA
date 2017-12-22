package br.com.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public abstract class DAO<T, I extends Serializable> {

	protected EntityManager manager;
	
	private Class<T> persistedClass;
	
	public DAO() {
	}

	public DAO(Class<T> persistedClass, EntityManager manager) {
		this();
		this.persistedClass = persistedClass;
		this.manager = manager;
	}

	public void inserir(T entidade) {
		EntityTransaction t = manager.getTransaction();
		t.begin();
		manager.persist(entidade);
		manager.flush();
		t.commit();
	}
	
	public void atualizar(T entidade) {
		EntityTransaction t = manager.getTransaction();
		t.begin();
		manager.merge(entidade);
		manager.flush();
		t.commit();		
	}
	
	public T encontrar(I id) {
		return manager.find(persistedClass, id);
	}
	
	public void remover(I id) {
		T entidade = encontrar(id);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		T mergedEntity = manager.merge(entidade);
		manager.remove(mergedEntity);
		manager.flush();
		tx.commit();
	}
	
	public List<T> getLista() {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(persistedClass);
		query.from(persistedClass);
		return manager.createQuery(query).getResultList();
	}
}
