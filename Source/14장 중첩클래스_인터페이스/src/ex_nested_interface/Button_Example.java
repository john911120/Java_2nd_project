package ex_nested_interface;

/*
 * ��ư�� ������ �� �̺�Ʈ�� ó���ϴ� ��� 2����
 * � ���� ��ü�� �����ؼ� Button��ü�� setOnClickListener() �޼ҵ�� ���� ���ο� ����
 * Button�� touch() �޼ҵ��� �������� �޶�����.
 * �ۼ��� : 1225
 */

public class Button_Example {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
