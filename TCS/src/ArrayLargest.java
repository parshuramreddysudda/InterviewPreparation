import java.util.Scanner;

public class ArrayLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[13];

		for (int i = 0; i < 13; i++) {
			arr[i] = sc.nextInt();
		}

		int ones = 0, twos = 0;
		int common_bit_mask;

		for (int i = 0; i < arr.length; i++) {
			twos = twos | (ones & arr[i]);
			ones = ones ^ arr[i];
			common_bit_mask = ~(ones & twos);
			ones &= common_bit_mask;
			twos &= common_bit_mask;
		}
		
		
		System.out.println(ones);

	}

}
