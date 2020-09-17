import java.util.Scanner;

public class TowerOfHanoi {

	public TowerOfHanoi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {

			int disk = sc.nextInt();
			towerOfHanoi(disk, 1, 2, 3);
			int result = (int) Math.pow(2, disk);
			System.out.print(result - 1);
		}

	}

	static void towerOfHanoi(int n, int source, int auxillary, int destination) {
		if (n > 0) {
			towerOfHanoi(n - 1, source, destination, auxillary);
			System.out.println("move disk " + n + " from rod " + source + " to rod " + destination);
			towerOfHanoi(n - 1, auxillary, source, destination);
		}
	}

}
