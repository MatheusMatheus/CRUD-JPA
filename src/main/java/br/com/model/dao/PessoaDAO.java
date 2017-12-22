package br.com.model.dao;

import javax.persistence.EntityManager;

import br.com.model.Pessoa;

public class PessoaDAO extends DAO<Pessoa, Long> {
	
	public PessoaDAO(EntityManager manager){
		super(Pessoa.class, manager);
	}

}
