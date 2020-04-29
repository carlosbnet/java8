package br.com.startsl.appcad.Acao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.startsl.appcad.DAO.ClientDAO;

public class Delete implements Acao {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		String idParam = request.getParameter("id");

		Integer id = Integer.parseInt(idParam);

		ClientDAO clientDAO = new ClientDAO();

		clientDAO.delete(id);

		return "redirect:testapp?acao=getlist";
	}

}
