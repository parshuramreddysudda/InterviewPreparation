/**
 * 
 */
package Assignment4;

/**
 * @author parsh
 *
 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	import java.util.HashSet;
	import java.util.Iterator;
import java.util.TreeSet;

	/**
	 * @author parsh
	 *
	 */
	public class Country {

		/**
		 * @param args
		 */
		TreeSet<String> H1 = new TreeSet<>();
		
		public TreeSet<String> saveCountryNames(String CountryName) {
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

