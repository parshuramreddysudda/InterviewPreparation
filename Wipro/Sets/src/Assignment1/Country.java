/**
 * 
 */
package Assignment1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author parsh
 *
 */
public class Country {

	/**
	 * @param args
	 */
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return "Yes "+CountryName+" is Added";
		}
		
		return "No "+CountryName+" is not added";
	}

}
