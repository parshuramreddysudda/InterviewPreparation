/**
 * 
 */
package Assignment3;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author parsh
 *
 */
public class Assignment3 {

	/**
	 * 
	 */
	public Assignment3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Bob");
		set.add("Alice");
		set.add("John");
		set.add("Richard");
		
		String query = "John";
		boolean result = false;
		
		System.out.println("Original tree set:" + set);  
	     Iterator<String> it = set.descendingIterator();
	     // Print list elements in reverse order
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");


	}

}
