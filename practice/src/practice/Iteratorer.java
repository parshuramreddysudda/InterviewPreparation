package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorer {

	public static void main(String[] args) {
	
		ArrayList mylist = new ArrayList();
		mylist.add(1);
		mylist.add(2);
		mylist.add("####");
		mylist.add("xcghjkl");
		mylist.add("dsxcvhjuytf");
		
		Iterator it=func(mylist);
		
	}

	private static Iterator func(ArrayList mylist) {
		Iterator it=mylist.iterator();
		while(it.hasNext()){
	         Object element =it.next();
	            if(element == "####")
				break;
			}
	      return it;
	      
	}

}
