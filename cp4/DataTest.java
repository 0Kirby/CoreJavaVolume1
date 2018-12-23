package cp4;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[]= {1,2,3,4,5,6,7,8,9,10};
		
		int fre[]= {0,0,0,0,0,0,0,0,0,0};
		
		int col = 3;
		System.out.println(data[col]);
		fre[col]++;
		
		System.out.println(fre[col]);
	}

}
