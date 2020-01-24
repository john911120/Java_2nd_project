package ex_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

	/*
	 * 학생 성별로 그룹핑을 한다.
	 * 작성일 : 0109
	 */

public class GroupingByExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("시명이", 20, Student.Sex.Male, Student.City.Seoul),
				new Student("애기보살", 24, Student.Sex.Female, Student.City.Suwon),
				new Student("두하니", 29, Student.Sex.Male, Student.City.Seoul),
				new Student("설향", 25, Student.Sex.Female, Student.City.Suwon)
				);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
					.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.print("[남학생]");
		mapBySex.get(Student.Sex.Male).stream()
			.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.print("\n[여학생]");
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
		
		System.out.print("\n[서울]");
		mapByCity.get(Student.City.Seoul).stream().forEach(s->System.out.print(s + " "));
		
		System.out.print("\n[수원]");
		mapByCity.get(Student.City.Suwon).stream().forEach(s->System.out.print(s + " "));
	}

}
