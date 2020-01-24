package ex_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	/*
	  	병렬 처리 예제
	  	- 순차 처리와 병렬 처리 방식의 구조로 작성
	  	- 각 처리 코드 항목의 메소드를 참조
	  	작성일 : 0106
	 */
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"시명이", "두하니", "빡빡이",
				"장택상", "상하이");
		
		// 순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		System.out.println();
		
		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}
	public static void print(String str ) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
