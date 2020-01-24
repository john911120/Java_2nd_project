package ex_sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
	  	정렬 예제
	  	- 숫자를 오름차순으로 정렬한다.
	  	작성일 : 0107
	 */

public class sortingExample {

	public static void main(String[] args) {
		// 숫자 요소인 경우
		IntStream intStream = Arrays.stream(new int[] {8, 3, 5, 1, 6});
		intStream
			.sorted()
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		// 객체 요소인 경우
		List<Student> studentList = Arrays.asList(
				new Student("궁예", 999),
				new Student("나레이션", 99990),
				new Student("상하이", 3800)
				);
		// 정수를 기준으로 오름차순으로 Student 정렬
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		// 정수를 기준으로 내림차순으로 Student 정렬
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.print(s.getScore() + ","));
	}

}
