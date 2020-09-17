import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "hr");
			 Statement stmt = conn.createStatement();

		      String sql = "Select EMPLOYEE_ID, LAST_NAME from employees";
		      ResultSet rs = stmt.executeQuery(sql);
	            while(rs.next()){
	              System.out.println(rs.getInt(1) + "\t" + rs.getString("LAST_NAME"));
	            }
		
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
