package assignment3;

public class Main {

	public static void main(int[] args) {
		
		if(args.length<=5)
			throw new ArrayIndexOutOfBoundsException();
		int average=0;
		for(int i=0;i<args.length;i++)
			average+=args[i];
		average/=10;
		System.out.println(average);
		
	}

}
