
public class SortByParity {

	public SortByParity() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] A = { 2, 2, 3, 5,9, 5, 8, 8 };
		int oddPosition = 0, evenPositon = 0,length=A.length;
		int temp = 0;
		while(evenPositon<length) {
			if(A[evenPositon]%2==0) {
				temp=A[evenPositon];
				A[evenPositon]=A[oddPosition];
				A[oddPosition++]=temp;
			}
			evenPositon++;
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	
		

	}

}
