package cp9;

import java.util.concurrent.*;

public class AsynchronousTest extends Thread {
	private ExecutorService executor = Executors.newFixedThreadPool(1);

	public void asynchronousTask() throws InterruptedException {

		executor.submit(() ->
			 {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				int time = 0;
				for (int i = 0; i < 1000; i++) {

					time += i;
				}

				System.out.println(time);
			}
		);
	}

	public static void main(String[] args) throws InterruptedException {

		boolean b = task2();

		if (b) {
			task3();
		}

		System.out.println("(1)");
	}

	static boolean task2() throws InterruptedException {

		AsynchronousTest e = new AsynchronousTest();

		e.asynchronousTask();

		System.out.println("(2)");

		return true;
	}

	static void task3() throws InterruptedException {
		int j = 0;
		while (true) {
			if (j++ > 10000) {
				break;
			}
		}

		System.out.println("(3)");
	}
}
