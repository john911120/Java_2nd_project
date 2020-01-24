package ex_nested_class;
/*
  	중첩 클래스 작성 예제
  	작성일 : 1225
*/

/*
	(바깥 필드와 메소드에서 사용 제한하는 메소드)
	작성일 : 1225
*/

class A {
	A() {System.out.println("A 객체 생성"); }
	
	// 인스턴스 필드 //
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드 //
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화 //
	//static B field3 = new B(); <- 에러 발생
	static C field4 = new C();
	
	// 정적 메소드 //
	static void method2() {
		// B var1 = new B(); <- 에러 발생
		C var2 = new C();
	}
	
	
	// 인스턴스 영역 클래스 //
	class B {
		B() { System.out.println("B 객체 생성"); }
		int field1;
		void method1() {}
	}
	
	// 정적 멤버 클래스 //
	static class C {
		C() {System.out.println("C 객체 생성"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// 로컬 클래스 //
		class D {
			D() {System.out.println("D 객체 생성"); }
			int field1;
			void method1() { }
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}




