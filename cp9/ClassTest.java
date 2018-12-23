package cp9;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Baidu baidu = new Baidu("jingyan","index");
		
		Baidu baidu2 = new Baidu();
		baidu2.setS1("jingyan");
		baidu2.setS2("index");
		
		System.out.println(baidu.getS1());
		System.out.println(baidu2.getS2());
	}

}

class Baidu {
	
	private String s1;
	private String s2;

	Baidu() {
		this.s1 = null;
		this.s2 = null;
	}

	Baidu(String s1,String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	
}
