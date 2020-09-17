/**
 * 
 */

/**
 * @author parsh
 *
 */
public class FirstFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<1000;i++)
		{
			if(i%2==0&&i%3==0&&i%5==0)
			{
				System.out.println(i);
				count++;
			}
			if(count==5) {
				break;
			}
			
		}

	}

}
