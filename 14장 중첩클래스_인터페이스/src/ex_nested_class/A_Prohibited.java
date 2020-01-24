package ex_nested_class;
/*
	멤버 클래스에서 사용제한하기
	작성일 : 1225
*/
public class A_Prohibited {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			// 모든 빌드와 메소드에 접근이 가능하다.
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			/*
			// 인스턴스 필드와 메소드는 접근이 안된다.(에러가 발생한다.)
			field1 = 10;
			method1();
			*/
			
			field2 = 10;
			method2();
		}
	}
}
