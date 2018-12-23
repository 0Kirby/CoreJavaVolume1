package cp6;

import java.awt.Toolkit;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted in length:");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		/*Arrays.sort(planets, new Comparator<String>() {

			@Override
			public int compare(String first, String second) {
				// TODO Auto-generated method stub
				return first.length() - second.length();
			}
		});*/
		System.out.println(Arrays.toString(planets));

		Timer t = new Timer(1000, event -> {
			System.out.println("The time is " + new Date());
			Toolkit.getDefaultToolkit().beep();
		});
		// Timer s = new Timer(1000, System.out::println);
		t.start();

		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
