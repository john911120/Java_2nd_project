package ex_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
	  	필터링해서 새로운 컬렉션을 만든다.
	  	- 학생들의 성별을 묶어서 List를 생성한다.
	  	작성일 : 0109
	 */

public class ToListExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("시명이", 20, Student.Sex.Male),
				new Student("애기보살", 24, Student.Sex.Female),
				new Student("두하니", 29, Student.Sex.Male),
				new Student("설향", 25, Student.Sex.Female)
				);
		// 남학생만 묶어서 List를 만든다.
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.Male)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// 여학생만 묶어서 HashSet를 만든다.
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.Female)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
