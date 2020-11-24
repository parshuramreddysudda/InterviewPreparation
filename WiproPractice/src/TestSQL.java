import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class TestSQL {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String uname="hr";
			String pwd="root";
			Connection con = DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected : "+con);
			Statement st =  con.createStatement();
			String qry="select * from countries";
			ResultSet rs = st.executeQuery(qry);
			while(rs.next()) {
				System.out.println("Deptno : "+rs.getString("COUNTRY_ID"));
				System.out.println("Dname : "+rs.getString("COUNTRY_NAME"));
				System.out.println("Location : "+rs.getInt("REGION_ID"));
				System.out.println("=========================");
			}
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}

}
