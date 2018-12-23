package cp4;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][][] = new int[4][3][2];
		a[1][1][1] = 10;
		a[2][2][1] = 20;
		a[0][0][0] = 30;
		for (int[][] i : a)
			for (int[] i2 : i)
				for (int i3 : i2)
					System.out.println(i3);
	}

}
