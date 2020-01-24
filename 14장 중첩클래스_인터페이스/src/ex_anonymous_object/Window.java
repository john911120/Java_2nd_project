package ex_anonymous_object;

	/*
	  	UI Class
	  	작성일 : 1226
	 */

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입하기 (필드 선언과 초기값 대입하기)
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화 걸기");
		}
	};
	
	Window(){
		// 매개값으로 필드에 대입하기
		button1.SetOnClickListener(listener);
		// 매개값으로 익명 구현 객체 대입하기
		button2.SetOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지 보내기");
			}
		});
	}
}
