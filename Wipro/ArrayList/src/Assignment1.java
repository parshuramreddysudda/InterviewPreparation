import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment1 {

	/**
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
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

	public static void printAll(List<Object> list) {
		Iterator<Object> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

}
