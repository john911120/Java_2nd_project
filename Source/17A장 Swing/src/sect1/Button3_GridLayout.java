package sect1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button3_GridLayout {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Grid 레이아웃 예제");
			
			// windows의 레이아웃을 GridLayout으로 설정 수평 수직간격은 10
			this.setLayout(new GridLayout(3, 3, 10, 10));
			
			
			// 버튼을 9개의 JButton 배열을 만든다.
			JButton[] btn = new JButton[9];
			
			// 9개 짜리의 버튼 배열을 반복문으로 추가하기
			for(int i = 0; i < 9; i++) {
				btn[i] = new JButton("버튼" + (i + 1));
				this.add(btn[i]);
			}
			
			setSize(256,256);
			setVisible(true);
		}
}
	public static void main(String[] args) {
		new MyGUI();
	}

}
