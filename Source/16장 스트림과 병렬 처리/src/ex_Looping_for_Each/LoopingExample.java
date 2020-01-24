package ex_Looping_for_Each;

import java.util.Arrays;

/*
	  	���� ����
	  	- forEach�޼ҵ�� ��Ҹ� �Һ��ϴ� ���� ó�� �޼ҵ��
	  	- sum�޼ҵ�� ���� �ٸ� ���� �޼ҵ带 ȣ���ϸ� �ȵȴ�.
	  	�ۼ��� : 0107	 	
	 */

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.peek(n -> System.out.println(n)); // �������� �ʴ´�.
		
		System.out.println("[���� ó�� �޼ҵ带 �������� ȣ���� ���]");
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n)) // ����
				.sum(); // ���� �޼ҵ�
		System.out.println("���� : " + total);
		
		System.out.println("[forEach()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.forEach(n -> System.out.println(n));
		
	}

}
