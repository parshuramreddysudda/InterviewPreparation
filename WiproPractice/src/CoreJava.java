import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CoreJava {

	public static void main(String[] args) {

		int[][] ad = { { 5, 4 }, { 3, 2 }, { 4, 2 }, { 2, 1 } };

		int a = 5;
		System.out.print(getJobIds(a, ad));

	}

	private static String getJobIds(int input1, int[][] input2) {

		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		int i = 0;
		for (int j = 0; j < input2.length; j++) {
			hs.put(input2[j][1],input2[j][0]);
		}
		i = 1;
		String res = "";
       	while(hs.get(i) != null) {
       		res+=String.valueOf(i);
       		i=hs.get(i);
       	}
       	res+=String.valueOf(i);

		return res;
	}

}