package sect2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 	버튼을 누를 떄 버튼의 색상이 변한다.
	 	작성일 : 0116
	 */

public class EventAction1 {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마우스 이벤트 처리");
		
		this.setLayout(new FlowLayout());
		
		// 버튼이 눌릴 때 작동하는 리스너를 정의한다. 실제 작동하는 부분은 actionPerformed 이다.
		JButton btn1 = new JButton("테스트");
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

