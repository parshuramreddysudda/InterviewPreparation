package practice;

public class getSmallestDoubleInteger {

	public static void main(String[] args) {
	int number=10;
	System.out.println(solution(number));
	}
	static  int solution(int num) {
		
		int sum=getSum(num);
		int neededNumber=sum*2;
		for(int i=num;i<Integer.MAX_VALUE;i++)
			if(getSum(i)==neededNumber)
				return i;
		
		
		return 0;
	}
	static int getSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}


}
