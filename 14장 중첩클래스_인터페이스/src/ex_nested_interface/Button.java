package ex_nested_interface;

/*
 * ��ø �������̽�(�������̽� Ÿ������ �ʵ带 �����ϰ� 
 * setter �޼ҵ�� ���� ��ü�� �ٴ缭 �ʵ忡 ����)
 * �ۼ��� : 1225 
 */
public class Button {
	// interface type field
	OnClickListener listener;
	
	// �Ű� ������ ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	// ���� ��ü�� onClick() �޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}
	
	//��ø �������̽�
	interface OnClickListener{
		void onClick();
	}
}
