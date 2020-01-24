package sect1;

import java.awt.*;
import javax.swing.*;

/*
 	JToogleButton, JButton, JCheckBox, JRadioButton 예제
 */
public class Swing_Component2 {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 예제2");
						
			// 레이아웃을 FlowLayout으로 설정한다.
			this.setLayout(new FlowLayout());
			
			/*
			 	이미지 아이콘을 2개 만든다.
			 	1번 버튼에는 이미지와 문자가 모두 나타나도록 설정한다.
			 	레이블에 문자 또는 이미지가 표현되도록 설정한다.
			 */
			ImageIcon img1 = new ImageIcon("image/G36_S.png");
			ImageIcon img2 = new ImageIcon("image/G36C.png");
			
			JButton btn1 = new JButton("버튼1", img1);
			this.add(btn1);
			
			JLabel lbl1 = new JLabel("1번 레이블");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);
			
			/*
			  	체크박스 3개를 준비하고 3번째 체크박스는 체크가 되도록 true으로 설정
			  	버튼 그룹을 준비하고 라디오 버튼 3개를 그룹에 포함시킨다.
			 */
			
			JCheckBox chk1 = new JCheckBox("G36");
			JCheckBox chk2 = new JCheckBox("G36K");
			JCheckBox chk3 = new JCheckBox("MG36", true);
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);
			
			JRadioButton rdo1 = new JRadioButton("AR");
			JRadioButton rdo2 = new JRadioButton("SMG");
			JRadioButton rdo3 = new JRadioButton("MG");
			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);
			
			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);
			
			setSize(800, 600);
			setVisible(true);
		}
}

	public static void main(String[] args) {
		new MyGUI();
	}

}
