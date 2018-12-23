package cp9;

import java.util.*;

public class QuantityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		double result;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		result = 0.4 * a + 0.3 * b + 0.2 * c;

		System.out.println("量化总分为："+result);
		
		if(result<60)
			System.out.println("量化结果为下");
		else if(result<80)
			System.out.println("量化结果为：中");
		else
			System.out.println("量化结果为：上");
		
		
		

	}

}
