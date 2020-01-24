package sect2;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
	 	Ű���� �̺�Ʈ
	 	�ۼ��� : 0116
	 */

public class EventAction3 {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ű���� �̺�Ʈ ó��");
		
		this.setLayout(new FlowLayout());
		
		// �ؽ�Ʈ �ʵ�� ������ �غ��Ѵ�.
		JTextField txt = new JTextField(10);
		JTextArea area = new JTextArea(10, 10);
		this.add(txt);
		this.add(area);
		
		/*
		  �ؽ�Ʈ �ʵ忡�� Ű���带 ������ �۵��ϴ� KeyAdapterŬ������ �����.
		  ���� Ű�� ���� �۵��ϴ� KeyReleased()�� �������̵� ���ش�.
		  - ���� Ű�� �������� key������ �����ϴ� ����� �߰�
		  - ���� Ű�� enterŰ��� �ؽ�Ʈ �ʵ��� ������ �ؽ�Ʈ ������ �߰���Ų��.
		  - \n�� �߰��ؼ� �ٹٲ��� �ǰ� �ϰ� �ؽ�Ʈ �ʵ带 ����� ����� �־���.
		  - 0~9Ű�� ������ �ʾҴٸ� ������ ������ �ϳ� �ٿ��� �ٽ� ����.
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

