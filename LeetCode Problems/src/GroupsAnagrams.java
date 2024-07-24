import java.util.*;

public class GroupsAnagrams {

	public static void main(String[] args) {

//		Output: ["e","l","l"]
		String[] st = { "ad","ac","aa" };
//		System.out.println(Character.getNumericValue('a'));
		System.out.println(commonChars(st));
//		List<String> list = commonChars(st);
//		Stream.of(list.toString()).forEach(System.out::println);

	}

	private static HashMap<Integer, ArrayList<String>> commonChars(String[] st) {

		HashMap<Integer, ArrayList<String>> hashmap = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> arraylist = new ArrayList<String>();
		int[] numbers = new int[26];

		for (String str:st) {
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
			if (!hashmap.containsKey(key)) {
				hashmap.put(key, new ArrayList<String>());
				hashmap.get(key).add(str);

			} else {
				hashmap.get(key).add(str);
			}
		}
		return hashmap;

	}

}
