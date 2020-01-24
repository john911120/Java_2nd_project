package ex_anonymous_object;

	/*
	  	�͸� ���� Ŭ������ ��ü �����
	  	�ۼ��� : 1226
	 */

public class Anonymous {
	// �ʵ� �ʱⰪ���� �����ϱ�
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV������ �Ҵ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV������ ����.");
		}
	};
		void method1() {
	// ���� ���������� �����ϱ�
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("��ǻ�� �ý��� ����");
			}
			@Override
			public void turnOff() {
				System.out.println("��ǻ�� �ý��� ����");
			}
		};
	// ���� ���� ����ϱ�
	localVar.turnOn();
}
		void method2(RemoteControl rc) {
			rc.turnOn();
		}
}