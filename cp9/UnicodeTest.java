package cp9;

import java.util.*;

public class UnicodeTest {
    public static void main(String[] args) {
    	
    	String st = new String();
    	Scanner s = new Scanner(System.in);
    	st = s.nextLine();
        String string = unicodeToString(st);
        System.out.println(string);
        s.close();
    }


    public static String unicodeToString(String unicode) {
        StringBuffer string = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            int data = Integer.parseInt(hex[i], 16);
            string.append((char) data);
        }
        return string.toString();
    }
}


