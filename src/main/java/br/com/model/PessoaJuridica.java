package br.com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pessoa Juridica")
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, String telefone, String email) {
		super(nome, telefone, email);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
