/**
 * 
 */

/**
 * @author parsh
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int i =0;
	       int num =0;
	      
	       for (i = 10; i <= 99; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		        {
	        	  	if(i%num==0)
	        	  	{
	        	  		counter = counter + 1;
	        	  	}
		        }
	          if (counter ==2)
	          	{
	        	  System.out.println(i);
	          	}	
	      }
		
	

	}

}
