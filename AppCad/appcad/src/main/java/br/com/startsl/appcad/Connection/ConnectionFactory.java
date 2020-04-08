package br.com.startsl.appcad.Connection;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private final String user = "carlos";
	private final String password = "carlos415263";
	private final String url = "jdbc:mariadb://localhost:3306/appcad";
	
	private DataSource dataSource;
	
	
	//cria a conexao com o banco de dados
	public ConnectionFactory() {
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		
		comboPooledDataSource.setJdbcUrl(url);
		comboPooledDataSource.setUser(user);
		comboPooledDataSource.setPassword(password);
		
		this.dataSource = comboPooledDataSource;
		
		
	}
	
	//retorna uma conexao para menuseio 
	public Connection connect() throws SQLException {
		
		return dataSource.getConnection();
				
	}
	
	
	
}
