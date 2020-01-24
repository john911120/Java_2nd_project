package ex_reduce;

import java.util.Arrays;
import java.util.List;

/*
		reduce() 예제
		- 기본 집계 메소드에서 다양한 집계 결과물을 만드는 메소드
		- 각 인터페이스에는 매개타입으로 XXXOperator, 리턴타입 OptionalXXX
		- int, long, double을 가지는 reduce()가 오버로딩되어있다.
		- 스트림에 요소가 전혀 없을 경우 디폴트 값인 identity 매개값이 리턴된다.
		- sum()을 이용하고
		- reduce(BinaryOperator<Integer>ac)이용		
		- reduce(int identify, IntBinaryOperator op) 이용
		작성일 : 0108
	*/

public class ReductionExample {

	public static void main(String[] args) {
		// 학생 관련 리스트 작성하기
		List<Student> studentList = Arrays.asList(
				new Student("두하니", 44),
				new Student("시명이", 55),
				new Student("빡빡이", 66)
				);
		
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();
		
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a, b) -> a + b)
				.get();
				
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a + b );
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
		System.out.println("sum3 : " + sum3);
	}

}
