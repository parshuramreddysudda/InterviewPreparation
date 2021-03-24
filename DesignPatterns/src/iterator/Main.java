/**
 * 
 */
package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		String asd = "asdasd";
//
//		BrowseHistory hist = new BrowseHistory();
//		hist.Push("asd");
//		hist.Push("sdfsd");
//		hist.Push("ascaer");
//		Iterator it = hist.createIterator();
//		System.out.println(it.hasNext());
//		System.out.println(it.current());

		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(1);
		System.out.println(pickingNumbers(list));
		
	}

	static int reverseNumber(int n) {
		String num = String.valueOf(n);
		StringBuilder input1 = new StringBuilder(num);
		return Integer.valueOf(input1.reverse().toString());
	}

	public static int pickingNumbers(List<Integer> a) {

		int maxLength = 0;
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			while (i<a.size()-1&&Math.abs(a.get(i) - a.get(i + 1)) < 2) {
				System.out.println("i values "+i);
				count++;
				i++;
			}
			maxLength = Math.max(maxLength, count);
			count = 0;
		}
		return maxLength;

	}

}
