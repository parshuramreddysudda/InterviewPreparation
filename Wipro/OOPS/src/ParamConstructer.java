/**
 * 
 */

/**
 * @author parsh
 *
 */
public class ParamConstructer {

	
	int height,width,length;
	public ParamConstructer() {
		// TODO Auto-generated constructor stub
		height = 12;
		width=35;
		length=35;
	}
	int volumeofCube() {
		return height*width*length;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ParamConstructer b=new ParamConstructer();
		System.out.print(b.volumeofCube());
	}

}
