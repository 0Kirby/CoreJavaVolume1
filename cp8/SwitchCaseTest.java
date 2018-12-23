package cp8;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		sc.close();

		switch (s) {
		case "abc":
			System.out.println("yes");
			break;
		case "def":
			System.out.println("no");
			break;
		default:
			System.out.println("error!");
			break;
		}

	}

}
