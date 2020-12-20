
public class MultiplySmall {

	public static void main(String[] args) {

		int n = 75423;
		int copy = n;
		int min = 10;
		while (copy > 0) {
			int temp = copy % 10;
			copy /= 10;
			min=Math.min(min, temp);
		}
		int sum = 0;
		while (n > 0) {
			int temp = n % 10;
			if (temp != min)
				sum += min * (temp);
			n /= 10;
		}
		System.out.println("Sum is "+sum);
	}

}
