package ex_Stream_Things;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
		�迭���κ��� ��Ʈ�� ������
		- String[]�� int[] �迭���� ���� ��Ʈ���� ���� �ܼ� ����ϱ�
		�ۼ��� : 0106
	*/

public class FromArrayExample {

	public static void main(String[] args) {
		// String[]
		String[] strArray = {"������", "�ҹ����", "X���" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		// int[]
		int[] intArray = {10, 20, 30, 40, 50};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
	}

}
