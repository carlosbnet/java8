package br.com.startsl.appcad.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.startsl.appcad.Connection.ConnectionFactory;
import br.com.startsl.appcad.Model.User;

public class UserDAO {

	ConnectionFactory dataBd = new ConnectionFactory();
	
	
	
	public List<User> getListUser() throws SQLException {


		Connection con = dataBd.connect(); //Criamos a nossa conexao com o Banco de dados
		
		List<User> users = new ArrayList<>(); //Declaramos uma variavel do tipo List e ja inicializamos com um ArrayList

		String sql = "SELECT * FROM USER_LOGIN"; //SQL padrao de busca

		PreparedStatement ps = con.prepareStatement(sql); //Preparação da nossa query para evitar SQL Injetcion

		ps.execute(); //Exculta a Query

		ResultSet rs = ps.getResultSet(); //Retorna o resultado e com o tipo ResultSet
				

		while (rs.next()) { //Laço para iteração no ResultSet

			User user = new User();

			//Setar os atributos
			
			user.setId(rs.getInt("id_user"));
			user.setUser(rs.getString("user"));
			user.setPassword(rs.getString("password"));
			
			users.add(user);

			user = null;

		}

		ps.close();
		return users;

	}

}
