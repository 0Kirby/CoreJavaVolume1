package cp9;

import java.io.*;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("F:\\Python\\test.csv");
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
