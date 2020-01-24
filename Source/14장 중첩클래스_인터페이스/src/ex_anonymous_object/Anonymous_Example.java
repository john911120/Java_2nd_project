package ex_anonymous_object;
	/*
	 	익명 구현 클래스와 객체 생성
	  	작성일 : 1226
	 */


public class Anonymous_Example {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.turnOn();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
				// 매개값
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("UHDTV를 켭니다.");
					}

					@Override
					public void turnOff() {
						System.out.println("UHDTV를 끕니다.");
					}
				}
			);
	}
}