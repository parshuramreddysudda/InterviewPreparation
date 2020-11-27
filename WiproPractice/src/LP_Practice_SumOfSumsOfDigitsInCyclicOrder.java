
public class LP_Practice_SumOfSumsOfDigitsInCyclicOrder {

	public static void main(String[] args) {
		int input1=374623874;
		String input=String.valueOf(input1);
		int len=input.length();
		int temp=1;
		int sum=0;
		int tempSum=0;
		while(len>=0){
			int n=input1%temp;
			tempSum=0;
			System.out.println("Na valueis "+n);
			 while (n != 0) 
       			 { 
            		tempSum = tempSum + n % 10; 
            		n = n/10; 
        		} 
			sum+=tempSum;
			System.out.print("Sum is"+sum);
			temp*=10;
			len--;
		}
		
    System.out.println("Value is "+sum);

	}

}
