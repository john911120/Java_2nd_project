package sect3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

/*
	  ���� �����ϱ�
	  �ۼ��� : 0116
	 */

public class ToolBar_Sample {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���ٳ� x�Ծ� �� xx���!");
		this.setLayout(new FlowLayout());
		
		// ������ ���������� ����� ��ư 3���� �����.
		JToolBar toolBar = new JToolBar();
		
		JButton newItem = new JButton("new Document");
		JButton openItem = new JButton("Open");
		JButton closeItem = new JButton("Exit");
		
		// ���ٸ� JFrame�� ���δ�. �ʱ� ������ ��ġ�� ��� ���ʿ� �д�. ��������,�߾� �߿��� �����Ѵ�.
		add(toolBar, BorderLayout.NORTH);
		
		// ���� ������ 3���� ���ٿ� �ٿ��ش�. �и����� �߰��ߴ�.
		toolBar.add(newItem);
		toolBar.add(openItem);
		toolBar.addSeparator(new Dimension(20,10)); // �и���
		toolBar.add(closeItem);
		
		JLabel lbl = new JLabel("���� �� ���ڰ� �ٲ�ٰ� �̻������!");
		this.add(lbl);
		
		
		// 3���� ��ư �����ʸ� �����.
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
