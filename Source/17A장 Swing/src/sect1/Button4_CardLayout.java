package sect1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button4_CardLayout {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Card ���̾ƿ� ����");
			
			// windows�� ���̾ƿ��� CardLayout���� ���� ���� ���������� 10
			this.setLayout(new CardLayout(10, 10));
			
			/*
			 	�ټ��� ��ư�� ���� ���� ������ �ۼ��� ���� ����
			 	�ݺ����� Ȱ���ϸ� ���� ����.
			 */
			
			// ��ư�� 3���� �����.
			JButton[] btn = new JButton[3];
			
			// 9�� ¥���� ��ư �迭�� �ݺ������� �߰��ϱ�
			for(int i = 0; i < 3; i++) {
				btn[i] = new JButton("��ư" + (i + 1));
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
