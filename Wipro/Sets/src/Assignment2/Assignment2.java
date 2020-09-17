/**
 * 
 */
package Assignment2;

import java.util.HashSet;
import java.util.Iterator;



/**
 * @author parsh
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Bob");
		set.add("Alice");
		set.add("John");
		set.add("Richard");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}


}
