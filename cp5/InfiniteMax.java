package cp5;

public class InfiniteMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(1,2,3));
	}

	public static double max(double... values) {
		double largest = Double.NEGATIVE_INFINITY;
		for (double v : values)
			if (v > largest)
				largest = v;
		return largest;

	}

}
