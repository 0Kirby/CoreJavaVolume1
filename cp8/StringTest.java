package cp8;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("abcde百度经验");
		System.out.println(sb);
		int l = sb.length();
		//String s = "abcde百度经验";  int l = s.getlength();
		
		for(int i=0;i<l;i++) {
			sb.insert(2*i, ' ');
		}
		
		System.out.println(sb);
	}

}
