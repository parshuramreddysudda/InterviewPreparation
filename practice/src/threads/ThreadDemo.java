package threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void show() {

//		var thread = new Thread(new DownloadFileTask());
//		thread.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		thread.interrupt();
//
//		System.out.println("File is ready to download ");
		
		var status = new DownloadStatus();

		List<Thread> thr = new ArrayList<>();

		for (var i = 0; i < 10; i++) {
			var thread = new Thread(new DownloadFileTask(status));
			thread.start();
			thr.add(thread);
		}
		for (var thread : thr)
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		System.out.println("Downlad complete " + status.getTotalBytes());
	}

	public static void main(String[] arg) {
		show();
	}
}
