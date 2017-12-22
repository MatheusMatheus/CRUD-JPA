package br.com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cid;
	private String nome;
	private int duracao;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	// Criará uma tabela associativa
	@JoinTable(
			// Nome da tabela associativa
			name = "curso_pessoa",

			// Configurações da primeira coluna da tab. assoc.
			joinColumns = @JoinColumn(
					// Nome do campo
					name = "curso_id",

					// Nome do campo da tabela/classe a que se refere.
					// Este id é da classe Curso
					referencedColumnName = "cid"),

			// Configurações da segunda coluna da tab. assoc.
			inverseJoinColumns = @JoinColumn(
					// Nome do campo
					name = "pessoa_id",

					// Nome do campo da tabela/classe a que se refere.
					// Este id é da classe PessoaFisica
					referencedColumnName = "id"))
	private Set<Pessoa> pessoas;

	public Curso() {
		this.pessoas = new HashSet<Pessoa>();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nID: " + getId());
		sb.append("\nNome: " + getNome());
		sb.append("\nDuração: " + getDuracao());
		return sb.toString();
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public Set<Pessoa> getPessoas() {
		return pessoas;
	}

	public long getId() {
		return cid;
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
