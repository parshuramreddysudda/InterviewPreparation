
public class ELITEPJP {

	public static void main(String[] args) {
		String input1 = "dsa";
		String input2 = "ds";
		int input3 = 1;
		int input4 = 1;
		// Code starts from here;
		String result = "";
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();

		if (input3 == 0) {
			
			for (int i = 0; i < input1.length(); i++) {
				boolean flag = false;
				for (int j = 0; j < input2.length(); j++) {
					if (input1.charAt(i) == input2.charAt(j)) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					result += Character.toString(input1.charAt(i));
				}
			}
			for (int i = 0; i < input2.length(); i++) {
				boolean flag = false;
				for (int j = 0; j < input1.length(); j++) {
					if (input2.charAt(i) == input1.charAt(j)) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					result += Character.toString(input2.charAt(i));
				}
			}
		} 
		else 
		{
			for (int i = 0; i < input1.length(); i++) {
				boolean flag = false;
				for (int j = 0; j < input2.length(); j++) {
					if (input1.charAt(i) == input2.charAt(j)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					result += Character.toString(input1.charAt(i));
				}
			}
			for (int i = 0; i < input2.length(); i++) {
				boolean flag = false;
				for (int j = 0; j < input1.length(); j++) {
					if (input2.charAt(i) == input1.charAt(j)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					result += Character.toString(input2.charAt(i));
				}
			}
		}
		if (input4 == 0) {
			result = result.toLowerCase();
		} else {
			result = result.toUpperCase();
		}

		System.out.println(result);
	}

}
