import java.util.ArrayList;
import java.util.Random;

public class Assignment1 {

	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> Prime=new ArrayList<Integer>(25);
		Random rand=new Random();
		int pick=0;
		 for (int j = 0; j<10; j++)
	        {
	            pick = rand.nextInt(1000);
	            Prime.add(pick);
	        }
		
	Prime.forEach(item->{
		boolean isPrime=true;
		
		for(int i=2;i<item/2;i++) {
			if(item%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Number is Prime "+item);
		}
	});

	}

}
