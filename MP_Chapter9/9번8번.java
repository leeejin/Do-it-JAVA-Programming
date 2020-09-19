package protect;
import javax.swing.*;
import java.awt.*;
public class Java9_8 extends JFrame {
	public Java9_8() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		Container c = getContentPane();
		JPanel pn = new JPanel();
		JPanel ps = new JPanel();
		JPanel pc = new JPanel();
		
		pn.setBackground(Color.LIGHT_GRAY);
		pc.setLayout(null);
		pc.setBackground(Color.WHITE);
		ps.setBackground(Color.YELLOW);
		
		c.add(pc);
		c.add(pn,BorderLayout.NORTH);
		c.add(ps,BorderLayout.SOUTH);
		
		JButton btn1 = new JButton("열기");
		JButton btn2 = new JButton("닫기");
		JButton btn3 = new JButton("나가기");
		pn.add(btn1);
		pn.add(btn2);
		pn.add(btn3);
		
		JButton btn4 = new JButton("Word Input");
		JTextField jf = new JTextField(20);
		ps.add(btn4);
		ps.add(jf);
		
				for(int i=0; i<10; i++) {
					int x = (int)(Math.random()*200)+50;
					int y = (int)(Math.random()*200)+50;
					JLabel la = new JLabel("*");
					la.setBounds(x, y,10,10);
					pc.add(la);
				}
				pc.revalidate();
				pc.repaint();
			
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java9_8();
	}
}
