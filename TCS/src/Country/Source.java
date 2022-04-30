package Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Country {

	Map<String, String> placeList = new HashMap<String, String>();
	// Place, Person

	ArrayList<String> startWith(char startChar) {

		ArrayList<String> list = new ArrayList<String>();

		for (String name : placeList.keySet()) {

			boolean isMatched = list.stream().anyMatch(name::equalsIgnoreCase);
			
			System.out.println("Is Matched"+isMatched+"  "+name.toUpperCase());

			if (!isMatched
					&& (name.toUpperCase().indexOf(startChar) == 0 || name.toLowerCase().indexOf(startChar) > 0)) {
				list.add(name);
			}

		}

		return list;
	}

	public String maximumPlaceVisit() {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String name : placeList.keySet()) {
			// search for value
			String counter = placeList.get(name);

			if (map.containsKey(counter)) {
				map.put(counter, map.get(counter) + 1);
			} else {
				map.put(counter, 1);
			}

		}
		

		Object maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

		return maxEntry.toString();
	}

}

public class Source {

	public static void main(String[] args) {

		Country coun = new Country();
		coun.placeList.put("Dasdelhi", "Bobby");
		coun.placeList.put("asdDelhi", "Bobjhfby");
		coun.placeList.put("dgDelhi", "Bobby");
		coun.placeList.put("Delhasdasdi", "Bobkjhvby");
		coun.placeList.put("Delhi", "Bobby");
		coun.placeList.put("delhi", "Bobby");
		coun.placeList.put("hDasdelhi", "Bobbjhfjy");
		coun.placeList.put("aaDedaslhi", "Bobby");
		coun.placeList.put("vfDelhi", "Bobby");
		

		System.out.println(coun.maximumPlaceVisit());
		
		
		ArrayList al=coun.startWith('D');
		

	}

}
