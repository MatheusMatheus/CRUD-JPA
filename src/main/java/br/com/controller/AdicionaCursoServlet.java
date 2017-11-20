package br.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Curso;
import br.com.model.dao.CursoDAO;
import br.com.model.dao.DAO;
import br.com.util.CriaObjetos;

public class AdicionaCursoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		
		try {
			int duracao = Integer.parseInt(request.getParameter("duracao"));
			Curso curso =  CriaObjetos.criaCurso(nome, duracao);
			DAO<Curso, Long> cdao = new CursoDAO();
			cdao.inserir(curso);
		}catch(RuntimeException nfe) {
			throw new ServletException(nfe);
		}
	}

}
