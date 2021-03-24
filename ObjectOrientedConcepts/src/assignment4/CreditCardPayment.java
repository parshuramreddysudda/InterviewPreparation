package assignment4;

public class CreditCardPayment extends Payment {

	
	String name;
	int ExpDate;
	int carNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExpDate() {
		return ExpDate;
	}
	public void setExpDate(int expDate) {
		ExpDate = expDate;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public CreditCardPayment(double amount, String name, int expDate, int carNumber) {
		super(amount);
		this.name = name;
		ExpDate = expDate;
		this.carNumber = carNumber;
	}
	@Override
	public String paymentDetails() {
		return "CreditCardPayment [name=" + name + ", ExpDate=" + ExpDate + ", carNumber=" + carNumber + ", amount="
				+ amount + "]";
	}
	


}
