package aircraft;

import java.sql.*;
import java.util.*;

public class AircraftDAO {

	public static List<String> listModels(String name) {

		List<String> models = new ArrayList<String>();
		DBConnection connection = new DBConnection();

		Connection con = null;
		PreparedStatement p = null;
		ResultSet rs = null;

		con = connection.getConnection();

		try {

			String sql = "select * from aircraft_manufacturer where name=" + name;

			p = con.prepareStatement(sql);
			rs = p.executeQuery();

			int id = 0;

			if (rs.next()) {

				if (rs.getString("name").equalsIgnoreCase(name)) {
					id = rs.getInt("id");
				}

			}

			sql = "select * from aircraft where aircraft_manufacturer_id=" + id;

			p = con.prepareStatement(sql);
			rs = p.executeQuery();

			if (rs.next()) {

				name = rs.getString("model");
				models.add(name);

			}

		}
		catch (SQLException e) {
			System.out.println(e);
		}
		return models;
	}
}
