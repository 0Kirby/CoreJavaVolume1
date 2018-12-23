package cp9;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	private static final Exchanger<String> ec = new Exchanger<String>();

	private static ExecutorService tp = Executors.newFixedThreadPool(2);

	public static void main(String[] args) {

		tp.execute(() -> {
			try {
				String A = "Thread A";
				ec.exchange(A);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		tp.execute(() -> {
			try {
				String B = "Thread B";
				String A = ec.exchange("B");
				System.out.println("A==B?:" + A.equals(B) + ",A=" + A + ",B=" + B);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
