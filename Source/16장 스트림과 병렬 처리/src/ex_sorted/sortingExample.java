package ex_sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
	  	���� ����
	  	- ���ڸ� ������������ �����Ѵ�.
	  	�ۼ��� : 0107
	 */

public class sortingExample {

	public static void main(String[] args) {
		// ���� ����� ���
		IntStream intStream = Arrays.stream(new int[] {8, 3, 5, 1, 6});
		intStream
			.sorted()
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		// ��ü ����� ���
		List<Student> studentList = Arrays.asList(
				new Student("�ÿ�", 999),
				new Student("�����̼�", 99990),
				new Student("������", 3800)
				);
		// ������ �������� ������������ Student ����
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		// ������ �������� ������������ Student ����
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.print(s.getScore() + ","));
	}

}
