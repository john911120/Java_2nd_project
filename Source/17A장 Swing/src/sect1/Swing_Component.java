package sect1;

import java.awt.*;
import javax.swing.*;

public class Swing_Component {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ����1");
			
			// ���α׷��� ������ ����� �ϱ� ���� ����
			Container c = this.getContentPane();
			c.setBackground(Color.YELLOW);
			
			// ���̾ƿ��� FlowLayout���� �����Ѵ�.
			this.setLayout(new FlowLayout());
			
			/*
			 	��ư�� �����Ѵ�.
			 	1�� ��ư�� ����� ���������� ���ڻ��� ����ȫ������ �����Ѵ�.
			 	2�� ��ư�� ���� ��� ����ü�� ��Ʈ�� �����ϰ� ���� ũ��� 30���� �����Ѵ�. �׸��� ���콺 Ŀ���� ������
			 	ȸ�� ����� Ŀ���� �����ϵ��� �����ϰ� Ŀ���� ������ ������ ��µǵ��� �����Ѵ�.
			 	3�� ��ư�� ����� ���ϰ� ������ �Ѵ�.
			 */
			JButton btn1 = new JButton("��ư1");
			btn1.setBackground(Color.BLACK);
			btn1.setForeground(Color.MAGENTA);
			this.add(btn1);
			
			JButton btn2 = new JButton("��ư2");
			btn2.setFont(new Font("���� ���", Font.BOLD, 30));
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			btn2.setToolTipText("��.. ���� ����? ������ε�..");
			this.add(btn2);
			
			JButton btn3 = new JButton("��ư3");
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
