package ex_Stream_Things;

import java.util.stream.IntStream;

/*
	  	���� ������ ���� ��Ʈ�� ���
	  	- 1���� 100������ ���� ���ϱ� 
	  	- IntStream�� rangeClosed()�� ����Ͽ��� ù��° �Ű������� ���� 
	  	- �� ��° ������ ���������� �����ϴ� IntStram�� �����Ѵ�.
	  	- range()�޼ҵ嵵 �����ϰ� ���������� �ι�° �Ű����� ���Ե��� �ʴ´�.
	  	�ۼ��� : 0106
	 */

public class FromIntRangeExample {
	public static int sum;
		
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("���� : " + sum);
	}

}
