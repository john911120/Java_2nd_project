package ex_nested_interface;

/*
 * 버튼을 눌렀을 때 이벤트를 처리하는 방법 2가지
 * 어떤 구현 객체를 생성해서 Button객체의 setOnClickListener() 메소드로 세팅 여부에 따라
 * Button의 touch() 메소드의 실행결과가 달라진다.
 * 작성일 : 1225
 */

public class Button_Example {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
