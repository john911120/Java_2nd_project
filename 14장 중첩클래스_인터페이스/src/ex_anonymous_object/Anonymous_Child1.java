package ex_anonymous_object;

	/*
	  	익명 자식 객체 만들기 - 1
	  	작성일 : 1226
	 */

public class Anonymous_Child1 {
	// 필드 초기값으로 대입하기
		Parent field = new Parent() {
			void work() {
				System.out.println("아침운동");
			}
			@Override
			void wake()  {
				System.out.println("5시에 기상");
				work();
			}
		};
	
		void method1() {
	// 로컬 변수값으로 대입하기
	Parent localVar = new Parent() {
		void walk() {
			System.out.println("출근준비");
		}
		@Override
		void wake()  {
			System.out.println("6시에 기상");
			walk();
		}
	};
	// 로컬 변수 사용하기
		localVar.wake();
		}
	void method2(Parent parent) {
		parent.wake();
	}
}