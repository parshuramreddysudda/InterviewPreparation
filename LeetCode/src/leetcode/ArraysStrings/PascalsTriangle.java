package leetcode.ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {

		List<List<Integer>> mainList = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		mainList.add(list1);
		int numRows = 5;
		int count = 0;
		while (numRows > 0) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			for (int i = 0; i < count; i++) {
				list.add(mainList.get(count).get(i)+mainList.get(count).get(i+1));
			}
			list.add(1);
			mainList.add(list);
			System.out.println(list.toString());
			numRows--;
			count++;
		}

	}

}
