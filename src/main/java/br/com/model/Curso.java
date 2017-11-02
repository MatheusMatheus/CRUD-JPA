package br.com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int duracao;

	@OneToMany(mappedBy = "curso")
	private List<PessoaFisica> pessoas;

	public Curso() {
		this.pessoas = new ArrayList<PessoaFisica>();
	}

	public void adiciona(PessoaFisica p) {
		getPessoas().add(p);
		p.setCurso(this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nID: " + getId());
		sb.append("\nNome: " + getNome());
		sb.append("\nDuração: " + getDuracao());
		sb.append("\nPessoas\n" + getPessoas());
		return super.toString();
	}

	public long getId() {
		return id;
	}

	public List<PessoaFisica> getPessoas() {
		return pessoas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
