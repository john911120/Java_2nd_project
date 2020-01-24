package sect1;

import java.awt.*;
import javax.swing.*;

public class Swing_Component {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 예제1");
			
			// 프로그램의 배경색을 노랗게 하기 위한 설정
			Container c = this.getContentPane();
			c.setBackground(Color.YELLOW);
			
			// 레이아웃을 FlowLayout으로 설정한다.
			this.setLayout(new FlowLayout());
			
			/*
			 	버튼을 설정한다.
			 	1번 버튼은 배경을 검은색으로 글자색은 연분홍색으로 설정한다.
			 	2번 버튼은 맑은 고딕 볼드체로 폰트를 설정하고 글자 크기는 30으로 설정한다. 그리고 마우스 커서를 놓으면
			 	회전 모양의 커서로 변경하도록 설정하고 커서를 놓으면 툴팁이 출력되도록 설정한다.
			 	3번 버튼은 사용을 못하게 설정을 한다.
			 */
			JButton btn1 = new JButton("버튼1");
			btn1.setBackground(Color.BLACK);
			btn1.setForeground(Color.MAGENTA);
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			btn2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			btn2.setToolTipText("아.. ㅅㅂ 뭐냐? 목욕중인데..");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			btn3.setEnabled(false);
			this.add(btn3);
			
			setSize(256, 256);
			setVisible(true);
		}
}

	public static void main(String[] args) {
		new MyGUI();
	}

}
