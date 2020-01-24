package ex_nested_class;

/*
  	로컬 클래스에서의 사용제한
  	작성일 : 1225
  	자바 7까지는 반드시 final키워드를 붙여야하는데 8버전부터는 키워드를 붙이지 않아도 된다.
 */


/*
  	중첩 클래스에서 바깥 클래스 참조 얻기
  	작성일 : 1225
 */

public class Outter {
	
	/*

	// java 7 version
	public void method1(final int arg) {
		final int localVariable = 1;
		 //arg = 100;
		 //localVariable = 100;
		
		class inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	//java 8 version
	public void method2(int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		
		class inner {
			public void method() {
				int result = arg + localVariable;
			}
		}	
	}
}
*/
	String field = "Outter-Field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-method";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// 중첩 객체 참조
			System.out.println(this.field);
			this.method();
			// 바깥 객체 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}