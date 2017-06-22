package br.com.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.Endereco;
import br.com.model.Pessoa;
import br.com.model.dao.PessoaDAO;
import br.com.util.Converter;

public class TestaConexao {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD2");
		EntityManager manager = factory.createEntityManager();

		PessoaDAO dao = new PessoaDAO();

//		Endereco endereco = new Endereco();
//		endereco.setCep("12315135");
//		endereco.setCidade("646546546");
//		endereco.setLogradouro("465464646");
//		endereco.setNumero(5);
//		
//
		Pessoa pessoa = new Pessoa();
//		pessoa.setCpf("123456");
//		pessoa.setNome("Otorrino");
//		pessoa.setEndereco(endereco);
//		pessoa.setTelefone("65465464");
//		pessoa.setDataNasc(Converter.stringToLocalDate("17/05/1997"));
//		pessoa.setSexo('M');
//		
//		dao.inserir(pessoa);
//		
		
		List<Pessoa> pessoas = dao.getLista();
		
		//dao.remove(pessoas.get(1));

		factory.close();
	}
}
