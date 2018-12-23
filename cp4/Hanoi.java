package cp4;

import java.util.*;

public class Hanoi {

	static void swap(char a, char b) {
		System.out.println(a + "->" + b);
	}

	static void HanoiMove(int n, char a, char b, char c) {
		if (n == 1)
			swap(a, c);
		else {
			HanoiMove(n - 1, a, c, b); //把左边除了最底下的都移到中间
			swap(a, c); //把左边最下面的移到最右边
			HanoiMove(n - 1, b, a, c); //把中间的借助最左边的都移到最右边
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		char a = 'A';
		char b = 'B';
		char c = 'C';

		HanoiMove(n, a, b, c);

		sc.close();
	}

}
