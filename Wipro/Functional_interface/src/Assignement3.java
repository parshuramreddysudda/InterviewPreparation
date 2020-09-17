import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignement3 {

	public Assignement3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mom");		al.add("madam");
		al.add("son");		al.add("poop");
		al.add("daughter");	al.add("student");
		al.add("dad");		al.add("teacher");
		al.add("brother");	al.add("staff");
		Predicate<String> p = i->{
			String rev="";
			for(int j=i.length()-1 ; j>=0 ; j--) {
				char c=i.charAt(j);
				rev = rev + c;
			}
			if(rev.equals(i)) {
				return true;
			}
			else
				return false;
		};
		ArrayList<String> ar = new ArrayList<String>();
		al.forEach(
				i->{if(p.test(i))ar.add(i);}
				);
				
				System.out.println(ar);

	}

}
