package ex_Mapping;

import java.util.Arrays;
import java.util.List;

/*
	  	다른 요소로 대체하는 예제
	  	- 학생 리스트에서 학생의 점수를 요소로 하는 새로운 스트림을 생성
	  	- 점수를 순차적으로 콘솔에 출력한다.
	  	작성일 : 0107
	 */

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("시명이", 30),
				new Student("두하니", 40),
				new Student("나레이션 양반", 99999)
				);
				
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}
}
