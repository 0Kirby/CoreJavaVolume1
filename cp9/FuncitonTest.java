package cp9;

public class FuncitonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baidu2 baidu = new Baidu2("jingyan",123);
		System.out.println(baidu.toString());
	}

}

class Baidu2 {

	private String s;
	private int a;

	public Baidu2(String s, int a) {
		this.s = s;
		this.a = a;
	}

	public Baidu2() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a + s;
	}

}
