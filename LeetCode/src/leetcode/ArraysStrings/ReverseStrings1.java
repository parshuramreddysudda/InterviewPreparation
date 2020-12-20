package leetcode.ArraysStrings;

public class ReverseStrings1 {

	public static void main(String[] args) {

		String s = "        a             good         day        ";
		String result = "";
		StringBuilder sc=new StringBuilder(s);
		s=sc.reverse().toString();
		String[] res = s.replaceAll("( +)", " ").trim().split("\\s");
		
		int n = res.length - 1;
		for (int i = n; i >= 0; i--) {
			if (i != n)
				result += " ";

			result += res[i];
		}

		System.out.println(result);

	}

}
