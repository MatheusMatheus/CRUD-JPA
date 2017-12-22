package br.com.logica;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Pessoa;
import br.com.model.dao.PessoaDAO;

public class ListaPessoasLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		EntityManager manager = (EntityManager)request.getAttribute("manager");
		PessoaDAO dao = new PessoaDAO(manager);
		
		List<Pessoa> pessoas = dao.getLista();
		request.setAttribute("pessoas", pessoas);
		return "/WEB-INF/jsp/lista-pessoas.jsp";
	}

}
