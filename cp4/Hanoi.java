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
			HanoiMove(n - 1, a, c, b); //����߳�������µĶ��Ƶ��м�
			swap(a, c); //�������������Ƶ����ұ�
			HanoiMove(n - 1, b, a, c); //���м�Ľ�������ߵĶ��Ƶ����ұ�
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
