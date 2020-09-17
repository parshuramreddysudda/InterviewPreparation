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
public class Assignment2 {

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

		      String sql = "SELECT * FROM emp WHERE sal > 1000 AND sal < 2000";
		      ResultSet rs = stmt.executeQuery(sql);
		      System.out.printf("%-10S%-10S%10S%10S\n", "ename", "job", "sal", "comm");
	    		for (int i = 0; i < 50; i++) System.out.print("=");
	    		System.out.println();
	    		
	    		while (rs.next()) {
	    			System.out.printf("%-10s%-10s%10s%10s\n", 
	    				rs.getString("ename"), rs.getString("job"), rs.getDouble("sal"), rs.getDouble("comm"));
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
