package cp10;

import java.awt.*;
import javax.swing.*;

public class NotHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(()->{
			JFrame frame = new NotHelloWorldFrame();
			frame.setTitle("Gnar");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setVisible(true);
		});
	}

}

class NotHelloWorldComponent extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public void paintComponent(Graphics g) {
		g.drawString("Not a Hello,World program!", MESSAGE_X, MESSAGE_Y);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
	}
}

class NotHelloWorldFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotHelloWorldFrame() {
		setLocationByPlatform(true);
		add(new NotHelloWorldComponent());
		pack();
	}
}
