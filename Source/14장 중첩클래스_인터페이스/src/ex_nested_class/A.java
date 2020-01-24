package ex_nested_class;
/*
  	��ø Ŭ���� �ۼ� ����
  	�ۼ��� : 1225
*/

/*
	(�ٱ� �ʵ�� �޼ҵ忡�� ��� �����ϴ� �޼ҵ�)
	�ۼ��� : 1225
*/

class A {
	A() {System.out.println("A ��ü ����"); }
	
	// �ν��Ͻ� �ʵ� //
	B field1 = new B();
	C field2 = new C();
	
	// �ν��Ͻ� �޼ҵ� //
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// ���� �ʵ� �ʱ�ȭ //
	//static B field3 = new B(); <- ���� �߻�
	static C field4 = new C();
	
	// ���� �޼ҵ� //
	static void method2() {
		// B var1 = new B(); <- ���� �߻�
		C var2 = new C();
	}
	
	
	// �ν��Ͻ� ���� Ŭ���� //
	class B {
		B() { System.out.println("B ��ü ����"); }
		int field1;
		void method1() {}
	}
	
	// ���� ��� Ŭ���� //
	static class C {
		C() {System.out.println("C ��ü ����"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// ���� Ŭ���� //
		class D {
			D() {System.out.println("D ��ü ����"); }
			int field1;
			void method1() { }
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}




