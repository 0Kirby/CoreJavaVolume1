package cp4;

import java.util.*;

public class DataSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listA = new ArrayList<>();
		List<String> listB = new ArrayList<>();

		listA.add("baidu");
		listB.add("jingyan");

		if (listA != listB) {
			listA.addAll(listB);
		}
		System.out.println(listA);
	}
}
