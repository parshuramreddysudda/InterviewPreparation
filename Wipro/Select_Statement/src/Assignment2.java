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
	 */
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr"); 
			  Statement stmt = con.createStatement();
		      
		      ResultSet rs = stmt.executeQuery("select * from departments");
		      java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		         System.out.print("Field\t\t" );
		         System.out.print(" Null? \t" );
		         System.out.print(" Type \n" );
		      for(int i=1;i<=rsmd.getColumnCount();i++) {
		    	  System.out.print(rsmd.getColumnName(i)+"\t");
		    	  System.out.print(rsmd.isNullable(i)+"\t");
		    	  System.out.println(rsmd.getColumnTypeName(i));


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
