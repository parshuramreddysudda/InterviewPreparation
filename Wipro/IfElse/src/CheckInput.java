 
//
//Write a program to check if the program has received command line arguments or not.
//
//If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)
//
//Example1) java Example
//O/P: No values
//
//Example2) java Example Mumbai Bangalore
//O/P: Mumbai,Bangalore
//



public class CheckInput { 
	public static void main (String arg[]) {
		int i=0;
		if(arg.length>0)
		{
			while(arg.length>i)
			{
				System.out.println(arg[i]);
				i++;
			}
		}
		else {
			System.out.println("No Values");  
		}
		
       
		
	}

}
