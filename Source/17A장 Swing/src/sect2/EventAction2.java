package sect2;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

/*
	 	���콺 Ŭ�� �� �� ��ǥ�� �ʵ忡 ä������ ���α׷� �ۼ�
	 	�ۼ��� : 0116
	 */

public class EventAction2 {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���콺 �̺�Ʈ ó��2");
		
		this.setLayout(new FlowLayout());
		
		// x,y��ǥ�� ä���� �ؽ�Ʈ �ʵ带 �غ��Ѵ�.
		JTextField txtX = new JTextField(10);
		JTextField txtY = new JTextField(10);
		this.add(txtX);
		this.add(txtY);
		
		// ���콺 �̺�Ʈ�� �����ʸ� JFrame(=this)�� �����Ѵ�.
		/*
		  mouseClicked�޼ҵ�� ���콺�� Ŭ���ϸ� ����ȴ�. 
		  e�� getX()�� Ŭ���� ������ x��ǥ�� ��ȯ�Ѵ�. �� ���� �ؽ�Ʈ �ʵ忡 ���ڿ��� ����ߴ�.
		  ������ ���콺 ���� �޼ҵ嵵 MouseListener �������̽��� �߻� �޼ҵ��̹Ƿ� �ڵ��� �ؾ��ϴµ�
		  ������ ��� �־ ��� ����.
		 */
		this.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				txtX.setText(Integer.toString(e.getX()));
				txtY.setText(Integer.toString(e.getY()));
		}

			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		
		setSize(500	, 200);
		setVisible(true);
	}
}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}

