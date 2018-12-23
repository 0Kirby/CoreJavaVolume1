package cp4;

public class BucketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bucket<String> bc1 = new Bucket<>();
		bc1.setEle1("xqjtqy");
		bc1.setEle2("com");
		Bucket<String> bc2 = new Bucket<>("baidu","jingyan");
		
		System.out.println(bc2.getEle1());
		bc2=null;
	}
}

class Bucket<T> {
	T ele1;
	T ele2;

	public Bucket(T ele1, T ele2) {
		this.ele1 = ele1;
		this.ele2 = ele2;
	}

	public Bucket() {
		this.ele1 = null;
		this.ele2 = null;
	}

	public T getEle1() {
		return ele1;
	}

	public void setEle1(T ele1) {
		this.ele1 = ele1;
	}

	public T getEle2() {
		return ele2;
	}

	public void setEle2(T ele2) {
		this.ele2 = ele2;
	}

	
}
