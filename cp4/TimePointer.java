package cp4;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimePointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener listener = (ActionEvent) -> {
			System.out.println("����ʱ�̣� " + new Date());
			Toolkit.getDefaultToolkit().beep();
		};
		Timer t = new Timer(1000, listener);
		t.start();

		JOptionPane.showMessageDialog(null, "�Ƿ��˳�����");
		System.exit(0);
	}

}
