package br.com.startsl.appcad.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.startsl.appcad.DAO.ClientDAO;
import br.com.startsl.appcad.Model.Client;

public class GetList implements Acao {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException, ParseException {
		
		
			ClientDAO clientDAO = new ClientDAO();
			
			
			List<Client> clients = clientDAO.getList();
				
		
			request.setAttribute("clients", clients);
			
			
		return "forward:home.jsp";
	}

}
