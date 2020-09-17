import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
Connection conn = null;
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("Connection Established successfully");
		
		} 
		catch (SQLException e) {
			System.out.println(e);
		} 
		catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			if (conn != null) conn.close();
		}
		

	}

}
