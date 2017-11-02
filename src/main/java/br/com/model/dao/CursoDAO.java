package br.com.model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.model.Curso;

public class CursoDAO extends DAO{
	public void inserir(Curso curso) {
		manager.getTransaction().begin();
		manager.persist(curso);
		manager.getTransaction().commit();
	}

	public List<Curso> getLista() {
		TypedQuery<Curso> query = manager.createQuery("Select c from Curso c", Curso.class);
		return query.getResultList();
	}
}
