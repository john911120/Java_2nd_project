package sect1;

import java.awt.*;
import javax.swing.*;

/*
 	JToogleButton, JButton, JCheckBox, JRadioButton ����
 */
public class Swing_Component2 {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ����2");
						
			// ���̾ƿ��� FlowLayout���� �����Ѵ�.
			this.setLayout(new FlowLayout());
			
			/*
			 	�̹��� �������� 2�� �����.
			 	1�� ��ư���� �̹����� ���ڰ� ��� ��Ÿ������ �����Ѵ�.
			 	���̺� ���� �Ǵ� �̹����� ǥ���ǵ��� �����Ѵ�.
			 */
			ImageIcon img1 = new ImageIcon("image/G36_S.png");
			ImageIcon img2 = new ImageIcon("image/G36C.png");
			
			JButton btn1 = new JButton("��ư1", img1);
			this.add(btn1);
			
			JLabel lbl1 = new JLabel("1�� ���̺�");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);
			
			/*
			  	üũ�ڽ� 3���� �غ��ϰ� 3��° üũ�ڽ��� üũ�� �ǵ��� true���� ����
			  	��ư �׷��� �غ��ϰ� ���� ��ư 3���� �׷쿡 ���Խ�Ų��.
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
