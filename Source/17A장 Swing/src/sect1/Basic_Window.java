package sect1;

import javax.swing.JFrame;

// Swing GUI���α׷� �⺻ ���� Ʋ

public class Basic_Window {
	// JFrame�� ��� �޴� Ŭ���� ����
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư�� ������ ���α׷� ����
			
			setTitle("Swing �⺻â"); // ���α׷� ����ֱ� ���� ����
			
			// ��ư, ���̺�, üũ�ڽ� �ڵ� �κ�
			
			
			setSize(500, 500); // ũ�� ����
			setVisible(true); // ���α׷��� ���̰� �Ѵ�.
		}
	}
	
	
	public static void main(String[] args) {
		// main�޼ҵ忡�� MyGUIŬ������ �����. 
		// MyGUI()�����ڰ� ����ǹǷ� ���α׷��� ����ȴ�.
		new MyGUI();
	}

}
