package protect;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
public class Java9_7 extends JFrame {
	public Java9_7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		Container c = getContentPane();
		JPanel pn = new JPanel();
		JPanel ps = new JPanel();
		JPanel pc = new JPanel();
		
		pn.setBackground(Color.LIGHT_GRAY);
		pc.setLayout(new GridLayout(4,2));
		ps.setBackground(Color.YELLOW);
		
		c.add(pc);
		c.add(pn,BorderLayout.NORTH);
		c.add(ps,BorderLayout.SOUTH);
		
		JLabel la1 = new JLabel("수식입력");
		JTextField tf1 = new JTextField(20);
		pn.add(la1);
		pn.add(tf1);
		
		JLabel la2 = new JLabel("계산결과");
		JTextField tf2 = new JTextField(20);
		ps.add(la2);
		ps.add(tf2);
		
		String[] str = {"CE","계산","+","-","x","/"};
		for(int i=0; i<16; i++)
		{
			JButton b = new JButton();
			if(i<10) 
				b.setText(i+"");
			else
				b.setText(str[i-10]);
			if(i>10) {
				b.setBackground(Color.CYAN);
				b.setOpaque(true);}
				pc.add(b);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java9_7();
	}
}