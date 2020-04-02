package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connection.ConnectionFactory;
import DAO.ClientDAO;
import Model.Address;
import Model.Client;

/**
 * Servlet implementation class TestApp
 */
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String dataString = "19/11/1990";
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date data = null;
	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		
		
		
		
		
		try {
			 data = dateFormat.parse(dataString);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		java.sql.Date dataSql = new java.sql.Date(data.getTime());
			
		
		
	Address address = new Address("Celso magalahes", "centro", 440, "viana", "MA");	
		 
	Client client = new Client("Carlos Vandson", dataSql, "04688615302", "991137833", "carlos.b.net@hotmail.com", address);
	
	ClientDAO clientDao = new ClientDAO();
	
	try {
		clientDao.createClient(client, address);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
		

	}
	
	
	
	
	

}
