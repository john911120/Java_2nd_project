package ex_nested_class;
/*
	��� Ŭ�������� ��������ϱ�
	�ۼ��� : 1225
*/
public class A_Prohibited {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			// ��� ����� �޼ҵ忡 ������ �����ϴ�.
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			/*
			// �ν��Ͻ� �ʵ�� �޼ҵ�� ������ �ȵȴ�.(������ �߻��Ѵ�.)
			field1 = 10;
			method1();
			*/
			
			field2 = 10;
			method2();
		}
	}
}
