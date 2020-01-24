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
	  툴바 구현하기
	  작성일 : 0116
	 */

public class ToolBar_Sample {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("툴바나 x먹어 이 xx들아!");
		this.setLayout(new FlowLayout());
		
		// 툴바의 아이템으로 사용할 버튼 3개를 만든다.
		JToolBar toolBar = new JToolBar();
		
		JButton newItem = new JButton("new Document");
		JButton openItem = new JButton("Open");
		JButton closeItem = new JButton("Exit");
		
		// 툴바를 JFrame에 붙인다. 초기 툴바의 위치는 상단 북쪽에 둔다. 동서남북,중앙 중에서 지정한다.
		add(toolBar, BorderLayout.NORTH);
		
		// 툴바 아이템 3개를 툴바에 붙여준다. 분리선도 추가했다.
		toolBar.add(newItem);
		toolBar.add(openItem);
		toolBar.addSeparator(new Dimension(20,10)); // 분리선
		toolBar.add(closeItem);
		
		JLabel lbl = new JLabel("여기 이 글자가 바뀐다고 이새끼들아!");
		this.add(lbl);
		
		
		// 3개의 버튼 리스너를 만든다.
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
		
		// exit 메뉴 아이템을 선택하면 응용 프로그램이 종료된다.
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
