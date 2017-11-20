package br.com.util;

import br.com.model.Curso;
import br.com.model.Endereco;
import br.com.model.PessoaFisica;
import br.com.model.PessoaJuridica;

public class CriaObjetos {
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

	public static PessoaFisica criaPF(Endereco end, String nome, String tel, String cpf) {
		PessoaFisica p = new PessoaFisica();
		p.setEndereco(end);
		p.setNome(nome);
		p.setTelefone(tel);
		p.setCpf(cpf);
		return p;
	}

	public static PessoaJuridica criaPJ(Endereco end, String nome, String tel, String cnpj) {
		PessoaJuridica pj = new PessoaJuridica();
		pj.setCnpj(cnpj);
		pj.setEndereco(end);
		pj.setNome(nome);
		pj.setTelefone(tel);
		return pj;
	}
}
