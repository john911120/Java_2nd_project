package sect2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 	��ư�� ���� �� ��ư�� ������ ���Ѵ�.
	 	�ۼ��� : 0116
	 */

public class EventAction1 {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���콺 �̺�Ʈ ó��");
		
		this.setLayout(new FlowLayout());
		
		// ��ư�� ���� �� �۵��ϴ� �����ʸ� �����Ѵ�. ���� �۵��ϴ� �κ��� actionPerformed �̴�.
		JButton btn1 = new JButton("�׽�Ʈ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setBackground(Color.RED);
			}
		});
		this.add(btn1);
		
		setSize(200, 200);
		setVisible(true);
	}
}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}

