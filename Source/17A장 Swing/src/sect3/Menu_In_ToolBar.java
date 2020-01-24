package sect3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

/*
	  �޴��� �������� Ŭ���ϸ� ���̺��� ���ڰ� �ٲ�� ����� ������ ���α׷�
	  �ۼ��� : 0116
	 */

public class Menu_In_ToolBar {
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
		
		// ������ ���������� ����� ��ư 3���� �����.
				JToolBar toolBar1 = new JToolBar();
				
				JButton newItem1 = new JButton("new Document");
				JButton openItem1 = new JButton("Open");
				JButton closeItem1 = new JButton("Exit");
				
				// ���ٸ� JFrame�� ���δ�. �ʱ� ������ ��ġ�� ��� ���ʿ� �д�. ��������,�߾� �߿��� �����Ѵ�.
				add(toolBar1, BorderLayout.NORTH);
				
				// ���� ������ 3���� ���ٿ� �ٿ��ش�. �и����� �߰��ߴ�.
				toolBar1.add(newItem1);
				toolBar1.add(openItem1);
				toolBar1.addSeparator(new Dimension(20,10)); // �и���
				toolBar1.add(closeItem1);
				
				JLabel lbl1 = new JLabel("���� �� ���ڰ� �ٲ�ٰ� �̻������!");
				this.add(lbl1);
				
				
				// 3���� ��ư �����ʸ� �����.
				newItem.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						lbl1.setText("You chosen a New Document Tab");
					}
					
				});
				
				openItem.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						lbl1.setText("You Choose Open Tab");
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
