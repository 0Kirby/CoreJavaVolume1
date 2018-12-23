package cp8;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Html2Image {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		JEditorPane jep = new JEditorPane(new URL("http://www.baidu.com"));
		jep.setSize(10000, 10000);

		BufferedImage image = new BufferedImage(jep.getWidth(), jep.getHeight(), BufferedImage.TYPE_INT_ARGB);

		SwingUtilities.paintComponent(image.createGraphics(), jep, new JPanel(), 0, 0, image.getWidth(),
				image.getHeight());
		ImageIO.write((RenderedImage) image, "png", new File("output.png"));

	}

}
