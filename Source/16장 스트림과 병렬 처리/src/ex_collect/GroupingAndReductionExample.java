package ex_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

	/*
	 * 학생 성별로 그룹핑이 완료된 다음 리덕션 작업 처리하기
	 * - 성별로 평균 점수를 저장하는 Map을 얻어오기
	 * - 성별을 쉼표로 구분한 이름을 저장하는 Map을 얻기
	 * 작성일 : 0109
	 */

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("시명이", 20, Student.Sex.Male, Student.City.Seoul),
				new Student("애기보살", 24, Student.Sex.Female, Student.City.Suwon),
				new Student("두하니", 29, Student.Sex.Male, Student.City.Seoul),
				new Student("설향", 25, Student.Sex.Female, Student.City.Suwon)
				);
		
		
		// 성별로 평균 점수를 저장하는 Map을 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
					.collect(Collectors.groupingBy(
							Student :: getSex,
							Collectors.averagingDouble(Student :: getScore)
							)
						);
		
		System.out.println("남학생의 평균 점수 : " + mapBySex.get(Student.Sex.Male));
		System.out.println("여학생의 평균 점수 : " + mapBySex.get(Student.Sex.Female));
		
		// 성별을 쉼표로 구분한 이름을 저장하는 Map을 얻는다.
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student::getSex,
								Collectors.mapping(
										Student::getName,
										Collectors.joining(","))
								)
				);
		
		System.out.println("남학생의 전체 이름 : " + mapByName.get(Student.Sex.Male));
		System.out.println("여학생의 전체 이름 : " + mapByName.get(Student.Sex.Female));
	}

}
