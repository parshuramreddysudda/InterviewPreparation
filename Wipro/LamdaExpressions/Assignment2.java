import java.util.ArrayList;

public class Assignment2 {

	public Assignment2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ArrayList<String> Words = new ArrayList<String>(5);
		StringBuilder word = new StringBuilder();

		Words.add("Hai");
		Words.add("hei");
		Words.add("Wipro");
		Words.add("Technology");
		Words.add("Reactjs");
		
		Words.forEach(item->{
			System.out.println("Word is "+item+" Reverse is "+word.append(item).reverse());
			word.delete(0,word.length());
		});

	}

}
