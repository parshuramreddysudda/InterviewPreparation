package practice;


public class Frogs {

	public Frogs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			
		int[] arr= {6,8,5,9,11};
		
		System.out.println("Max block is"+findMaxBlocks(arr));

	}

	public static int findMaxBlocks(int[] arr) {
		 
		int maxNumber=0;
		for(int i=0;i<arr.length;i++) {
			maxNumber=Math.max(maxNumber, findBlocks(i,arr));
			System.out.println("Max number is "+maxNumber);
		}
		return maxNumber;
	}

	public static int findBlocks(int position,int[] arr) {
		
//		find for Left 

		int left=position;
		int right=position;
		for(int i=position;i>0;i--) {
			if(arr[i-1]>=arr[i]) 
				left--;
			else 
				break;
		}
		for(int i=position;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) 
				right++;
			else 
				break;
			
		}
		System.out.println("Left is "+left+" Right is "+right);
		
//		find for Right 
		return right-left+1;
	}

}
