package sect3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
	  �޴��� �������� Ŭ���ϸ� ���̺��� ���ڰ� �ٲ�� ����� ������ ���α׷�
	  �ۼ��� : 0116
	 */

public class Menu_Sample {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�޴��� ������ָ�");
		this.setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("���Ⱑ �ٲ��.");
		this.add(lbl);
		
		// �޴��� �޴�, �޴� �������� �ִ´�.
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		
		JMenuItem newItem = new JMenuItem("new Document");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem closeItem = new JMenuItem("exit");
		
		// �޴��ٸ� JFrame�� �����Ѵ�.
		setJMenuBar(menuBar);
		
		// ���� �޴��� �ش��ϴ� �޴�2���� �޴��ٿ� �����Ѵ�.
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		// ���� �޴��� �ش��ϴ� �޴� �������� File �޴��� �����Ѵ�.
		// �̸� �����ϱ� ���� ���м��� �߰����ش�.
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(closeItem);
		
		// new Document�޴� �������� �����ϸ� �۵��ϴ� �����ʸ� �����.
		// �����ϰ� ���̺��� ���ڸ� �ٲٴ� ��ɵ� �߰������.
		newItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("You chosen a New Document Tab");
			}
			
		});
		
		openItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("You Choose Open Tab");
			}
		});
		
		// exit �޴� �������� �����ϸ� ���� ���α׷��� ����ȴ�.
		closeItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		setSize(200, 200);
		setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}

}
