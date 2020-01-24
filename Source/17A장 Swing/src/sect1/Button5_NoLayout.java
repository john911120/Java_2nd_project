package sect1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button5_NoLayout {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("��.. �����̸� �߾˾Ƶμ��� ���̾ƿ���.. �����");
			
			// layout�� null������ �����Ѵ�.
			this.setLayout(null);
			
			/*
			 	���� ��ư�� ���鶧�� �ݺ����� ����ص� ����������
			 	������ �޸� �ؾ��Ѵٸ� ������ �������Ѵ�.
			 */
			
			// ��ư�� 3���� �����.
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
