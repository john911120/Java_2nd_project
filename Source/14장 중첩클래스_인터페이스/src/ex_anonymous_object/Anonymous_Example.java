package ex_anonymous_object;
	/*
	 	�͸� ���� Ŭ������ ��ü ����
	  	�ۼ��� : 1226
	 */


public class Anonymous_Example {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();
		// �͸� ��ü ���� ���� ���
		anony.method1();
		// �͸� ��ü �Ű��� ���
		anony.method2(
				// �Ű���
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("UHDTV�� �մϴ�.");
					}

					@Override
					public void turnOff() {
						System.out.println("UHDTV�� ���ϴ�.");
					}
				}
			);
	}
}