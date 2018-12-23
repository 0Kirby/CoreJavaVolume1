package cp8;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void download(String url, String saveDir, String fileName) {
		BufferedOutputStream bos = null;
		InputStream is = null;
		
		try {
			byte[] buff = new byte[4096];
			is = new URL(url).openStream();
			
			File file = new File(saveDir, fileName);
			file.getParentFile().mkdirs();
			
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			int c = 0;
			while ((c = is.read(buff)) != -1) {
				bos.write(buff, 0, c);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("–¥»Î ß∞‹£°£°£°");
		} 
		
		
		
		
		finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}