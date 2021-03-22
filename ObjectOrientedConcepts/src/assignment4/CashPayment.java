package assignment4;

public class CashPayment extends Payment{

	public CashPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

   @Override
	public  String paymentDetails() {
		return "Payment is in Cash  "+amount;
	}

@Override
public String toString() {
	return "CashPayment [amount=" + amount + "]";
}
	

}
