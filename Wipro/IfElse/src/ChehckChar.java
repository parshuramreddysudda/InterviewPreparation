//	
// Initialize a character variable in a program and 
//
//print 'Alphabhet' if the initialized value is an alphabhet, 
//
//print 'Digit' if the initialized value is a number, and 
//
//print 'Special Character', if the initialized value is anything else.



public class ChehckChar {
 public static void main(String args[]) {
	 String word="Wipro";
	 char ch = word.charAt(0);

   
     if (Character.isAlphabetic(ch)) {

         System.out.println(word + " is  ALPHABET.");

     } else if (Character.isDigit(ch)) {

         System.out.println(word + " is  DIGIT.");

     } else {

         System.out.println(word + " is  SPECIAL CHARACTER.");

     }

	 
 }
}
