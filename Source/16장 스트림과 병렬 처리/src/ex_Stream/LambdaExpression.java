package ex_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	  	람다식을 활용하여서 요소처리를 하는 방식
	  	- 스트림을 얻어와서
	  	- List컬렉션에서 Student를 가져와 람다식의 매개값으로 제공한다.
	  	작성일 : 0106
	 */

public class LambdaExpression {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("시명이", 70),
				new Student("두하니", 80)
				);
		
		Stream<Student>	stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}
