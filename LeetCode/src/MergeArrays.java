import java.util.Arrays;

public class MergeArrays {

	public MergeArrays() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		int[] nums1 = {1,0};
		int[] nums2 = {0};
		int[]  result=new int[nums1.length];
		int Largest=0;
		int firstMax=0;
		for(int i=0;i<nums1.length;i++) {
			if(nums1[i]>firstMax) {
				firstMax=nums1[i];
			}
		}
		int secondMax=0;
		for(int i=0;i<nums2.length;i++) {
			if(nums2[i]>secondMax) {
				secondMax=nums2[i];
			}
		}
		if(secondMax>firstMax) {
			Largest=secondMax;
		}
		else {
			Largest=firstMax;
		}
		for(int i=0;i<nums1.length;i++) {
			if(nums1[i]==0) {
				nums1[i]=Largest+10;
			}
		}
		int first=0,second=0;
		for(int i=0;i<result.length;i++) {
			if(nums1[first]>nums2[second]) {
				result[i]=nums2[second++];
			}
			else {
				result[i]=nums1[first++];
			}
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		for(int i=0;i<result.length;i++) {
			nums1[i]=result[i];
		}  
	}

}
