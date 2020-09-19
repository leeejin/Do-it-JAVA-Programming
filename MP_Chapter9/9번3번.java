package protect;
import javax.swing.*;
import java.awt.*;
public class Java9_3 extends JFrame {
	public Java9_3() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid =new GridLayout();
		Container c = getContentPane();
		c.setLayout(grid);
		
		c.add(new JButton("0"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java9_3();
	}
}
