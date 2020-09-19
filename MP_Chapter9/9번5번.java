package protect;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
public class Java9_5 extends JFrame {
	public Java9_5() {
		setTitle("4X4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,300);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		JButton [] b = new JButton [16];
		Color [] color = {Color.RED,Color.ORANGE,Color.YELLOW
						,Color.GREEN,Color.CYAN,Color.BLUE,
						Color.MAGENTA,Color.GRAY,Color.PINK,
						Color.LIGHT_GRAY,Color.WHITE,Color.DARK_GRAY,
						Color.BLACK,Color.orange,Color.blue,Color.magenta};
		for(int i=0; i<b.length; i++) {
			JLabel la = new JLabel(i+"");
			la.setBackground(color[i]);
			la.setOpaque(true);
			c.add(la);
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java9_5();
	}
}
