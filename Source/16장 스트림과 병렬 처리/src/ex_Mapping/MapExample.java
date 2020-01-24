package ex_Mapping;

import java.util.Arrays;
import java.util.List;

/*
	  	�ٸ� ��ҷ� ��ü�ϴ� ����
	  	- �л� ����Ʈ���� �л��� ������ ��ҷ� �ϴ� ���ο� ��Ʈ���� ����
	  	- ������ ���������� �ֿܼ� ����Ѵ�.
	  	�ۼ��� : 0107
	 */

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("�ø���", 30),
				new Student("���ϴ�", 40),
				new Student("�����̼� ���", 99999)
				);
				
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}
}
