/**
 * 
 */
package graduate;

/**
 * @author Bachina Akhila
 *
 */
public class Graduate extends Student{

	/**
	 * @param args
	 */
	public boolean methodIsPassed(int grade) {
		if(grade>80)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
	