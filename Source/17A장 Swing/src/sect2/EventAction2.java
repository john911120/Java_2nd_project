package sect2;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

/*
	 	마우스 클릭 할 때 좌표가 필드에 채워지는 프로그램 작성
	 	작성일 : 0116
	 */

public class EventAction2 {
	static class MyGUI extends JFrame{
		MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마우스 이벤트 처리2");
		
		this.setLayout(new FlowLayout());
		
		// x,y좌표가 채워질 텍스트 필드를 준비한다.
		JTextField txtX = new JTextField(10);
		JTextField txtY = new JTextField(10);
		this.add(txtX);
		this.add(txtY);
		
		// 마우스 이벤트의 리스너를 JFrame(=this)에 부착한다.
		/*
		  mouseClicked메소드는 마우스를 클릭하면 수행된다. 
		  e의 getX()는 클릭한 시점의 x좌표를 반환한다. 이 값을 텍스트 필드에 문자열로 사용했다.
		  나머지 마우스 관련 메소드도 MouseListener 인터페이스의 추상 메소드이므로 코딩을 해야하는데
		  내용은 비어 있어도 상관 없다.
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

