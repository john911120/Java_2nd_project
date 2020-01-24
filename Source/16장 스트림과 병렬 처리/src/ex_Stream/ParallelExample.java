package ex_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	/*
	  	���� ó�� ����
	  	- ���� ó���� ���� ó�� ����� ������ �ۼ�
	  	- �� ó�� �ڵ� �׸��� �޼ҵ带 ����
	  	�ۼ��� : 0106
	 */
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"�ø���", "���ϴ�", "������",
				"���û�", "������");
		
		// ���� ó��
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		System.out.println();
		
		// ���� ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}
	public static void print(String str ) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
