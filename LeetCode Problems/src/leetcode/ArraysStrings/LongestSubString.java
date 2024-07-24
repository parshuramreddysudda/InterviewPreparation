package leetcode.ArraysStrings;

public class LongestSubString {

	public static void main(String[] args) {
		String[] strs = { "java", "jara", "jar", "javascript" };

		int low = 1;
		int minlength = Integer.MAX_VALUE;
		for (String str : strs)
			minlength = Math.min(minlength, str.length());

		int high = minlength;
		int mid = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (commonString(strs, mid)) {
					low=mid+1;
			} else {
				high=mid-1;
			}

		}
		System.out.println(strs[0].substring(0,(low+high)/2));

	}

	private static boolean commonString(String[] strs, int mid) {

		String str = strs[0].substring(0, mid);
		for (int i = 1; i < strs.length; i++) {
			if(!strs[i].startsWith(str))
				return false;
		}
		return true;

	}

	public static void Solution() {

		String[] str = { "b", "a" };

		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < min) {
				min = str[i].length();
				index = i;
			}
		}
		System.out.println(index);
		String result = "";
		for (int i = 1; i <= str[index].length(); i++) {
			String sub = str[index].substring(0, i);
			System.out.println("String is" + sub);
			boolean flag = true;
			for (int j = 0; j < str.length; j++) {
//				if(i!=j)
				if (str[j].indexOf(sub) != 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				result = sub;
		}
		System.out.println(result);
	}

}
