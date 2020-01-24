package sect1;

import javax.swing.JFrame;

// Swing GUI프로그램 기본 구조 틀

public class Basic_Window {
	// JFrame을 상속 받는 클래스 생성
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼을 누르면 프로그램 종료
			
			setTitle("Swing 기본창"); // 프로그램 제목넣기 생략 가능
			
			// 버튼, 레이블, 체크박스 코딩 부분
			
			
			setSize(500, 500); // 크기 설정
			setVisible(true); // 프로그램이 보이게 한다.
		}
	}
	
	
	public static void main(String[] args) {
		// main메소드에서 MyGUI클래스를 만든다. 
		// MyGUI()생성자가 실행되므로 프로그램이 실행된다.
		new MyGUI();
	}

}
