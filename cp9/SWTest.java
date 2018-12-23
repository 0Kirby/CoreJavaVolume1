package cp9;

import java.util.*;

public class SWTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("ab");
		String s2 = new String("cd");
		String s3 = new String("ef");
		String s4 = new String("gh");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		switch(s) {
		case "ab":
			System.out.println(s1);
		case "cd":
			System.out.println(s2);
		case "ef":
			System.out.println(s3);
		case "gh":
			System.out.println(s4);
		}
		
		sc.close();
	}

}
