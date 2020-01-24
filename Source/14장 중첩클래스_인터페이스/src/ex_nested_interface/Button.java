package ex_nested_interface;

/*
 * 중첩 인터페이스(인터페이스 타입으로 필드를 선언하고 
 * setter 메소드로 구현 객체를 바당서 필드에 대입)
 * 작성일 : 1225 
 */
public class Button {
	// interface type field
	OnClickListener listener;
	
	// 매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	// 구현 객체의 onClick() 메소드 호출
	void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}
}
