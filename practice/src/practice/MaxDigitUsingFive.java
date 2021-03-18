package practice;

public class MaxDigitUsingFive {

	public MaxDigitUsingFive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("maxNumberis  " + maxNumberis(-8000));
	}

	public static int maxNumberis(int num) {

		boolean isNegative = false;
		if (num < 0) {
			isNegative = true;
			num = num * -1;
		}
		String numValue = String.valueOf(num);
		int numValueLength = numValue.length();
		int maxNumber = isNegative ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		String newValue = "";
		for (int i = 0; i <= numValue.length(); i++) {
			newValue = numValue.substring(0, i) + "5" + numValue.substring(i, numValueLength);
			if (isNegative)
				maxNumber = Math.min(maxNumber, Integer.parseInt(newValue));
			else
				maxNumber = Math.max(maxNumber, Integer.parseInt(newValue));
		}
		return isNegative ? -(maxNumber) : maxNumber;
	}

}
