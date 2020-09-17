import java.util.ArrayList;

public class Assignment3 {

	public Assignment3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ArrayList<String> Words = new ArrayList<String>(5);
		StringBuilder word = new StringBuilder();

		Words.add("Hai");
		Words.add("heel");
		Words.add("Wipro");
		Words.add("Technology");
		Words.add("Reactjs");
		
		Words.forEach(item->{
			if(item.length()%2!=0) {
				System.out.println("Odd Length Word is "+item);
			}
	 
		});

	}

}
