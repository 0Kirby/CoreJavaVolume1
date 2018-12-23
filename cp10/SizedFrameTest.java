package cp10;

import java.awt.*;
import javax.swing.*;

class SizedFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SizedFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
	}
}

public class SizedFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SizedFrame frame = new SizedFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SizedFrame");
		frame.setVisible(true);
	}

}
