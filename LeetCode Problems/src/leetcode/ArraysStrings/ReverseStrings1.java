package leetcode.ArraysStrings;

import java.util.*;
import java.util.Map.Entry;

public class ReverseStrings1 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(findPrimeVowels(5));
	}

	private static String findPrimeVowels(int i) {

		int prim = findNPrimenumber(i);

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "one");
		hs.put(2, "two");
		hs.put(3, "three");
		hs.put(4, "four");
		hs.put(5, "five");
		hs.put(6, "six");
		hs.put(7, "seven");
		hs.put(8, "eight");
		hs.put(9, "nine");
		hs.put(0, "zero");
		
		int total=0;
		String result="";
		
		while(prim>0) {
			    int count= prim % 10;
			    total+=findVowels(hs.get(count));
			    result+=volwels(hs.get(count));
			    prim = prim / 10;
			}
		
		result+=String.valueOf(total);
		return result;
		}
	
	
	public static String volwels(String str) {
		String res="";
		for(int i=0; i<str.length(); i++) {
	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	            res+=Character.toString(str.charAt(i));
	         }
	      }
		return res;
	}
	public static int findVowels(String str){
	
		   int vCount = 0;   
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                vCount++;    
	            }          
	        }
	       return  vCount;   
	}

	private static int findNPrimenumber(int b) {
		int k = 2;
		int d = 0, i, c = 0;
		int p = 0;
		while (d <= b) {
			for (i = 2; i < k / 2; i++) {
				if (k % i == 0) {
					c++;
				}
			}
			if (c == 0) {
				d++;
				p = k;
			}
			k++;
			c = 0;
		}
		return p;
	}
}
