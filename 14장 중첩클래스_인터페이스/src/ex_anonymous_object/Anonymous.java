package ex_anonymous_object;

	/*
	  	익명 구현 클래스와 객체 만들기
	  	작성일 : 1226
	 */

public class Anonymous {
	// 필드 초기값으로 대입하기
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV전원을 켠다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV전원을 끈다.");
		}
	};
		void method1() {
	// 로컬 변수값으로 대입하기
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("컴퓨터 시스템 가동");
			}
			@Override
			public void turnOff() {
				System.out.println("컴퓨터 시스템 종료");
			}
		};
	// 로컬 변수 사용하기
	localVar.turnOn();
}
		void method2(RemoteControl rc) {
			rc.turnOn();
		}
}