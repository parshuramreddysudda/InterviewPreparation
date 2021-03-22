package assignment3;

public class Magazine extends Book {


	public String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Magazine [type=" + type + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}

	public Magazine(String isbn, String title, int price, String type) {
		super(isbn, title, price);
		this.type = type;
	}
	
}
