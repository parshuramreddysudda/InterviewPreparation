package assignment1;

public class RandomThread extends Thread {
	int number;
	RandomThread() {
		number = (int) (Math.random()*10);
	}

	public void run() {
		System.out.println("Number is  " + number);
	}
	public int getNum()
	{
		return number;
	}
	
}
