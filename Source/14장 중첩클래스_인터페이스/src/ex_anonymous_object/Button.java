package ex_anonymous_object;

	/*
	  	UI class
	  	작성일 : 1226
	 */

public class Button {
	// interface type build
	OnClickListener listener;

	// 매개변수의 다형성
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		// 구현 객체의 onClick()메소드 불러오기
		listener.onClick();
	}
	// 중첩 인터페이스
	interface OnClickListener {
		void onClick();
	}
}
