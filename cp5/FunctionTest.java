package cp5;

import java.lang.reflect.*;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<?> c = Test.class;

		Field[] f = c.getDeclaredFields();
		Method[] m = c.getMethods();
		System.out.println("Fields:");
		for (Field fi : f) {
			System.out.println(fi);
		}
		System.out.println("Methods:");
		for (Method me : m) {
			System.out.println(me);
		}
	
	}

}

class Test<T> {
	private T a;
	private T b;

	Test() {
		a = null;
		b = null;
	}

	public String toString() {
		return a.toString() + b.toString();
	}
}
