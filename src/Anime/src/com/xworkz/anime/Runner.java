package com.xworkz.anime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {

		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/hubli";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(host, username, password);

			String query = "SELECT * FROM anime WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 2);

			ResultSet result = statement.executeQuery();
			result.next();
			int id = result.getInt("id");
			String name = result.getString("name");
			int year = result.getInt("yearOfRelease");
			int character = result.getInt("noOfCharacters");
			int budget = result.getInt("budget");

			System.out.println(id);
			System.out.println(name);
			System.out.println(year);
			System.out.println(character);
			System.out.println(budget);

			statement.executeQuery();
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
