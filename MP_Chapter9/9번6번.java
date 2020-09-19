package protect;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
public class Java9_6 extends JFrame {
	public Java9_6() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(null); //컨텐트팬의 배치관리자 제거
		
		for(int i=0; i<20; i++) {
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			
			JLabel label = new JLabel((int)(Math.random()*100)+"");
			//label.setLocation(x,y); 컴포넌트 왼쪽 상단 모서리 좌표(x,y) 설정
			label.setBounds(x,y,10,10); //크기와 위치 동시 설정
			label.setBackground(Color.BLUE);
			label.setOpaque(true);
			c.add(label);
			
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java9_6();
	}
}