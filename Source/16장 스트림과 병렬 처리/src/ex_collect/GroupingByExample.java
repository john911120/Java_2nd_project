package ex_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

	/*
	 * �л� ������ �׷����� �Ѵ�.
	 * �ۼ��� : 0109
	 */

public class GroupingByExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("�ø���", 20, Student.Sex.Male, Student.City.Seoul),
				new Student("�ֱ⺸��", 24, Student.Sex.Female, Student.City.Suwon),
				new Student("���ϴ�", 29, Student.Sex.Male, Student.City.Seoul),
				new Student("����", 25, Student.Sex.Female, Student.City.Suwon)
				);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
					.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.print("[���л�]");
		mapBySex.get(Student.Sex.Male).stream()
			.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.print("\n[���л�]");
		mapBySex.get(Student.Sex.Female).stream()
			.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student::getCity,
								Collectors.mapping(Student::getName, Collectors.toList())
								)
				);
		
		System.out.print("\n[����]");
		mapByCity.get(Student.City.Seoul).stream().forEach(s->System.out.print(s + " "));
		
		System.out.print("\n[����]");
		mapByCity.get(Student.City.Suwon).stream().forEach(s->System.out.print(s + " "));
	}

}
