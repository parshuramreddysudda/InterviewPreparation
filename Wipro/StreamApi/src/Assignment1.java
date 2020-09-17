import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Assignment1 {

	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

		List<Integer> number=Arrays.asList(23,-543,13,456,-65,-34,05,-86);
		
	    List<Integer> result=number.stream().filter(num->isEvenNegative(num)).collect(Collectors.toList());
//	    result.stream().map(x->System.out.print(x));
	    System.out.print(result);
	}

	static boolean isEvenNegative(int num) {
		if (num < 0) {
			if ((num * -1) % 2 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
