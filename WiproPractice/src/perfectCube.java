import java.util.Scanner;

public class perfectCube {

	public perfectCube() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = sc.nextInt();
		int need = 0;
		int n = (int) Math.round(Math.pow(num, 1.0 / 3.0));
		if ((num == n * n * n)) {
			System.out.print("Yes");
		} else {
			n = n + 1;
			need = n * n * n;
			need = need - num;
			System.out.println(need);
		}

	}

}
