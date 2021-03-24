package assignment3;


public class Book {
	
	public Book(String isbn, String title, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public String isbn;
	public String title;
	public int price;
	
	public String displayDetails() {
		return "Book [isbn=" + isbn + ", title=" + title +  ", price=" + price + "]";
	}
	
	public float discountedPrice(int discount) {
		int originalprice=this.getPrice();
		 int s=100-discount;
		return (s*originalprice)/100;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	

}
