package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateJDBC {

	public static void main(String[] args) {
		try {

			// create connection
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?characterEncoding=latin1",
					"root", "root");

			// createe query
			String q = "create table table1(id int(20) primary key auto_increment, Name varchar(50) not null, city varchar (400))";

			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created in databases");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
