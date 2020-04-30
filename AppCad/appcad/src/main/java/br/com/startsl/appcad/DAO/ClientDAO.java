package br.com.startsl.appcad.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import br.com.startsl.appcad.Connection.ConnectionFactory;
import br.com.startsl.appcad.Model.Address;
import br.com.startsl.appcad.Model.Client;

public class ClientDAO {

	// Cria um obejto para trabalhar com o banco de dados
	ConnectionFactory dataBd = new ConnectionFactory();

	// metodo para criar um novo cliente e cadastra o endereco em outra tabela
	public void createClient(Client client) throws SQLException {

		String sql = "INSERT INTO CADCLIENT(nome,data_nascimento,telefone,email,cpf) VALUES (?,?,?,?,?)";

		Connection con = dataBd.connect();// Retorna o tipo connection

		// prepara a string para mandar para o banco
		PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// set os atributos dentro do obj PrepareStatement
		ps.setString(1, client.getName());
		ps.setDate(2, (Date) client.getDate_of_birth());
		ps.setString(3, client.getTelephone());
		ps.setString(4, client.getEmail());
		ps.setString(5, client.getCpf());

		ps.execute();

		final ResultSet rs = ps.getGeneratedKeys();

		int idClient = 0;

		if (rs.next()) {
			idClient = rs.getInt("id_client");
		}

		ps.close();

		// Joga para o ojb grava o endereco
		AddressDAO ad = new AddressDAO();

		ad.createAddressDAO(idClient, client.getAddress());

		System.out.println("Cadastro de Cliente");

	}

	// Deleta as informações do Cliente
	public void delete(Integer id) throws SQLException {

		String sql = "DELETE CAD_CLIENT_ADDRESS.*, CADCLIENT.*\n" + "        FROM CAD_CLIENT_ADDRESS, CADCLIENT\n"
				+ "        WHERE CADCLIENT.id_client = " + id + " \n"
				+ "        AND CAD_CLIENT_ADDRESS.id_client_address =" + id;

		Connection con = dataBd.connect();

		PreparedStatement ps = con.prepareStatement(sql);

		ps.execute();

		con.close();
		System.out.println("Exluido");

	}

	// Busca Cliente com base no Id

	public Client get(Integer idClient) throws SQLException {

		Connection con = dataBd.connect();

		Client client = new Client();

		String sql = "SELECT * FROM CADCLIENT WHERE id_client = ?";
		/*
		 * String sql = "SELECT CAD_CLIENT_ADDRESS.*, CADCLIENT.*\n" +
		 * "        FROM CAD_CLIENT_ADDRESS JOIN CADCLIENT\n" +
		 * "        ON CADCLIENT.id_client = CAD_CLIENT_ADDRESS.id_client_address \n" +
		 * "        WHERE CADCLIENT.id_client = "+id+" \n";
		 */

		PreparedStatement ps = con.prepareStatement(sql); //Usamos este metodo para evitar SQL Injection

		ps.setInt(1, idClient);

		ps.execute();

		ResultSet rs = ps.getResultSet();

		if (rs.next()) {

			client.setName(rs.getString("nome"));
			client.setCpf(rs.getString("cpf"));
			client.setDate_of_birth(rs.getDate("data_nascimento"));
			client.setEmail(rs.getString("email"));
			client.setTelephone(rs.getString("telefone"));
			client.setIdClient(idClient);

			ps.close();

			AddressDAO addressDAO = new AddressDAO();

			Address address = addressDAO.getAddress(idClient);

			client.setAddress(address);

			System.out.println("Nome: " + client.getName());
			return client;

		} else {
			System.out.println("Client not Found");
			ps.close();
			return null;
		}

	}

	public List<Client> getList() throws SQLException {

		Connection con = dataBd.connect();

		

		Address address = new Address();

		AddressDAO addressDAO = new AddressDAO();

		List<Client> clients = new ArrayList<>();

		String sql = "SELECT * FROM CADCLIENT";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.execute();

		ResultSet rs = ps.getResultSet();

		while (rs.next()) {

			Client client = new Client();
			
			client.setIdClient(rs.getInt("id_client"));

			address = addressDAO.getAddress(client.getIdClient());

			client.setAddress(address);

			client.setName(rs.getString("nome"));
			client.setCpf(rs.getString("cpf"));
			client.setDate_of_birth(rs.getDate("data_nascimento"));
			client.setEmail("email");
			client.setTelephone("telefone");

			clients.add(client);
			
			client = null;

		}

	

		ps.close();
		return clients;

	}

	public void updateClient(Client client) throws SQLException {

		String sql = "UPDATE CADCLIENT SET nome=?,data_nascimento=?,telefone=?,email=?,cpf=? WHERE id_client=?";

		Connection con = dataBd.connect();// Retorna o tipo connection

		// prepara a string para mandar para o banco
		PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// set os atributos dentro do obj PrepareStatement
		ps.setString(1, client.getName());
		ps.setDate(2, (Date) client.getDate_of_birth());
		ps.setString(3, client.getTelephone());
		ps.setString(4, client.getEmail());
		ps.setString(5, client.getCpf());
		ps.setInt(6, client.getIdClient());

		ps.execute();

		ps.close();

		// Joga para o ojb alterar o endereco
		AddressDAO addressDAO = new AddressDAO();

		addressDAO.updateAddress(client.getIdClient(), client.getAddress());

		System.out.println("Update do Cliente");

	}

}
