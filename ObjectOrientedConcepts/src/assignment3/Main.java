package assignment3;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Magazine mg=new Magazine("1", "Harry Potter", 264, "Selling");
		Novel nv=new Novel("2","Avenger",7568, "Alex Mercer");
		System.out.println(mg.toString());
		System.out.println(nv.toString());
	}
}
