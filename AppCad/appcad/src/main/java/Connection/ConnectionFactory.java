package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private final String user = "carlos";
	private final String password = "carlos415263";
	private final String url = "jdbc:mariadb://localhost:3306/appcad";
	private Statement stm=null;
	private DataSource dataSource;
	
	
	public ConnectionFactory() {
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		
		comboPooledDataSource.setJdbcUrl(url);
		comboPooledDataSource.setUser(user);
		comboPooledDataSource.setPassword(password);
		
		this.dataSource = comboPooledDataSource;
		
		
	}
	
	public Connection connect() throws SQLException {
		
		
		return dataSource.getConnection();
				
	}
	
	
	
}
