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
public class Assignment4 {

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
			  Statement stmt = conn.createStatement();

		      String sql = "DESCRIBE employee";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         String Field  = rs.getString("Field");
		         String Type = rs.getString("Type");
		         String Null = rs.getString("Null");
		         String Key = rs.getString("Key");
		         String Default = rs.getString("Default");
		         String extra = rs.getString("extra");

		         //Display values
		         System.out.print("Field: " + Field);
		         System.out.print("; Type: " + Type);
		         System.out.print("; Null: " + Null);
		         System.out.print("; Key: " + Key);
		         System.out.print(", Default: " + Default);
		         System.out.println("; extra: " + extra);
		      }
		      rs.close();
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
