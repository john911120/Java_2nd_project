package ex_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

	/*
	 * �л� ������ �׷����� �Ϸ�� ���� ������ �۾� ó���ϱ�
	 * - ������ ��� ������ �����ϴ� Map�� ������
	 * - ������ ��ǥ�� ������ �̸��� �����ϴ� Map�� ���
	 * �ۼ��� : 0109
	 */

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("�ø���", 20, Student.Sex.Male, Student.City.Seoul),
				new Student("�ֱ⺸��", 24, Student.Sex.Female, Student.City.Suwon),
				new Student("���ϴ�", 29, Student.Sex.Male, Student.City.Seoul),
				new Student("����", 25, Student.Sex.Female, Student.City.Suwon)
				);
		
		
		// ������ ��� ������ �����ϴ� Map�� ���
		Map<Student.Sex, Double> mapBySex = totalList.stream()
					.collect(Collectors.groupingBy(
							Student :: getSex,
							Collectors.averagingDouble(Student :: getScore)
							)
						);
		
		System.out.println("���л��� ��� ���� : " + mapBySex.get(Student.Sex.Male));
		System.out.println("���л��� ��� ���� : " + mapBySex.get(Student.Sex.Female));
		
		// ������ ��ǥ�� ������ �̸��� �����ϴ� Map�� ��´�.
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student::getSex,
								Collectors.mapping(
										Student::getName,
										Collectors.joining(","))
								)
				);
		
		System.out.println("���л��� ��ü �̸� : " + mapByName.get(Student.Sex.Male));
		System.out.println("���л��� ��ü �̸� : " + mapByName.get(Student.Sex.Female));
	}

}
