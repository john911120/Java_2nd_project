package ex_nested_class;

/*
 * ��ø Ŭ�������� �ٱ� Ŭ���� ���� ���(���� Ŭ����)
 * �ۼ��� : 1225
 */

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
