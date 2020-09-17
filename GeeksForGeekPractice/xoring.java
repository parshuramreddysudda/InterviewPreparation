{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	
    	 boolean flag = false;
    	 while(t-- > 0){
    	     int n=sc.nextInt();
    	     int arr[]=new int[n];
    	     for(int i=0;i<n;i++)
    	     arr[i]=sc.nextInt();
    	     
    	     
    	        Geeks obj=new Geeks();
            	obj.xor1ToN(arr,n);
        	    obj.printArr(arr,n);
        	    obj.setToZero(arr,n);
        	    obj.printArr(arr,n);
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks{
    
    static void printArr(int arr[],int n)
    {
         for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }
         System.out.println( );
    }
    
   static void setToZero(int arr[],int n)
    {
      for(int i=0;i<arr.length;i++)
        {
           arr[i]=0;
        }
    }
    
   static void xor1ToN(int arr[], int n)
    {
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=i^arr[i];
        }
        
        
    }
    
    // binary(int i)
    // {
    //     if(i==1){
            
    //     }
    //     return Integer.toBinaryString(i);  
    // }
}