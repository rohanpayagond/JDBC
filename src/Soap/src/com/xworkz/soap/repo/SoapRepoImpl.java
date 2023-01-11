package com.xworkz.soap.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.soap.constants.SqlCredentials;
import com.xworkz.soap.dto.SoapDto;

public class SoapRepoImpl implements SoapRepo {

	@Override
	public boolean save(SoapDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "INSERT INTO soap VALUES (?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getPrice());
			statement.setString(4, dto.getColor());
			statement.setString(5, dto.getFragrance());
			statement.setDouble(6, dto.getWeight());
			statement.setInt(7, dto.getManufacturedDate());
			statement.setString(8, dto.getType());

//			statement.execute();
//			statement.close();
//			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<SoapDto> read() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "SELECT * FROM soap;";

			PreparedStatement statement = connection.prepareStatement(query);

			List<SoapDto> list = new ArrayList<SoapDto>();
			ResultSet set = statement.executeQuery();

			while (set.next()) {
				int id = set.getInt("id");
				String name = set.getString("name");
				int price = set.getInt("price");
				String color = set.getString("color");
				String frag = set.getString("fragrance");
				int weight = set.getInt("weight");
				int date = set.getInt("manufacturedDate");
				String type = set.getString("type");

				SoapDto dto1 = new SoapDto(id, name, price, color, frag, weight, date, type);
				list.add(dto1);

			}
//			statement.close();
//			connection.close();
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapDto findByNameAndPrice(String name, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "SELECT * FROM soap WHERE name=? AND price=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, price);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				int id = set.getInt("id");
				String name1 = set.getString("name");
				int price1 = set.getInt("price");
				String color = set.getString("color");
				String frag = set.getString("fragrance");
				int weight = set.getInt("weight");
				int date = set.getInt("manufacturedDate");
				String type = set.getString("type");

				SoapDto dto = new SoapDto(id, name1, price1, color, frag, weight, date, type);
				return dto;
			}
//			statement.close();
//			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateNameByPrice(String name, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "UPDATE soap SET  name=? WHERE price=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, price);

//			statement.executeUpdate();
//			statement.close();
//			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateColorAndFragranceByName(String color, String fragrance, String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "UPDATE soap SET color=?, fragrance=? WHERE name=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, color);
			statement.setString(2, fragrance);
			statement.setString(3, name);

//			statement.executeUpdate();
//			statement.close();
//			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateTypeById(String type, int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "UPDATE soap SET  type=? WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, type);
			statement.setInt(2, id);

//			statement.executeUpdate();
//			statement.close();
//			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteById(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "DELETE FROM soap WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, id);

			statement.executeUpdate();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
