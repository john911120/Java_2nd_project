package sect1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button4_CardLayout {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Card 레이아웃 예제");
			
			// windows의 레이아웃을 CardLayout으로 설정 수평 수직간격은 10
			this.setLayout(new CardLayout(10, 10));
			
			/*
			 	다수의 버튼을 만들 때는 일일이 작성을 하지 말고
			 	반복문을 활용하면 아주 좋다.
			 */
			
			// 버튼을 3개를 만든다.
			JButton[] btn = new JButton[3];
			
			// 9개 짜리의 버튼 배열을 반복문으로 추가하기
			for(int i = 0; i < 3; i++) {
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
