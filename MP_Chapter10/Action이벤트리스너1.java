package protect;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Action_Event1 extends JFrame {
	public Action_Event1() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(500,200);
		setVisible(true);
	}
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) 
				btn.setText("액션");
			else
				btn.setText("Action");
			
			Action_Event1.this.setTitle(btn.getText());
		}
	}

	public static void main(String[] args) {
		new Action_Event1();
	}
}
