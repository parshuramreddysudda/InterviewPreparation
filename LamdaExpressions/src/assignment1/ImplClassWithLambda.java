package assignment1;

import java.util.Arrays;
import java.util.Comparator;

public class ImplClassWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "How was your day today";
		char c = 'a';

		CharacterOccurence lambda = (String st, char l) -> {
			int count = 0;
			for (int i = 0; i < st.length(); i++) {
				if (l == str.charAt(i)) {
					count++;
				}
			}

			return count;
		};

		int result = lambda.findOccurence(str, c);
		System.out.println(c + " occured " + result + " times.");

	}
	

}

//int count = 0;
//
//for (int i = 0; i < array.length; i++)
//	if (array[i].getPrice() < price)
//		count++;
//
//Allium[] sortedArray = new Allium[count];
//
//for (int i = 0; i < array.length; i++)
//	if (array[i].getPrice() < price)
//		sortedArray[i]=array[i];
//
//Arrays.sort(sortedArray, new Comparator<Allium>() {
//	public int compare(Allium o1, Allium o2) {
//		return o1.getPrice() - o2.getPrice();
//	}
//});
//return sortedArray;