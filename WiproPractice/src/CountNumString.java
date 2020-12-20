
public class CountNumString {

	public static void main(String[] args) {
		String as="jvasd5asjhaf768asfmn";
		
		int result=0;
		for(int i=0;i<as.length();i++) {
			if(Character.isDigit(as.charAt(i))) 
				result+=Integer.parseInt(String.valueOf(as.charAt(i)));
		}
		System.out.println("Sum is "+result);

	}

}
