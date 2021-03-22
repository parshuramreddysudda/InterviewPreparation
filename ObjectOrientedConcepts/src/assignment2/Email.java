package assignment2;

public class Email extends Document {

	public Email(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}
	
	public String sender;
	public String reciept;
	public String title;
	public String getSender() {
		return sender;
	}
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", reciept=" + reciept + ", title=" + title + "]";
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciept() {
		return reciept;
	}
	public void setReciept(String reciept) {
		this.reciept = reciept;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
