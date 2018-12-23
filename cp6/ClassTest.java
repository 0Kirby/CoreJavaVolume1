package cp6;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		s="abcdefABCDEF";
		int c =s.length();
		System.out.println(c);
		String s2 = s.substring(c-1);
		System.out.println(s2); 
	}

}
