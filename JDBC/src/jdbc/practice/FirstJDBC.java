package jdbc.practice;

import java.sql.*;

public class FirstJDBC {

	public static void main(String[] args) {
		try {

			// load the driver
			Class.forName("com.mysql.jdbc.Driver");

			// creating connection
			/*
			 * String url="jdbc:mysql://localhost:3306/youtube"; String username="root";
			 * String password="root";
			 */

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?characterEncoding=latin1", "root", "root");

			if (con.isClosed()) {
				System.out.println("connection is closed.........");

			} else {
				System.out.println("connection created..........");

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
