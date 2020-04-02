package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import Connection.ConnectionFactory;
import Model.Address;
import Model.Client;

public class ClientDAO {

	
	ConnectionFactory dataBd = new ConnectionFactory();
	
	
	public void createClient(Client client, Address addressClient) throws SQLException {
		
		String sql = "INSERT INTO CADCLIENT(nome,data_nascimento,telefone,email,cpf) VALUES (?,?,?,?,?)";
				
		Connection con = dataBd.connect();
		
		PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		
		ps.setString(1, client.getName());
		ps.setDate(2, (Date) client.getDate_of_birth());
		ps.setString(3, client.getTelephone());
		ps.setString(4, client.getEmail());
		ps.setString(5, client.getCpf());
	
		ps.execute();
		
		final ResultSet rs = ps.getGeneratedKeys();
		
		int idClient = 0;
		
		if(rs.next()) {
			idClient = rs.getInt("id_client");
		}
		
		AddressDAO ad = new AddressDAO();
		
		ad.createAddressDAO(idClient, addressClient);
		
		ps.close();
		
		System.out.println("Cadastro de Cliente");
		
	}
	
	
	
}
