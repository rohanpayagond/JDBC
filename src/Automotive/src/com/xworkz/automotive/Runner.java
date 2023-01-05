package com.xworkz.automotive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {
		
		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/rohan";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query = "INSERT INTO institute VALUES(?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 2);
			statement.setString(2, "KODNEST");
			statement.setString(3, "RAMNAGAR");
			statement.setInt(4, 35);
			statement.setInt(5, 6);
			
			statement.executeUpdate();
			
			
			statement.close();
			connection.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
