package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Connection.ConnectionFactory;
import Model.Address;

public class AddressDAO {

	ConnectionFactory dataBd = new ConnectionFactory();

	public void createAddressDAO(int idClient, Address addressClient) throws SQLException {

		String sql = "INSERT INTO CAD_CLIENT_ADDRESS (id_client_address,logr_rua,logr_bairro,logr_numero,logr_cidade,logr_estado) VALUES (?,?,?,?,?,?)";

		Connection con = dataBd.connect();

		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, idClient);
		ps.setString(2, addressClient.getLogr_rua());
		ps.setString(3, addressClient.getLogr_bairro());
		ps.setInt(4, addressClient.getLogr_numero());
		ps.setString(5, addressClient.getLogr_cidade());
		ps.setString(6, addressClient.getLogr_estado());

		ps.execute();
		ps.close();
		System.out.println("Cadastro de Endereço do Cliente");
		

	}

}
