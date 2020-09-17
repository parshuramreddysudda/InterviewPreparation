
interface Vehicle {
	public default void Message() {
		System.out.print("In Vehicle");
	}

}

interface FourWheeler {
	public default void Message() {
		System.out.print("In Four Vehicle");
	}

}

public class Assignment1 implements Vehicle, FourWheeler {

	public void Message() {
		Vehicle.super.Message();
	}

	public static void main(String[] args) {

		Assignment1 v = new Assignment1();
		v.Message();

	}

}
