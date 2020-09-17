// Initialize a character variable with an alphabhet in a program.
//
//If the character value is in lowercase, the output should be displayed in uppercase in the following format.
//
//Example1)
//i/p:a
//o/p:a->A
//
//If the character value is in uppercase, the output should be displayed in lowercase in the following format.
//
//Example2)
//i/p:A
//o/p:A->a


public class CaseChanger {
 public static void main (String args[]) {
	  
	 
	 char ch='Z';
	 
	 if(ch >= 65 && ch <= 90)
	 {
		 System.out.print(ch+"->"+Character.toLowerCase(ch));
	 }
	 else if(ch >= 97 && ch <= 122)
	 {
		 System.out.print(ch+"->"+Character.toUpperCase(ch));
	 }
		 
 }
}
