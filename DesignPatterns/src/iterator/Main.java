/**
 * 
 */
package iterator;

public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		BrowseHistory hist=new BrowseHistory();
		hist.Push("asd");
		hist.Push("sdfsd");
		hist.Push("ascaer");
		Iterator it=hist.createIterator();
		System.out.println(it.hasNext());
		System.out.println(it.current());

	}

}
