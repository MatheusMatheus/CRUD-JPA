<%@page import="java.util.List"%>
<%@page import="br.com.model.Curso"%>
<%@page import="br.com.model.dao.CursoDAO"%>
<%@page import="br.com.model.dao.DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<%
		DAO<Curso, Long> dao = new CursoDAO();
		List<Curso> cursos = dao.getList();
		
		for(Curso c : cursos) {
		%>
		<tr>
			<td><%c.getNome(); %></td>
			<td><%c.getDuracao(); %></td>
		</tr>
	<%	
		}
	%>
	</table>
</body>
</html>