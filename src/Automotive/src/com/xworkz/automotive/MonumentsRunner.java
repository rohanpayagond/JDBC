package com.xworkz.automotive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MonumentsRunner {

	public static void main(String[] args) {
		
		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/hubli";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query = "INSERT INTO monuments VALUES(?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 2);
			statement.setString(2, "BURJ KHALIFA");
			statement.setString(3, "DUBAI");
			statement.setInt(4, 400);
			
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
