
public class TwoSumSeries {

	public static void main(String[] args) {
		int[] arr = { 3,2,3};
		int sum=6;
		int temp=0;
		int start=0,end=0;

//		for (int i = 0; i < arr.length; i++) {
//			temp+=arr[end];
//			System.out.println("Temp is"+temp);
//			if(sum==temp) {
//				break;
//			}
//			else if(sum<temp) {
//				temp-=arr[start++];
//			}
//			end++;
//		}
		temp+=arr[end];
		System.out.println("Temp is "+temp);
		while(start<arr.length-1||end<arr.length-1) {
			while(temp<sum&&end<arr.length-1) {
				end++;
				temp+=arr[end];
				System.out.println("Executed End is "+end+" Temp is "+temp);
			}
			while(temp>sum&&start<arr.length-1) {
				temp-=arr[start];
				start++;
				System.out.println("Executed STart is "+start+" Temp is "+temp);
			}
			if(temp==sum) {
				System.out.println("Executed");
				break;
			}
			System.out.println("Start is "+start+" End is "+end);

		}
		System.out.println("Start is "+start+" End is "+end);

	}

}
