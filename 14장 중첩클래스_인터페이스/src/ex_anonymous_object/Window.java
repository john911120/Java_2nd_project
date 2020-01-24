package ex_anonymous_object;

	/*
	  	UI Class
	  	�ۼ��� : 1226
	 */

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// �ʵ� �ʱⰪ���� �����ϱ� (�ʵ� ����� �ʱⰪ �����ϱ�)
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ �ɱ�");
		}
	};
	
	Window(){
		// �Ű������� �ʵ忡 �����ϱ�
		button1.SetOnClickListener(listener);
		// �Ű������� �͸� ���� ��ü �����ϱ�
		button2.SetOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽��� ������");
			}
		});
	}
}
