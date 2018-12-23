package cp9;

import java.util.Scanner;

public class Maintenance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		
		if(i>50)
			System.out.println("big");
	
		if(i>100)
			System.out.println("bigger");
		
		s.close();
	}

}
