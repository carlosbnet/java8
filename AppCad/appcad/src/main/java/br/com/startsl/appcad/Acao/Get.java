package br.com.startsl.appcad.Acao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.startsl.appcad.DAO.ClientDAO;
import br.com.startsl.appcad.Model.Client;

public class Get implements Acao {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		String idParam = request.getParameter("id");

		Integer id = Integer.parseInt(idParam);

		ClientDAO clientDAO = new ClientDAO();

		Client client = clientDAO.get(id);
		
		request.setAttribute("client", client);

		return "forward:alterclient.jsp";
	}

}
