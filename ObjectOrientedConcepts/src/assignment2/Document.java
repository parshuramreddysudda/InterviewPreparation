package assignment2;

public class Document {
	private String string;
	
	public Document(String string) {
		super();
		this.string = string;
	}
	@Override
	public String toString() {
		return "Document [string=" + string + "]";
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}

}
