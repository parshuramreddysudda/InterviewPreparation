/**
 
 * 
 */

/**
 * @author parsh
 *
 */
public class Patient {


	/**
	 * 
	 */
	String patientName="Patient 1";
	double height=6.4,width=34;
	
	double computeBMI(int weight ) {
		
		
		return (weight/height*height);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient b=new Patient();
		System.out.print(b.computeBMI(23)); 
	}

}
