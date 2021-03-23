package assignment2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Multi t1 = new Multi();

		try {
			t1.start();
			Multi.sleep(20000);
			t1.stop();
		} catch (InterruptedException e) {
			System.out.println("Caught:" + e);
		}

	}
}

class SayHello extends TimerTask {
	public void run() {
		System.out.println("Hello World!");
	}
}

class Multi extends Thread {
	public void run() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		Timer timer = new Timer();
		timer.schedule(new SayHello(), 0, 2000);
	}
}