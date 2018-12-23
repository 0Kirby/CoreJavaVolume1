package cp9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> words = new HashSet<>();
		long totalTime = 0;

		try (Scanner in = new Scanner(new File("F:\\Python\\javatest.txt"))) {
			while (in.hasNext()) {
				String word = in.next();
				long callTime = System.currentTimeMillis();
				words.add(word);
				callTime = System.currentTimeMillis() - callTime;
				totalTime += callTime;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Iterator<String> iter = words.iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		System.out.println("...");
		System.out.println(words.size() + " distinct words." + totalTime + " milliseconds.");
	}

}
