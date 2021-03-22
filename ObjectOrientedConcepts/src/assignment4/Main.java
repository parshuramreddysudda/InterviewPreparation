package assignment4;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashPayment cp1=new CashPayment(35667);
		CashPayment cp2=new CashPayment(87546);
		CreditCardPayment ccp1=new CreditCardPayment(234,"MasterCard",2020,51285896);
		CreditCardPayment ccp2=new CreditCardPayment(4567,"VisCard",255,457566);
		System.out.println(cp1.paymentDetails());
		System.out.println(cp2.paymentDetails());
		System.out.println(ccp1.paymentDetails());
		System.out.println(ccp2.paymentDetails());
	}

}
