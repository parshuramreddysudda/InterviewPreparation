package assignment4;

import java.util.Currency;
import java.util.Scanner;

public class CurrencyClass {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     String country=sc.next();
	     
	     Currency cur=Currency.getInstance(country);
	     System.out.println("Symbol is "+cur.getSymbol()+" Spelled as "+cur.getDisplayName());

	}

}
