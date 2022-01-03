import java.util.Arrays;
import java.util.Scanner;

public class AndrewHas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int max = sc.nextInt();
		System.out.println(smallestStock(arr,max));
		if (size > 0) {
			Arrays.sort(arr);
			System.out.println(arr[max - 1]);
		} else {
			System.out.println("No ELement");
		}

	}
	
	private static int smallestStock(int[] stock, int valueK) {
		
		if(valueK>0) {
			Arrays.sort(stock);
			return stock[valueK-1];
		}
		else
			return -1;
			

	}

}
