/**
 * 
 */
package Assignment4;

import Assignment1.Country;

/**
 * @author parsh
 *
 */
public class Assignment4 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));	
	}

}
