package cp8;

public class MemoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		s1 = null;
		System.out.println(System.identityHashCode(s1));

	}

}
