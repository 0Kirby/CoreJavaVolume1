package cp6;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<String> comp = new LengthComparator();
		String[] friends = { "Peter", "Paul", "Mary" };
		for(String s : friends)
		System.out.print(s+",");
		System.out.println();
		Arrays.sort(friends, comp);
		for(String s : friends)
		System.out.print(s+",");

	}

	@Override
	public int compare(String first, String second) {
		// TODO Auto-generated method stub
		return first.length() - second.length();
	}

}
