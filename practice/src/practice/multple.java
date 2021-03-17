package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class multple {

	public multple() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] arg) {
		int arr[] = { 6, 4, 67, 6, 5, 4 };
		solve(arr);
	}

	public static int solve(int[] A) {

	
		List<Integer> li=new ArrayList<Integer>();
		int total = 0;
		for (int i = 0; i < A.length; i++)
			if (A[i] % 3 == 0)
				li.add(A[i]);

		return Collections.max(li);

	}

}
