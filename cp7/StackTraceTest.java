package cp7;

import java.util.*;

public class StackTraceTest {

	public static int factorial(int n) {
		System.out.println("factorial(" + n + "):");
		int r;
		Throwable t = new Throwable();
		StackTraceElement[] frames = t.getStackTrace();
		for (StackTraceElement f : frames)
			System.out.println(f);
		if (n <= 1)
			r = 1;
		else
			r = n * factorial(n - 1);
		System.out.println("return " + r);
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		a = factorial(n);
		System.out.println("answer=" + a);
		in.close();
	}

}
