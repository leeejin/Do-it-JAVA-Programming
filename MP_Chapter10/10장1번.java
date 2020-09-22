package protect;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Java10_1 extends JFrame {
	public Java10_1() {
		setTitle("마우스 올리기 내리기");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Love Java");
		
		la.addMouseListener(new MyMouseAdapter());
		
		la.setSize(200,50);
		add(la);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java10_1();
	}
	class MyMouseAdapter extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			l.setText("사랑해");
		}
		public void mouseExited(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			l.setText("Love Java");
		}
	}
}
