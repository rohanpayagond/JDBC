package com.xworkz.shoe.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shoe.credentials.SqlCredentials;
import com.xworkz.shoe.dto.ShoeDto;

public class ShoeRepoImpl implements ShoeRepo {

	@Override
	public boolean save(ShoeDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "INSERT INTO shoe VALUES (?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrand());
			statement.setInt(3, dto.getPrice());
			statement.setString(4, dto.getColor());
			statement.setString(5, dto.getType());

//			statement.executeUpdate();
//			statement.close();
//			connection.close();

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
	public ShoeDto read() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "SELECT * FROM shoe WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 1);

			ResultSet set = statement.executeQuery();

			set.next();
			int id = set.getInt("id");
			String brand = set.getString("brand");
			int price = set.getInt("price");
			String color = set.getString("color");
			String type = set.getString("type");

			ShoeDto dto = new ShoeDto(id, brand, price, color, type);
			System.out.println(dto);

//			statement.close();
//			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ShoeDto findByBrand(String brand) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "SELECT * FROM shoe WHERE brand=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, brand);

			ResultSet set = statement.executeQuery();

			set.next();
			int id = set.getInt("id");
			String brand1 = set.getString("brand");
			int price = set.getInt("price");
			String color = set.getString("color");
			String type = set.getString("type");

			ShoeDto dto = new ShoeDto(id, brand1, price, color, type);
			System.out.println(dto);

//			statement.close();
//			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ShoeDto findByIdAndPrice(int id, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "SELECT * FROM shoe WHERE id=? AND price=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, id);
			statement.setInt(2, price);

			ResultSet set = statement.executeQuery();

			set.next();
			int id1 = set.getInt("id");
			String brand1 = set.getString("brand");
			int price1 = set.getInt("price");
			String color1 = set.getString("color");
			String type1 = set.getString("type");

			ShoeDto dto = new ShoeDto(id1, brand1, price1, color1, type1);
			System.out.println(dto);

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
