package br.com.model.dao;

import br.com.model.Pessoa;

public class PessoaDAO extends DAO<Pessoa, Long> {
	
	public PessoaDAO(){
		super(Pessoa.class);
	}

}
