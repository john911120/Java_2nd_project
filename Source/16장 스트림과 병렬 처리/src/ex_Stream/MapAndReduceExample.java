package ex_Stream;

import java.util.Arrays;
import java.util.List;

/*
	  	중간 처리와 최종 처리
	  	- List에 저장되어 있는 Student 객체를 중간 처리에서 score필드 값 매핑
	  	- 최종 처리에서 score의 평균값을 산출한다.
	  	작성일 : 0106
	 */

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("시명이", 10),
				new Student("두하니", 20),
				new Student("상하이", 30)
				);
		
		double avg = studentList.stream()
		// 중간 처리(학생 객체를 점수로 매핑하기)
		.mapToInt(Student :: getScore)
		// 최종 처리(평균 점수)
		.average()
		.getAsDouble();
		
		System.out.println("평균 점수 : " + avg);
	}

}
