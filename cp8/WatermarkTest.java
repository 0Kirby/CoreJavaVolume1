package cp8;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class WatermarkTest {


	public static void TextImage(String inputImagePath,String outputPath,String text,Color color) throws IOException{
		File file = new File(inputImagePath);		
		Image image = ImageIO.read(file);
		BufferedImage bi = new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 =  bi.createGraphics();
		g2.drawImage(image, 0, 0, image.getWidth(null), image.getHeight(null), null);
		g2.setColor(color);
		g2.setFont(new Font("ºÚÌå",Font.BOLD,image.getWidth(null)/300*20));
		g2.drawString(text, 0, image.getHeight(null));
		g2.dispose();
		ImageIO.write(bi, "JPG", new FileOutputStream(outputPath));		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputImagePath = "C:\\Users\\dell\\Pictures\\abc.jpg";
		String outputPath = "C:\\Users\\dell\\Pictures\\abca.jpg";
		String text = "°Ù¶Èid£º12345678900023";
		TextImage(inputImagePath, outputPath, text, Color.BLUE);
	}

		
}
