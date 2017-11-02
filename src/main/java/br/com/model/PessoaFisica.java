package br.com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Pessoa Fisica")
public class PessoaFisica extends Pessoa {

	private String cpf;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "curso_id", referencedColumnName = "id", unique = true)
	private Curso curso;


	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
