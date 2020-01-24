package ex_Filltering;

import java.util.*;

/*
	  	필터링 예제
	  	- 이름 리스트에서 중복된 이름을 제거하고 출력하며
	  	- 특정 이름의 성이 심 이라는 이름만 필터링하는 기능을 넣었다.
	  	작성일 : 0106
	 */

public class FillteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("시명이", "심영", "두하니", "김두한", "심영의 어머니");
		
		// 리스트의 중복값 제거
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 리스트의 필터링
		names.stream()
			.filter(n -> n.startsWith("심"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 중복 제거 후 필터링
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("심"))
			.forEach(n -> System.out.println(n));
	}

}
