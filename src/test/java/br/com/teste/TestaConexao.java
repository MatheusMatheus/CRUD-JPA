package br.com.teste;

import java.util.List;

import br.com.model.Curso;
import br.com.model.Endereco;
import br.com.model.Pessoa;
import br.com.model.PessoaFisica;
import br.com.model.PessoaJuridica;
import br.com.model.dao.CursoDAO;
import br.com.model.dao.DAO;
import br.com.model.dao.PessoaDAO;
import br.com.util.CriaObjetos;

public class TestaConexao {
	
	;
	public static void main(String[] args) {
		Endereco end1 = CriaObjetos.criaEnd("72302108", "Taguatinga", "Rua dos bobos", 0);
		
		Curso c1 = CriaObjetos.criaCurso("Enchedor de pneu de trem", 658);
		PessoaFisica pf1 = CriaObjetos.criaPF(end1, "Matheus", "953295623", "04408803197");
		pf1.addCurso(c1);
		
	
		Curso c2 = CriaObjetos.criaCurso("Curso teste", 65465);
		DAO<Curso, Long> daoTeste = new CursoDAO();
		daoTeste.inserir(c2);
		
		//PessoaDAO dao = new PessoaDAO();
		//dao.inserir(pf1);
		
		List<Curso> cursos = daoTeste.getList();
		for(Curso c : cursos) {
			System.out.println(c);
		}
		
	}
}
