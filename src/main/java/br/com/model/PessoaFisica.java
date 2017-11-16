package br.com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("Pessoa Fisica")
public class PessoaFisica extends Pessoa {

	private String cpf;

	// pessoas se refere à lista de pessoas na classe Curso
	@ManyToMany(mappedBy="pessoas", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Curso> cursos;
	
	public PessoaFisica() {
		this.cursos = new HashSet<Curso>();
	}
	
	public void addCurso(Curso curso) {
		getCursos().add(curso);
		curso.getPessoas().add(this);
	}
	
	public void removerCurso(Curso curso) {
		getCursos().remove(curso);
		curso.getPessoas().remove(this);
	}
	
	public void remove() {
		for(Curso c : new HashSet<Curso>()) {
			removerCurso(c);
		}
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
