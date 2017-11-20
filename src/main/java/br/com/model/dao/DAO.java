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
	protected EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD2");
	protected EntityManager manager = factory.createEntityManager();
	
	private Class<T> persistedClass;

	public DAO(Class<T> persistedClass) {
		super();
		this.persistedClass = persistedClass;
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
	
	public List<T> getList() {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(persistedClass);
		query.from(persistedClass);
		return manager.createQuery(query).getResultList();
	}
	
	public void close() {
		manager.close();
		factory.close();
	}
	
}
