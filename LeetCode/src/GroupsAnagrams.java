import java.util.*;

public class GroupsAnagrams {

	public static void main(String[] args) {

//		Output: ["e","l","l"]
		String[] st = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Character.getNumericValue('a'));
//		List<String> list = commonChars(st);
//		Stream.of(list.toString()).forEach(System.out::println);

	}

	private static List<List<String>> commonChars(String[] strs) {

		HashMap<Integer, ArrayList<String>> hashmap = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> arraylist = new ArrayList<String>();
		int[] numbers = new int[26];

		for (int i = 0; i < strs.length; i++) {
			int temp = 0;
			Arrays.fill(numbers, 0);
			int sum = 0;
			for (int j = 0; i < strs[i].length(); j++) {
				char ch = strs[i].charAt(i);
				numbers[Character.getNumericValue(ch) - 10]++;
			}
			temp = numbers.length;
			StringBuilder sb = new StringBuilder();
			while (temp > 0) {
				sb.append("#");
				sb.append(numbers[temp]);
			}
			int key = sb.toString().hashCode();
			if (!hashmap.containsKey(key)) {
				hashmap.put(key, new ArrayList<String>());
				hashmap.get(key).add(strs[i]);

			} else {
				hashmap.get(key).add(strs[i]);
			}
		}
		return new ArrayList(hashmap.values());

	}

}
