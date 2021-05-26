import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class ReOrderDataLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("dig1 8 1 5 1");
		list.add("let1 art can");
		list.add("dig2 3 6");
		list.add("let2 own kit dig");
		list.add("let3 art zero");
		Collections.sort(list, new SpecialStrings());
		Iterator<String> it=list.iterator();
		
		
	}

	public boolean joinsllogs(String log) {
		return Character.isLetter(log.charAt(log.indexOf(' ') + 1));
	}

	static class SpecialStrings implements Comparator<String> {
		@Override
		public int compare(String word1, String word2) {
			int index1 = word1.indexOf(' ');
			int index2 = word2.indexOf(' ');
			String content1 = word1.substring(index1 + 1);
			String content2 = word2.substring(index2 + 1);
			int difference = content1.compareTo(content2);
			if (difference != 0)
				return difference;
			String identifier1 = word1.substring(0, index1);
			String identifier2 = word2.substring(0, index2);
			return identifier1.compareTo(identifier2);
		}
	}

}
