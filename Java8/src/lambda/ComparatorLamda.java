package lambda;

import java.util.Comparator;

public class ComparatorLamda {

	public static void main(String[] args) {

		Comparator<Integer> cmp = (a, b) -> a.compareTo(b);
		System.out.println(cmp.compare(45, 78));
	}

}
