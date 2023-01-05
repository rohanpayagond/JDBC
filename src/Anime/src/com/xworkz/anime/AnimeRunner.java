package com.xworkz.anime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimeRunner {

	public static void main(String[] args) {
		
		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/hubli";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query = "INSERT INTO anime VALUES(?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 2);
			statement.setString(2, "Bleach");
			statement.setInt(3, 2012);
			statement.setInt(4, 40);
			statement.setInt(5, 48);
			
			statement.setInt(1, 3);
			statement.setString(2, "DeathNote");
			statement.setInt(3, 2015);
			statement.setInt(4, 52);
			statement.setInt(5, 25);
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
