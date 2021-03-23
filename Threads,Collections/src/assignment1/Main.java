package assignment1;

public class Main extends Thread {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		 for(int i=0;i<5;i++) {
			 RandomThread rt=new RandomThread();
			 rt.start();
			 GetFact gt=new GetFact();
			 gt.setNumber(rt.getNum());
			 gt.start();
		 }
	}

}


