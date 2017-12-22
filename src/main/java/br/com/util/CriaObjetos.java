package br.com.util;

import java.time.LocalDate;

import br.com.model.Curso;
import br.com.model.Endereco;
import br.com.model.PessoaFisica;
import br.com.model.PessoaJuridica;

public class CriaObjetos {
	private CriaObjetos() {}
	public static Endereco criaEnd(String cep, String cidade, String logra, int numero) {
		Endereco endereco = new Endereco();
		endereco.setCep(cep);
		endereco.setCidade(cidade);
		endereco.setLogradouro(logra);
		endereco.setNumero(numero);
		return endereco;
	}

	public static Curso criaCurso(String nome, int duracao) {
		Curso curso = new Curso();
		curso.setDuracao(duracao);
		curso.setNome(nome);
		return curso;
	}

	public static PessoaFisica criaPF(Endereco end, String nome, String tel, String cpf, String email, LocalDate dtNasc) {
		PessoaFisica p = new PessoaFisica(nome, tel, email, dtNasc);
		p.setEndereco(end);
		p.setCpf(cpf);
		return p;
	}

	public static PessoaJuridica criaPJ(Endereco end, String nome, String tel, String cnpj, String email) {
		PessoaJuridica pj = new PessoaJuridica(nome, tel, email);
		pj.setCnpj(cnpj);
		pj.setEndereco(end);
		return pj;
	}
}
