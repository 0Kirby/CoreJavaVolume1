package cp6;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class TimePrinter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("At the tone, the time is "+ new Date());
		Toolkit.getDefaultToolkit().beep();
	}

}
