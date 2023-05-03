package db;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFasade {

	public static List<String> getBooks() {

		List<String> resault = new ArrayList<String>();

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1234")) {
			System.out.println("Sucsess");
			
			Statement  statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM books.\"BOOKS\"");
			
			while(resultSet.next()) {
				resault.add(resultSet.getString("name"));
			}

		} catch (SQLException e) {
			System.out.println("failed");
			e.printStackTrace();
		}
		return resault;

	}

}
