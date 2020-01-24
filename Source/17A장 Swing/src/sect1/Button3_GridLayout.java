package sect1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button3_GridLayout {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Grid ���̾ƿ� ����");
			
			// windows�� ���̾ƿ��� GridLayout���� ���� ���� ���������� 10
			this.setLayout(new GridLayout(3, 3, 10, 10));
			
			
			// ��ư�� 9���� JButton �迭�� �����.
			JButton[] btn = new JButton[9];
			
			// 9�� ¥���� ��ư �迭�� �ݺ������� �߰��ϱ�
			for(int i = 0; i < 9; i++) {
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
