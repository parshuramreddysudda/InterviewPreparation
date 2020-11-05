import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {

	public static void main(String[] args) {

//		Output: ["e","l","l"]
		String st = "atc";
//		System.out.println(Character.getNumericValue('a'));
		System.out.println(getHashcode(st));
//		List<String> list = commonChars(st);
//		Stream.of(list.toString()).forEach(System.out::println);

	}

	private static int getHashcode(String str) {

		int[] numbers = new int[26];

			int temp = 0;
			Arrays.fill(numbers, 0);
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				numbers[Character.getNumericValue(ch) - 10]++;
			}
			temp = numbers.length-1;
			StringBuilder sb = new StringBuilder();
			while (temp >= 0) {
				sb.append("#");
				sb.append(numbers[temp]);
				temp--;
			}

			int key = sb.toString().hashCode();	
				
		return key;

	}

}
