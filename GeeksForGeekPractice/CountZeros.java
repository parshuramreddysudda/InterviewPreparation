
public class CountZeros {

	public static void main(String[] args) {

		int N = 6;
		int Arr[] = {1,1,1,1,1,0,0,0};
		
		int index=0;
		int left=0,right=Arr.length;
		while(left<right) {
			int mid=left+(right-left)/2;
			if(Arr[mid]==1) {
				left=mid+1;
			}
			else if(mid>0&&(Arr[mid]==0&&Arr[mid-1]==0)) {
				right=mid;
			}
			else {
				System.out.println(Arr.length-mid);
				break;
			}
		}
		System.out.println("Count of 0");
		
	}

}
