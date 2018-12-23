package cp9;

import java.util.*;

public class CollectionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new LinkedList<>();
		list.add(111);
		list.add(888);
		list.add(444);
		list.add(666);
		list.add(333);
		list.add(777);

		Iterator<Integer> ie = list.iterator();
		while (ie.hasNext()) {
			System.out.println(ie.next());
		}
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 777));
		//Collections.reverse(list);
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2,o1);
			}
			
		});
		
		System.out.println(list);
	}

}
