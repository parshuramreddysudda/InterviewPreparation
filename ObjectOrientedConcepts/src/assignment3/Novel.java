package assignment3;

public class Novel extends Book{

	public String author;

	public String getAuthor() {
		return author;
	}


	public Novel(String isbn, String title, int price, String author) {
		super(isbn, title, price);
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Novel [author=" + author + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}


}
