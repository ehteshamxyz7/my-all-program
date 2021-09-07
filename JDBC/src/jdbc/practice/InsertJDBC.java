package jdbc.practice;

import java.sql.*;

public class InsertJDBC {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?characterEncoding=latin1",
					"root", "root");

			String q = "insert into table1 (name,city) values (?,?)";

			// set the preparedStatement object
			PreparedStatement psmt = con.prepareStatement(q);

			// set the value of query
			psmt.setString(1, "mahi");
			psmt.setString(2, "msjS");

			psmt.executeUpdate();
			System.out.println("inserted............");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
