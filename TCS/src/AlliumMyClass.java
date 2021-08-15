import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AlliumMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Allium> list = new ArrayList<Allium>();

		while (sc.hasNext()) {
			int id = sc.nextInt();
			String name = sc.next();
			String type = sc.next();
			int price = sc.nextInt();
			list.add(new Allium(id, name, type, price));
		}
		
		Allium[] array = new Allium[list.size()];
		
		for (int i = 0; i < 5; i++) {
			array[i] = list.get(i);
		}
		System.out.println(sortByPriceMethod(array, "Asdsd"));
		Allium[] arrayw = (findTypeByState(array, 162));

		for (int i = 0; i < arrayw.length; i++) {
			System.out.println(arrayw[i].getAlliumType());
			System.out.println(arrayw[i].getPrice());

		}

	}

	private static String sortByPriceMethod(Allium[] array, String string) {

		for (int i = 0; i < array.length; i++) {
			if (string.equalsIgnoreCase(array[i].getProducingState())) {
				return array[i].getAlliumType();
			}
		}

		return null;
	}

	public static Allium[] findTypeByState(Allium[] array, int price) {

		int count = 0;

		for (int i = 0; i < array.length; i++)
			if (array[i].getPrice() < price)
				count++;

		Allium[] sortedArray = new Allium[count];

		for (int i = 0; i < array.length; i++)
			if (array[i].getPrice() < price)
				sortedArray[i] = array[i];

		Arrays.sort(sortedArray, new Comparator<Allium>() {
			public int compare(Allium o1, Allium o2) {
				return o1.getPrice() - o2.getPrice();
			}
		});
		return sortedArray;

	}

	class Sortbyroll implements Comparator<Allium> {
		public int compare(Allium a, Allium b) {
			return a.getPrice() - b.getPrice();
		}
	}

}
