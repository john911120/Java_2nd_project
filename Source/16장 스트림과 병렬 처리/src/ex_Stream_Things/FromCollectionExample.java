package ex_Stream_Things;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	  	컬렉션으로부터 스트림을 얻어오기
	 	- List<Student> 컬렉션에서 Stream<Student>를 얻어오고
	 	- 요소를 콘솔로 출력하기
	 	작성일 : 0106
	 */

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("시명이", 20),
				new Student("두하니", 30),
				new Student("고자총", 40)
				);
		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println(s.getName()));
	}

}
