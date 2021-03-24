package assignment2;

public class Main {

	public static void main(String[] args) throws NumberFormatException {

		try {
			String[] num = { args[0], args[1] };
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);
			System.out.println("Num1 is " + num1 + " Num2 is " + num2);
		} catch (NumberFormatException e) {
			System.out.println(" NumberFormatException");
		}
	}

}
