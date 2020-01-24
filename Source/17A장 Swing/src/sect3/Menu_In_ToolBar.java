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
	  메뉴의 아이템을 클릭하면 레이블의 글자가 바뀌는 기능을 구현한 프로그램
	  작성일 : 0116
	 */

public class Menu_In_ToolBar {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴를 만들어주마");
		this.setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("여기가 바뀐다.");
		this.add(lbl);
		
		// 메뉴바 메뉴, 메뉴 아이템을 넣는다.
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		
		JMenuItem newItem = new JMenuItem("new Document");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem closeItem = new JMenuItem("exit");
		
		// 메뉴바를 JFrame에 부착한다.
		setJMenuBar(menuBar);
		
		// 상위 메뉴에 해당하는 메뉴2개를 메뉴바에 부착한다.
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		// 하위 메뉴에 해당하는 메뉴 아이템을 File 메뉴에 부착한다.
		// 이를 구분하기 위한 구분선도 추가해준다.
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(closeItem);
		
		// new Document메뉴 아이템을 선택하면 작동하는 리스너를 만든다.
		// 간단하게 레이블의 글자를 바꾸는 기능도 추가해줬다.
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
		
		// 툴바의 아이템으로 사용할 버튼 3개를 만든다.
				JToolBar toolBar1 = new JToolBar();
				
				JButton newItem1 = new JButton("new Document");
				JButton openItem1 = new JButton("Open");
				JButton closeItem1 = new JButton("Exit");
				
				// 툴바를 JFrame에 붙인다. 초기 툴바의 위치는 상단 북쪽에 둔다. 동서남북,중앙 중에서 지정한다.
				add(toolBar1, BorderLayout.NORTH);
				
				// 툴바 아이템 3개를 툴바에 붙여준다. 분리선도 추가했다.
				toolBar1.add(newItem1);
				toolBar1.add(openItem1);
				toolBar1.addSeparator(new Dimension(20,10)); // 분리선
				toolBar1.add(closeItem1);
				
				JLabel lbl1 = new JLabel("여기 이 글자가 바뀐다고 이새끼들아!");
				this.add(lbl1);
				
				
				// 3개의 버튼 리스너를 만든다.
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
