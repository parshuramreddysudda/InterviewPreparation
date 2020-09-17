import java.util.ArrayList;
import java.util.function.Function;

public class Assignment2 {

	public Assignment2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);	al.add(65);	al.add(32);	al.add(76);	al.add(6);
		al.add(54);	al.add(8);	al.add(23);	al.add(16);	al.add(41);
		Function<ArrayList<Integer>,Integer> f =(all)->{
			int sum=0;
			for(int i : all) {
				sum +=i;
			}
			return sum;
		};
		System.out.println(f.apply(al));
	}

}
