package ex_anonymous_object;
	/*
	 	�͸� �ڽ� ��ü ���� Ŭ����
	  	�ۼ��� : 1226
	 */


public class Anonymous_Child2 {

	public static void main(String[] args) {
		Anonymous_Child1 anony = new Anonymous_Child1();
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		// �͸� ��ü ���� ���� ���
		anony.method1();
		// �͸� ��ü �Ű��� ���
		anony.method2(
				new Parent() {
					void study() {
						System.out.println("�б� �");
					}

					@Override
					void wake() {
						System.out.println("8�ÿ� ����Ѵ�.");
						study();
					}
					
				}
			);
	}
}