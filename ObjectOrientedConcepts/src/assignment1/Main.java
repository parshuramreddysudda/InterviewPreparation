package assignment1;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Book b1=new Book("123","harry","Har",100);
		Book b2=new Book("122","Potter","Ram",12560);
		System.out.println(b1.displayDetails());
		System.out.println(b1.discountedPrice(10));
	}

}
