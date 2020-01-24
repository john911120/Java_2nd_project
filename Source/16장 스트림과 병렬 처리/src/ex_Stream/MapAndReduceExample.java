package ex_Stream;

import java.util.Arrays;
import java.util.List;

/*
	  	�߰� ó���� ���� ó��
	  	- List�� ����Ǿ� �ִ� Student ��ü�� �߰� ó������ score�ʵ� �� ����
	  	- ���� ó������ score�� ��հ��� �����Ѵ�.
	  	�ۼ��� : 0106
	 */

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("�ø���", 10),
				new Student("���ϴ�", 20),
				new Student("������", 30)
				);
		
		double avg = studentList.stream()
		// �߰� ó��(�л� ��ü�� ������ �����ϱ�)
		.mapToInt(Student :: getScore)
		// ���� ó��(��� ����)
		.average()
		.getAsDouble();
		
		System.out.println("��� ���� : " + avg);
	}

}
