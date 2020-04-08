package br.com.startsl.appcad.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.startsl.appcad.Connection.ConnectionFactory;
import br.com.startsl.appcad.Model.Address;

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

	
	
	
	

	public void updateAddress(Integer idClient, Address addressClient) throws SQLException {
		
		
		String sql = "UPDATE CAD_CLIENT_ADDRESS SET logr_rua=?,logr_bairro=?,"
				+ "logr_numero=?,logr_cidade=?,logr_estado=?"
				+ " WHERE id_client_address = ?";

		
		
		Connection con = dataBd.connect();

		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ps.setString(1, addressClient.getLogr_rua());
		ps.setString(2, addressClient.getLogr_bairro());
		ps.setInt(3, addressClient.getLogr_numero());
		ps.setString(4, addressClient.getLogr_cidade());
		ps.setString(5, addressClient.getLogr_estado());
		ps.setInt(6, idClient);

		
		ps.execute();
		ps.close();
		
		System.out.println("Endereço do Cliente Atualizado");
		
		
		
	}




	public Address getAddress(Integer idClient) throws SQLException {
	
		Connection con = dataBd.connect();
		
		Address address = new Address();
		
		String sql = "SELECT * FROM CAD_CLIENT_ADDRESS WHERE id_client_address = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, idClient);
		
		ps.execute();
		
		ResultSet rs = ps.getResultSet();
		
		if(rs.next()) {
			
			address.setId_client(idClient);
			address.setLogr_rua(rs.getString("logr_rua"));
			address.setLogr_bairro(rs.getString("logr_bairro"));
			address.setLogr_numero(rs.getInt("logr_numero"));
			address.setLogr_cidade(rs.getString("logr_cidade"));
			address.setLogr_estado(rs.getString("logr_estado"));
			System.out.println("Endereço Encontrado");
			return address;
		}else {
			System.out.println("Endereço não Encontrado");
			return null;
		}
		
		
		
		
	}



	
	
	

}
