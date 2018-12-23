package cp8;

import java.time.*;

public class PairTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate[] birthdays = { LocalDate.of(1906, 12, 9), LocalDate.of(1815, 12, 10), LocalDate.of(1903, 12, 3),
				LocalDate.of(1910, 6, 22) };
		Pair<LocalDate> mm = ArrayAlg2.minmax(birthdays);
		System.out.println("min=" + mm.getFirst());
		System.out.println("max=" + mm.getSecond());
	}
}

class ArrayAlg2 {
	public static <T extends Comparable<? super T>> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];
		for (T ld : a) {
			if (min.compareTo(ld) > 0)
				min = ld;
			if (max.compareTo(ld) < 0)
				max = ld;
		}
		return new Pair<>(min, max);
	}
}
