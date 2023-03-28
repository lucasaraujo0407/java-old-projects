package br.com.alura.jdbc;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Database {
	
	static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja-virtual-alura", "root", "");		
		return connection;
	}
	
}
