package aircraft;

import java.sql.*;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String name = "asd";
		List<String> models = AircraftDAO.listModels(name);
		
		System.out.println("The models provided by Airbus are");
		
		for (int i = 0; i < models.size(); i++) {
			System.out.println(models.get(i));
		}
	}

}
