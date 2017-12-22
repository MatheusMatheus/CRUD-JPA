package br.com.logica;

import java.io.IOException;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Endereco;
import br.com.model.Pessoa;
import br.com.model.dao.PessoaDAO;
import br.com.util.Converter;
import br.com.util.CriaObjetos;

public class CadastraPessoaLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String cep = request.getParameter("cep");
		String logradouro = request.getParameter("logradouro");
		int numero = Integer.parseInt(request.getParameter("numero"));
		String cidade = request.getParameter("cidade");
		String cpf = request.getParameter("cpf");
		LocalDate dataNasc = Converter.stringToLocalDate(request.getParameter("dataNasc"));
		String email = request.getParameter("email");
		char sexo = request.getParameter("sexo").charAt(0);

		Endereco endereco = CriaObjetos.criaEnd(cep, cidade, logradouro, numero);
		Pessoa pessoa = CriaObjetos.criaPF(endereco, nome, telefone, cpf, email, dataNasc);
		
		EntityManager manager = (EntityManager)request.getAttribute("manager");
		PessoaDAO dao = new PessoaDAO(manager);
		dao.inserir(pessoa);
		
		return "mvc?logica=ListaPessoasLogica";
	}
}
