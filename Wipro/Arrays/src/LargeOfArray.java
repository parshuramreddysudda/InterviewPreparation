

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class LargeOfArray {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int a=args.length,maxElement=0;
		int arr[] = new int[9];
		for(int i=0;i<9;i++)
		    {
		    
		        arr[i]=Integer.parseInt(args[i]);
		     
		
		    }
    
        maxElement = arr[0];
        
		for(int i = 0; i < a; i++)
        {
            if(maxElement < arr[i])
            {
                maxElement = arr[i];
            }
        }
        System.out.println("Maximum value:"+maxElement);
	}

}
