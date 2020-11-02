
public class isPalindrome {

	public static void main(String[] args) {

			System.out.println(sPalindrome(1));

	}

	private static boolean sPalindrome(int x) {
		 
		if(x<0) return false;
		else if(x%10==x) return true;
		else {
			String number=Integer.toString(x); 
			int left=0,right=number.length()-1;
			while(left<right) {
				if(number.charAt(left++)==number.charAt(right--))
					continue;
				else
					return false;
			}
		}
		return true;
	}

}
