package sect1;

import java.awt.*;
import javax.swing.*;

/*
 	JList, JComboBox ����
 */
public class Swing_Component4 {
	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ����4");
						
			// ���̾ƿ��� FlowLayout���� �����Ѵ�.
			this.setLayout(new FlowLayout());
			
			/*
			  ����Ʈ�� ����� ���ڿ� �迭�� �����.
			 */
			
			String[] weapon = {"G36","G36C","K5","TAR-21","RO635","WA2000","SVD","M950"};
			
			/*
			   JList, JComboBox�� �����ϸ鼭 ��� �ڵ��� ���� �迭�� �����Ѵ�.
			 */
			
			JList list = new JList(weapon);
			this.add(list);
					
			JComboBox combo = new JComboBox(weapon);
			this.add(combo);
			
			setSize(500, 500);
			setVisible(true);
		}
}

	public static void main(String[] args) {
		new MyGUI();
	}

}
