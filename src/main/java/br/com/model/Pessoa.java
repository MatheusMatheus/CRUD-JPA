package br.com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Pessoa")
public class Pessoa extends EntidadeAutent {
	private String nome;
	private String telefone;
	private String email;
	@Embedded
	private Endereco endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String telefone, String email) {
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
	}	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: " + getNome());
		sb.append("\nTelefone: " + getTelefone());
		sb.append("Endereco\n" + getEndereco());
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
