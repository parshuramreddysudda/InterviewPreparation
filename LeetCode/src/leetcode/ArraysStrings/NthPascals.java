package leetcode.ArraysStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NthPascals {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getRow(33).toArray()));

	}

	@SuppressWarnings("rawtypes")
	static List getRow(int N)
	{
		List<Integer> list=new ArrayList<Integer>();
	    // nC0 = 1
	    int prev = 1;
	    list.add(1);
	     
	    for(int i = 1; i <= N; i++)
	    {
	         
	       // nCr = (nCr-1 * (n - r + 1))/r
	       int curr = (prev * (N - i + 1)) / i;
	       list.add(curr);
	       prev = curr;
	    }
	    return list;
	}

}
