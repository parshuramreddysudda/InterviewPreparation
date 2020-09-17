/**
 Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
 * 
 */

/**
 * @author parsh
 *
 */
public class RmvDupArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArray[] = new int[]{10, 11,1,120, 88, 12, 1, 12};
		int duplicate[] = new int[inputArray.length-1];
		int n=inputArray.length;
		int temp=0,tempIndex=0;
		for(int i=0;i<n;i++) {
			temp=0;
			for(int j=0;j<n;j++) {
				if(inputArray[i]==inputArray[j]&&i!=j) {
//					Duplicate Found 
//					  System.out.println("Duplicate is "+inputArray[i]);
					temp=1;
					
				}
			}
			if(temp==0) {
              duplicate[tempIndex]=inputArray[i];
              tempIndex++;
				
			}
			
		}
		for(int i=0;i<duplicate.length;i++) {
			if(duplicate[i]==0) {
				continue;
			}
			 System.out.println(duplicate[i]);
		 }
		
	}

}
