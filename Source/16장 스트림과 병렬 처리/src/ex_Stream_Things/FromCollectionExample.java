package ex_Stream_Things;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	  	�÷������κ��� ��Ʈ���� ������
	 	- List<Student> �÷��ǿ��� Stream<Student>�� ������
	 	- ��Ҹ� �ַܼ� ����ϱ�
	 	�ۼ��� : 0106
	 */

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("�ø���", 20),
				new Student("���ϴ�", 30),
				new Student("������", 40)
				);
		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println(s.getName()));
	}

}
