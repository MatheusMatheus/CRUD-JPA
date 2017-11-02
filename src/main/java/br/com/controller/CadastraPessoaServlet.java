package br.com.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Endereco;
import br.com.model.Pessoa;
import br.com.model.dao.PessoaDAO;
import br.com.util.Converter;


@WebServlet("/cadastro")
public class CadastraPessoaServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String cep = request.getParameter("cep");
		String logradouro = request.getParameter("logradouro");
		int numero = Integer.parseInt(request.getParameter("numero"));
		String cidade = request.getParameter("cidade");
		String cpf = request.getParameter("cpf");
		LocalDate dataNasc = Converter.stringToLocalDate(request.getParameter("dataNasc"));
		char sexo = request.getParameter("sexo").charAt(0);
		
		Endereco endereco = new Endereco();
		endereco.setCep(cep);
		endereco.setCidade(cidade);
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setTelefone(telefone);
		pessoa.setEndereco(endereco);
		
		PessoaDAO dao = new PessoaDAO();
		dao.inserir(pessoa);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("lista-pessoas.jsp");
		dispatcher.forward(request, response);
		
	}
}
