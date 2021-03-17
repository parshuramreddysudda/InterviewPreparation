package threads;

public class DownloadFileTask implements Runnable {

	private DownloadStatus status;
	public DownloadFileTask(DownloadStatus status) { 
		this.status=status;
	}

	@Override
	public void run() {
		System.out.println("Downloading a file " + Thread.currentThread().getName());

		for (int i = 0; i < 10_000; i++) {
			if (Thread.interrupted())
				return;
status.incrementedTotalBytes();
			
		}
		System.out.println("Download Complete " + Thread.currentThread().getName());
	}

}
