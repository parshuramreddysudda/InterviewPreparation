
interface Wordcount {
	int count(String word);
}

public class Assignment4 {

	public Assignment4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String word="WiproTech";
		Wordcount w= (String s)->s.length();
		
		System.out.print("Length of word "+word+" is "+w.count(word));

	}

}
