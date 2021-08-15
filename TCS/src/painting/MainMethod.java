package painting;

import java.util.Arrays;
import java.util.Comparator;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting[] array = new Painting[5];

		array[0] = new Painting(1, "asd", 42, "asdasf", "fgbtyhr");
		array[1] = new Painting(2, "asdccx", 4534, "as", "asd");
		array[2] = new Painting(3, "asd", 4676, "sd", "fgbtyhr");
		array[3] = new Painting(4, "zxced", 4677, "asdasf", "asd");
		array[4] = new Painting(5, "asd", 7878, "asdasf", "fgbtyhr");
//		System.out.println(findAveragePaintingPriceForGivenType(array, "asdasf"));
		
		Painting[] paint=findAveragePaintingPriceForGivenName(array,"fgbtyhr");
		for(int i=0;i<paint.length;i++)
			System.out.println(i);

	}

	private static double findAveragePaintingPriceForGivenType(Painting painters[], String type) {
		int price = 0;
		int count = 0;
		int totalPrice = 0;
		for (int i = 0; i < painters.length; i++) {
			if (type.equalsIgnoreCase(painters[i].getType())) {
				count++;
				price += painters[i].getPrice();
			}
		}
		if (count > 0)
			return price / count;
		else
			return 0.0;

	}

	private static Painting[] findAveragePaintingPriceForGivenName(Painting painters[], String type) {
		int count = 0;

		for (int i = 0; i < painters.length; i++)
			if (type.equalsIgnoreCase(painters[i].getPainterName()))
				count++;
		
System.out.println(count);


		Painting[] sortedArray = new Painting[count];

		for (int i = 0; i < painters.length; i++)
			if (type.equalsIgnoreCase(painters[i].getPainterName()))
				sortedArray[i] = painters[i];

		Arrays.sort(sortedArray, new Comparator<Painting>() {
			public int compare(Painting o1, Painting o2) {
				return o1.getPaintingId() - o2.getPaintingId();
			}
		});
		return sortedArray;

	}

}
