package sect1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button5_NoLayout {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("어.. 하필이면 잘알아두세요 레이아웃은.. 읎어요");
			
			// layout을 null값으로 설정한다.
			this.setLayout(null);
			
			/*
			 	같은 버튼을 만들때는 반복문을 사용해도 무방하지만
			 	설정을 달리 해야한다면 일일히 만들어야한다.
			 */
			
			// 버튼을 3개를 만든다.
				JButton btn1 = new JButton("A Button");
				btn1.setBounds(100, 50, 70, 60);
				this.add(btn1);
				
				JButton btn2 = new JButton("B Button");
				btn2.setBounds(80, 80, 70, 60);
				this.add(btn2);
				
				JButton btn3 = new JButton("C Button");
				btn3.setBounds(50, 110, 70, 60);
				this.add(btn3);
			
			setSize(256,256);
			setVisible(true);
		}
}
	public static void main(String[] args) {
		new MyGUI();
	}

}
