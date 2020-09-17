import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment5 {


	
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
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

public static void printAll(LinkedList<String> list) {
	Iterator<String> it = list.iterator();
	
	while (it.hasNext())
		System.out.println(it.next());
}
}
