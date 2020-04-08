package br.com.startsl.appcad.Acao;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import br.com.startsl.appcad.DAO.UserDAO;
import br.com.startsl.appcad.Model.User;

public class Authentication implements Acao {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException, ParseException {

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();

		if (session.getAttribute("userLog") != null) {
			return "forward:home.jsp";
		}

		UserDAO userDAO = new UserDAO();

		List<User> users = userDAO.getListUser();

		for (User user : users) {
			if (user.getUser().equals(login) && user.getPassword().equals(password)) {

				session.setAttribute("userLog", user.getId());

				return "forward:home.jsp";
			}
		}

		return null;
	}

}
