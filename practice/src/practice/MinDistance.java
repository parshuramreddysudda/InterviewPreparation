package practice;

import java.util.Scanner;

public class MinDistance {

	public static void main(String[] args) {

//		4,3,3,2,2,1; 
		 Scanner sc= new Scanner(System.in);
		int patients=sc.nextInt();
		int cylinderCpapcity=sc.nextInt();
		int[] patCap=new int[patients];
		for(int i=0;i<patients;i++) {
			patCap[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<patCap.length;i++) {
			int sum=0;
			for(int j=i;j<patCap.length;j++) {
				
				if(sum<cylinderCpapcity) {
					sum+=j;
				}
				
				j=i;
				break;
			
			}
			count++;
			
		}
		
		System.out.println(count);
		
		
	}

}
