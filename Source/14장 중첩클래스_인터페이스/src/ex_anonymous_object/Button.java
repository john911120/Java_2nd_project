package ex_anonymous_object;

	/*
	  	UI class
	  	�ۼ��� : 1226
	 */

public class Button {
	// interface type build
	OnClickListener listener;

	// �Ű������� ������
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		// ���� ��ü�� onClick()�޼ҵ� �ҷ�����
		listener.onClick();
	}
	// ��ø �������̽�
	interface OnClickListener {
		void onClick();
	}
}
