package sect1;

import java.awt.*;
import javax.swing.*;

/*
 	JTextField, JTextArea, JPasswordField 예제
 */
public class Swing_Component3 {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 예제3");
						
			// 레이아웃을 FlowLayout으로 설정한다.
			this.setLayout(new FlowLayout());
			
			/*
			 	한줄을 입력하기 위한 텍스트 필드를 작성하는데 초기의 열 크기는 10으로 설정한다.
			 	여러 줄을 입력하기 위한 텍스트 영역을 준비하는데 행의 수는 5이고 열의 수는 10으로 설정한다.
			 	텍스트 영역에 스크롤바를 넣을 건데 입력하는 행이 5가 넘는다면 스크롤 바가 형성되게 설정
			 	한줄 입력을 하지만 입력내용이 보이지 않는 비밀번호 필드를 넣는다.
			 */
					
			JTextField txt1 = new JTextField(10);
			this.add(txt1);
			
			JTextArea txt2 = new JTextArea(5, 10);
			this.add(txt2);
			this.add(new JScrollPane(txt2));
			
			JPasswordField txt3 = new JPasswordField(10);
			this.add(txt3);
			
			setSize(500, 500);
			setVisible(true);
		}
}

	public static void main(String[] args) {
		new MyGUI();
	}

}
