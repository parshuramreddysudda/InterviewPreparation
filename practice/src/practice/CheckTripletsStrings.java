package practice;

public class CheckTripletsStrings {

	public static void main(String[] args) {

		String str = "HSLLLL";
		System.out.println(checkTripltes(str));

	}

	private static int checkTripltes(String str) {

		if (str.indexOf("H") > -1 && str.indexOf("S") > -1 && str.indexOf("L") > -1) {
			int hCount = 0, sCount = 0, lCount = 0;
			int i = 0;
			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'H')
					hCount++;
				else if (str.charAt(i) == 'S')
					break;
				else
					return 0;
			}
		
			int j = 0;
			for (j = i; j < str.length(); j++) {
				if (str.charAt(j) == 'S')
					sCount++;
				else if (str.charAt(j) == 'L')
					break;
				else
					return 0;
			}
			
			int k = 0;
			for (k = j; k < str.length(); k++) {
				if (str.charAt(k) == 'L')
					lCount++;
				else
					return 0;
			}
			System.out.println("Executed");

			return hCount * sCount * lCount;
		} 
		else
			return 0;

	}

}
