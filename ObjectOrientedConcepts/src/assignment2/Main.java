package assignment2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
			Email msg=new Email("Some random String");
			msg.setSender("Sender Text");
			System.out.println("Sender is "+msg.getSender());
			msg.setReciept("reciept");
			System.out.println("reciept is "+msg.getReciept());
			msg.setTitle("harry Potter");
			System.out.println("Title is "+msg.getTitle());
	}

}
