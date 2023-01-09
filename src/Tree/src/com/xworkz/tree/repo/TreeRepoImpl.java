package com.xworkz.tree.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.tree.dto.TreeDto;

public class TreeRepoImpl implements TreeRepo {

	String username = "root";
	String password = "Xworkzodc@123";
	String host = "jdbc:mysql://localhost:3306/hubli";

	@Override
	public boolean save(TreeDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(host, username, password);

			String query = "INSERT INTO tree VALUES(?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, dto.getName());
			statement.setString(2, dto.getType());
			statement.setString(3, dto.getLocation());
			statement.setInt(4, dto.getHeight());
			statement.setString(5, dto.getTypeOfLeaf());
			statement.setString(6, dto.getShapeOfLeaf());
			statement.setInt(7, dto.getWidth());
			statement.setInt(8, dto.getAge());
			statement.setBoolean(9, dto.isFruitBearing());
			statement.setBoolean(10, dto.isFlowerBearing());

			//statement.executeUpdate();

			//statement.close();
			//connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public TreeDto read() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(host, username, password);

			String query1 = "SELECT * FROM tree WHERE name=?";

			PreparedStatement statement = connection.prepareStatement(query1);

			statement.setString(1, "Sal");

			ResultSet set = statement.executeQuery();
			set.next();
			System.out.println(set.getString("name"));
			System.out.println(set.getString("type"));
			System.out.println(set.getString("location"));
			System.out.println(set.getInt("height"));
			System.out.println(set.getString("type_of_leaf"));
			System.out.println(set.getString("shape_of_leaf"));
			System.out.println(set.getInt("width"));
			System.out.println(set.getInt("age"));
			System.out.println(set.getBoolean("fruit_bearing"));
			System.out.println(set.getBoolean("flower_bearing"));

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

		return null;
	}

}
