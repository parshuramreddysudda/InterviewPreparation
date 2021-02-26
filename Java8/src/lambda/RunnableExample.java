package lambda;

public class RunnableExample {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside runnable");
			}

		};
		new Thread(runnable).start();

		// Java 8 lamda expr
		// ()->{}
		
		Runnable runnableLamda = () -> System.out.println("Inside Lamda");
		new Thread(runnableLamda).start();
	}

}
