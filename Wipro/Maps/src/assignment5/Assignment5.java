/**
 * 
 */
package assignment5;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author parsh
 *
 */
public class Assignment5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		TreeMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);

	}

}
