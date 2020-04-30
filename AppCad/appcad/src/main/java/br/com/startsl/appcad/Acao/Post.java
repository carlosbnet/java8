package br.com.startsl.appcad.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.startsl.appcad.DAO.ClientDAO;
import br.com.startsl.appcad.Model.Address;
import br.com.startsl.appcad.Model.Client;

public class Post implements Acao {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException, ParseException {
		
		
		// Variaveis da WEB - dados pessoais

		String name = request.getParameter("name");
		String date_Of_Birth = request.getParameter("date_of_birth");
		String cpf = request.getParameter("cpf");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");

		System.out.println(date_Of_Birth);
		
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date dataFormatada = sdf.parse(date_Of_Birth);
		
		
		java.sql.Date dataFomatSql = new java.sql.Date(dataFormatada.getTime());
		
		
		// Variaveis de endereco
		
		

		String logr_rua = request.getParameter("logr_rua");
		String logr_bairro = request.getParameter("logr_bairro");
		String logr_numero = request.getParameter("logr_numero");
		String logr_cidade = request.getParameter("logr_cidade");
		String logr_estado = request.getParameter("logr_estado");

		
		//trata o formato da data para sql
		


		Address address = new Address();
		
		address.setLogr_rua(logr_rua);
		address.setLogr_bairro(logr_bairro);
		address.setLogr_numero(Integer.parseInt(logr_numero));
		address.setLogr_cidade(logr_cidade);
		address.setLogr_estado(logr_estado);
		

		Client client = new Client();
		
		client.setName(name);
		client.setAddress(address);
		client.setCpf(cpf);
		client.setDate_of_birth(dataFomatSql);
		client.setEmail(email);
		client.setTelephone(telephone);
		

		ClientDAO clientDao = new ClientDAO();
		
		System.out.println("Entrou");
		
		//Manda

			clientDao.createClient(client);
		

			return "redirect:testapp?acao=getlist";
	}

}
