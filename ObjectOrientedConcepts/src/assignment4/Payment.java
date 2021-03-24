package assignment4;

public class Payment {

	public Payment(double amount) {
		super();
		this.amount = amount;
	}
	public double amount;
	
	
	public  String paymentDetails() {
		return "Amount is "+amount;
	}
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
