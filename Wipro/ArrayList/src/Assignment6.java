import java.util.Iterator;
import java.util.Vector;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("Decemberem");

		printAll(list);
	}

	public static void printAll(Vector<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

}
