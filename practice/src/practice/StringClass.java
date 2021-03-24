package practice;

public class StringClass {


	
	public static void main(String[] args) {
		String text=" 34 item(s) - $4,188.80";
		
		text.indexOf('$');
		text.replace(",", "");
		System.out.println(text.substring(text.indexOf('$')+1,text.indexOf('.')));
		System.out.println(text.replace(",", ""));
		
	}

}
