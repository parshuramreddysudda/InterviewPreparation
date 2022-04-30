package aircraft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	 String url = "jdbc:oracle:thin@localhost:1521:xe";
	 String username = "root";
	 String password = "student";

	public Connection getConnection() {

		Connection con = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		return con;
	}
}
