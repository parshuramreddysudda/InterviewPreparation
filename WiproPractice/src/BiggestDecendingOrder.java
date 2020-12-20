import java.util.ArrayList;
import java.util.List;

public class BiggestDecendingOrder {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 2, 7, 4, 1,0, 9, 0 };
		int max = Integer.MAX_VALUE;
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

			List<Integer> li = new ArrayList<Integer>();

			for (int j = i; j < arr.length; j++) {

				if (arr[j] < max) {
					max = arr[j];
					li.add(arr[j]);
				} else {
					i = j - 1;
					break;
				}
			}
			list.add(li);
			max = Integer.MAX_VALUE;
		}
		int index = 0;
		max=0;
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).size() > max) {
				max = list.get(i).size();
				index = i;
			}
		}
		
		for (int i = 0; i <list.get(index).size(); i++)
			System.out.print(list.get(index).get(i));

	}

}
