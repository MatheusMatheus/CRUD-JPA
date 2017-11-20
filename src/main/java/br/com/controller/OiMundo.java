package br.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiMundo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Exemplo com InitParam Servlet</h2>");
		ServletConfig config = getServletConfig();
		String parametro1 = config.getInitParameter("param1");
		out.println("Valor do parâmetro 1: " + parametro1);
		String parametro2 = config.getInitParameter("param2");
		out.println("<br>Valor do parâmetro 1: " + parametro2);
		out.close();
	}
}
