package ex_nested_class;

/*
  	���� Ŭ���������� �������
  	�ۼ��� : 1225
  	�ڹ� 7������ �ݵ�� finalŰ���带 �ٿ����ϴµ� 8�������ʹ� Ű���带 ������ �ʾƵ� �ȴ�.
 */


/*
  	��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
  	�ۼ��� : 1225
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
			// ��ø ��ü ����
			System.out.println(this.field);
			this.method();
			// �ٱ� ��ü ����
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}