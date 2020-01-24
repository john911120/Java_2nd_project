package sect1;

import java.awt.*;
import javax.swing.*;

/*
 	JList, JComboBox 예제
 */
public class Swing_Component4 {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 예제4");
						
			// 레이아웃을 FlowLayout으로 설정한다.
			this.setLayout(new FlowLayout());
			
			/*
			  리스트에 출력할 문자열 배열을 만든다.
			 */
			
			String[] weapon = {"G36","G36C","K5","TAR-21","RO635","WA2000","SVD","M950"};
			
			/*
			   JList, JComboBox를 생성하면서 상기 코드의 문자 배열을 지정한다.
			 */
			
			JList list = new JList(weapon);
			this.add(list);
					
			JComboBox combo = new JComboBox(weapon);
			this.add(combo);
			
			setSize(500, 500);
			setVisible(true);
		}
}

	public static void main(String[] args) {
		new MyGUI();
	}

}
