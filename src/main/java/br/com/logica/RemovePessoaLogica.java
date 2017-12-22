package br.com.logica;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.dao.PessoaDAO;

public class RemovePessoaLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));

		EntityManager manager = (EntityManager)request.getAttribute("manager");
		PessoaDAO dao = new PessoaDAO(manager);
		dao.remover(id);
		
		return "mvc?logica=ListaPessoasLogica";
	}

}
