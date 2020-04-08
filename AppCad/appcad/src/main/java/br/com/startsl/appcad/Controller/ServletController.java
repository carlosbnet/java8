package br.com.startsl.appcad.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.startsl.appcad.Acao.Authentication;
import br.com.startsl.appcad.Acao.Delete;
import br.com.startsl.appcad.Acao.Get;
import br.com.startsl.appcad.Acao.GetList;
import br.com.startsl.appcad.Acao.Post;
import br.com.startsl.appcad.Acao.Update;


/**
 * Servlet implementation class ServletController
 */
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		String redirect=null;
		
		switch (acao) {

		case "post":

			try {
				redirect = new Post().execute(request, response);
			} catch (ServletException | IOException | SQLException | ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			break;

		case "delete":

			try {
				redirect = new Delete().execute(request, response);
			} catch (ServletException | IOException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

			break;
		case "get":

			try {
				redirect = new Get().execute(request, response);
			} catch (ServletException | IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			break;

		case "update":

			try {
				redirect = new Update().execute(request, response);
			} catch (ServletException | IOException | ParseException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case "getlist":

			try {
				redirect = new GetList().execute(request, response);
			} catch (ServletException | IOException | SQLException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
			
		case "login":
			
			try {
				redirect = new Authentication().execute(request, response);
			} catch (ServletException | IOException | SQLException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			

		default:
			break;
		}

		
		String[] typeRedirect = redirect.split(":");

		if (typeRedirect[0].equals("forward")) {

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + typeRedirect[1]);
			rd.forward(request, response);

		} else {
			response.sendRedirect(typeRedirect[1]);
		}
		
		
		
	}

}
