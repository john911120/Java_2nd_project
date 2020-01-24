package ex_anonymous_object;

	/*
	  	�͸� �ڽ� ��ü ����� - 1
	  	�ۼ��� : 1226
	 */

public class Anonymous_Child1 {
	// �ʵ� �ʱⰪ���� �����ϱ�
		Parent field = new Parent() {
			void work() {
				System.out.println("��ħ�");
			}
			@Override
			void wake()  {
				System.out.println("5�ÿ� ���");
				work();
			}
		};
	
		void method1() {
	// ���� ���������� �����ϱ�
	Parent localVar = new Parent() {
		void walk() {
			System.out.println("����غ�");
		}
		@Override
		void wake()  {
			System.out.println("6�ÿ� ���");
			walk();
		}
	};
	// ���� ���� ����ϱ�
		localVar.wake();
		}
	void method2(Parent parent) {
		parent.wake();
	}
}