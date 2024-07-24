package leetcode.ArraysStrings;

public class BinaryAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String a="1010", b = "1011";
		  long binary1, binary2;
		  int i = 0, remainder = 0;
		  int sum1=0;
		  binary1 =Long.parseLong(a) ;
		  
		  binary2 = Long.parseLong(b);
		  int[] sum=new int[10];
		  while (binary1 != 0 || binary2 != 0) 
		  {
		   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
		   binary1 = binary1 / 10;
		   binary2 = binary2 / 10;
		  }
		  if (remainder != 0) {
		   sum[i++] = remainder;
		  }
		  --i;
		  System.out.print("Sum of two binary numbers: ");
		  while (i >= 0) {
		   System.out.print(sum[i--]);
		  }
	}

}
