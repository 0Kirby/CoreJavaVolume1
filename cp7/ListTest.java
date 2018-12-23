package cp7;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> lista = new ArrayList<>();
		lista.add(10);
		list.add(lista);
		System.out.println(list.get(0).get(0));
	}

}
