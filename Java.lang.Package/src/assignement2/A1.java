package assignement2;

public class A1 {

	@SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {

		System.out.println("Calling finalize method" + " of the Object class");
		super.finalize();
	}
}
