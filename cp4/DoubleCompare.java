package cp4;

public class DoubleCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=1.555555555555555;
		double b=1.555555555555556;
		double c=1.55;
		double d=1.555;
		
		System.out.println(a==b);
		System.out.println(c==d);
		
		System.out.println(Math.abs(a-b)<=0.00005);
		System.out.println(Math.abs(c-d)<=0.00005);
		
	}

}
