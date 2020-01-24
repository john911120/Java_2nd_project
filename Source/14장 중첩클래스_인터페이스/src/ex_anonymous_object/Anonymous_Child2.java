package ex_anonymous_object;
	/*
	 	익명 자식 객체 생성 클래스
	  	작성일 : 1226
	 */


public class Anonymous_Child2 {

	public static void main(String[] args) {
		Anonymous_Child1 anony = new Anonymous_Child1();
		// 익명 객체 필드 사용
		anony.field.wake();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
				new Parent() {
					void study() {
						System.out.println("학교 등교");
					}

					@Override
					void wake() {
						System.out.println("8시에 기상한다.");
						study();
					}
					
				}
			);
	}
}