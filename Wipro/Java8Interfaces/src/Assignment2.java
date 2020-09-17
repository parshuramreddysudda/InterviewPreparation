

interface Test{
	public abstract int myFunction(int a,int b,int c);
}
public class Assignment2 {

	public Assignment2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

		Test t1=(int a,int b,int c)->a+b+c;
		Test t2=(int a,int b,int c)->a*b*c;

		System.out.println("Result for Addition "+t1.myFunction(12, 23, 456));

		System.out.println("Result for Multiplicatiion "+t2.myFunction(12, 23, 456));
	}

}
