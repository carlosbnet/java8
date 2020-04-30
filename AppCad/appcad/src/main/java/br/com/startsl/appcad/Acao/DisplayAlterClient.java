package br.com.startsl.appcad.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayAlterClient implements Acao {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException, ParseException {
		
		
		String paramId= request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		
		
		
		return "forward:alterclient.jsp";
	}

}