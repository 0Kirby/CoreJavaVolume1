package cp4;

public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "baidu";
		System.out.println("����ǰ��" + s);
		String s1 = encrypt(s);
		System.out.println("���ܺ�" + s1);
		String s2 = decrypt(s1);
		System.out.println("���ܺ�" + s2);
	}

	static String encrypt(String s) {
		int length = s.length();
		char c[] = s.toCharArray();
		for (int i = 0; i < length; i++)
			c[i]++;
		return new String(c);
	}

	static String decrypt(String s) {
		int length = s.length();
		char c[] = s.toCharArray();
		for (int i = 0; i < length; i++)
			c[i]--;
		return new String(c);
	}
}
