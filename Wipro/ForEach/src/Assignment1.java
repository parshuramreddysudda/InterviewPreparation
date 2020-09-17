import java.util.ArrayList;

public class Assignment1 {

	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Words = new ArrayList<String>(5);
		StringBuilder word = new StringBuilder();

		Words.add("Sunday");
		Words.add("Monday");
		Words.add("Tuesday");
		Words.add("Wednesday");
		Words.add("Thursday");
		Words.add("Friday");
		Words.add("Saturday");
		
		
		Words.forEach(item->{
			System.out.println("Day is "+item);
			
		});
	}

}
