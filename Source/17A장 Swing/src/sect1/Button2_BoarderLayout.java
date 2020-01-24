package sect1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button2_BoarderLayout {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("버튼 레이아웃 예제");
			
			// windows의 레이아웃을 BoarderLayout으로 설정 수평 수직간격은 10
			this.setLayout(new BorderLayout(10, 10));
			
			
			// 버튼을 만들면서 위치 다른 곳에 지정이 가능하다.
			JButton btn1 = new JButton("버튼1");
			this.add(btn1, BorderLayout.NORTH);
			
			JButton btn2 = new JButton("버튼2");
			this.add(btn2, BorderLayout.WEST);
			
			JButton btn3 = new JButton("버튼3");
			this.add(btn3, BorderLayout.CENTER);
			
			JButton btn4 = new JButton("버튼4");
			this.add(btn4, BorderLayout.EAST);
			
			JButton btn5 = new JButton("버튼5");
			this.add(btn5, BorderLayout.SOUTH);
			
			setSize(256,256);
			setVisible(true);
		}
}
	public static void main(String[] args) {
		new MyGUI();
	}

}
