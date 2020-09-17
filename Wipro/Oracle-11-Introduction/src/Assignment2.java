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
	 * 
	 */
	public Assignment2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "hr", "hr");
			System.out.println("Connection Established successfully");
			  Statement stmt = conn.createStatement();

		      String sql = "SELECT id, name,salary FROM employee";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("Id");
		         String name = rs.getString("Name");
		         String salary = rs.getString("Salary");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Name: " + name);
		         System.out.println(", Salary: " + salary);
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
