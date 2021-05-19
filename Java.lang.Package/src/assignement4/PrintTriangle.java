package assignement4;

public class PrintTriangle {

	public static void printrows(int rows) {
		System.out.println("Executed");

		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" "); 
			}
			for (int j = 0; j <= i; j++)
				System.out.print("* ");

			System.out.println();
		}
		for (int i = 0; i <= rows - 2; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= rows - 2 - i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}
	}
}
