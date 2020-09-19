package protect;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
public class Java9_4 extends JFrame {
	public Java9_4() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		JButton [] b = new JButton [10];
		Color [] color = {Color.RED,Color.ORANGE,Color.YELLOW
						,Color.GREEN,Color.CYAN,Color.BLUE,
						Color.MAGENTA,Color.GRAY,Color.PINK,
						Color.LIGHT_GRAY};
		for(int i=0; i<b.length; i++) {
			b[i] = new JButton(Integer.toString(i));
			b[i].setOpaque(true);
			b[i].setBackground(color[i]);
			c.add(b[i]);
		}
		
		
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java9_4();
	}
}