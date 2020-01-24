package sect1;

import java.awt.*;
import javax.swing.*;

/*
 	JTextField, JTextArea, JPasswordField ����
 */
public class Swing_Component3 {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ����3");
						
			// ���̾ƿ��� FlowLayout���� �����Ѵ�.
			this.setLayout(new FlowLayout());
			
			/*
			 	������ �Է��ϱ� ���� �ؽ�Ʈ �ʵ带 �ۼ��ϴµ� �ʱ��� �� ũ��� 10���� �����Ѵ�.
			 	���� ���� �Է��ϱ� ���� �ؽ�Ʈ ������ �غ��ϴµ� ���� ���� 5�̰� ���� ���� 10���� �����Ѵ�.
			 	�ؽ�Ʈ ������ ��ũ�ѹٸ� ���� �ǵ� �Է��ϴ� ���� 5�� �Ѵ´ٸ� ��ũ�� �ٰ� �����ǰ� ����
			 	���� �Է��� ������ �Է³����� ������ �ʴ� ��й�ȣ �ʵ带 �ִ´�.
			 */
					
			JTextField txt1 = new JTextField(10);
			this.add(txt1);
			
			JTextArea txt2 = new JTextArea(5, 10);
			this.add(txt2);
			this.add(new JScrollPane(txt2));
			
			JPasswordField txt3 = new JPasswordField(10);
			this.add(txt3);
			
			setSize(500, 500);
			setVisible(true);
		}
}

	public static void main(String[] args) {
		new MyGUI();
	}

}
