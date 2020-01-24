package sect2;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
	 	키보드 이벤트
	 	작성일 : 0116
	 */

public class EventAction3 {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("키보드 이벤트 처리");
		
		this.setLayout(new FlowLayout());
		
		// 텍스트 필드와 영역을 준비한다.
		JTextField txt = new JTextField(10);
		JTextArea area = new JTextArea(10, 10);
		this.add(txt);
		this.add(area);
		
		/*
		  텍스트 필드에서 키보드를 누르면 작동하는 KeyAdapter클래스를 만든다.
		  또한 키를 떼면 작동하는 KeyReleased()를 오버라이딩 해준다.
		  - 눌린 키의 정수값을 key변수에 저장하는 기능을 추가
		  - 눌린 키가 enter키라면 텍스트 필드의 내용을 텍스트 영역에 추가시킨다.
		  - \n을 추가해서 줄바꿈이 되게 하고 텍스트 필드를 지우는 기능을 넣었다.
		  - 0~9키가 눌리지 않았다면 글자의 개수를 하나 줄여서 다시 쓴다.
		 */
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int key = e.getKeyCode();
				
				if(key == KeyEvent.VK_ENTER) {
					String str = txt.getText();
					area.setText(area.getText() + str + '\n');
					txt.setText("");
				}
				
				if(!(key >= KeyEvent.VK_NUMPAD0&& key <= KeyEvent.VK_NUMPAD9)) {
					String str = txt.getText();
					int strlen = str.length();
					if(strlen != 0)
						txt.setText(str.substring(0, strlen -1));
				}
		}

		});
		
		setSize(200	, 200);
		setVisible(true);
	}
}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}

