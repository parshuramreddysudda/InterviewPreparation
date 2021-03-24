package assignment5;

import java.util.HashSet;
import java.util.Iterator;

public class Mian {

	public Mian() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

			HashSet<String> hs=new HashSet();
			hs.add("Harry");
			hs.add("Potter");
			hs.add("avengers");
			Iterator<String> it=hs.iterator();
			while(it.hasNext())
				System.out.println(it.next());

	}

}
